package za.co.thinking.security.service.impl;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.mindrot.jbcrypt.BCrypt;
import za.co.thinking.dto.UserDto;
import za.co.thinking.model.dao.impl.UserDao;
import za.co.thinking.security.service.IUserService;
import za.co.thinking.security.service.util.EntityMapper;

/**
 * File Name : UserService.java Project Name : MainThinkify-ejb
 *
 * @since Dec 20, 2016, 10:30:11 AM
 * @author Abel Chavanga <achavanga@gmail.com>
 *
 */
@Stateless
//@Local(IUserService.class)
public class UserService implements IUserService {

    @Inject
    private UserDao userDao;

    private static String generatePasswordHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }

    @Override
    public List<UserDto> getAllUsers() {

        return EntityMapper.mapUsers(userDao.findAll());

    }

    @Override
    public void saveUser(UserDto user) {
        user.setPassword(generatePasswordHash(user.getPassword()));
        userDao.create(EntityMapper.mapUserDto(user));
    }

    @Override
    public UserDto findByEmail(String email) {
        return EntityMapper.mapUser(userDao.findByEmail(email));
    }

    @Override
    public UserDto findById(Long id) {
        return EntityMapper.mapUser(userDao.findById(id));
    }

    @Override
    public UserDto logIn(String username, String password) {

        UserDto userDto = EntityMapper.mapUser(userDao.findByUserName(username));
        if (userDto != null) {
            if (BCrypt.checkpw(password, userDto.getPassword())) {
                userDto.setPassword("");
                userDto.setConfirmedPassword("");
                return userDto;
            }
        }
        return null;

    }

}
