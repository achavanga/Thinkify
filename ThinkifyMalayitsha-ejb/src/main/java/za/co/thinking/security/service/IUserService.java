package za.co.thinking.security.service;


import java.util.List;
import javax.ejb.Local;
import za.co.thinking.dto.UserDto;

/**
 * File Name : IUserService.java Project Name : MainThinkify-ejb
 *
 * @since Dec 20, 2016, 10:29:25 AM
 * @author Abel Chavanga <achavanga@gmail.com>
 *
 */
@Local
public interface IUserService {

    List<UserDto> getAllUsers();

    void saveUser(UserDto user);

    UserDto findByEmail(String email);
    
    UserDto findById(Long id);
    
    UserDto logIn(String username, String password);
}
