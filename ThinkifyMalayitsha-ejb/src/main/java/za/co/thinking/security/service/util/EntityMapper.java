/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.thinking.security.service.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import za.co.thinking.dto.AddressDto;
import za.co.thinking.dto.PersonDto;
import za.co.thinking.dto.UserDto;
import za.co.thinking.dto.UserRoleDto;
import za.co.thinking.model.security.Person;
import za.co.thinking.model.security.User;
import za.co.thinking.model.security.UserRole;
import za.co.thinking.model.security.contact.Address;

/**
 *
 * @author achavanga
 */
public class EntityMapper {

    /*
    * Map DTO to Entity
     */
    public static User mapUserDto(UserDto userDto) {
        User entity = (User) GenericTransformer.transform(userDto, User.class);
        entity.setPerson(mapPersonDto(userDto.getPerson()));
//        entity.setUserRole(mapUserRoleDto(userDto.getUserRole()));
        return entity;
    }

    public static List<User> mapUserDtos(List<UserDto> userDtos) {
        List<User> users = null;
        if (!userDtos.isEmpty()) {
            users = new ArrayList<>();
            for (UserDto userDto : userDtos) {
                User user = (User) GenericTransformer.transform(userDto, User.class);
                users.add(user);
            }
        }

        return users;
    }

    public static Person mapPersonDto(PersonDto personDto) {
        Person entity = (Person) GenericTransformer.transform(personDto, Person.class);
        entity.setAddresses(mapAddressesDto(personDto.getAddresses()));
        return entity;
    }

    public static Address mapAddressDto(AddressDto addressDto) {
        Address address = (Address) GenericTransformer.transform(addressDto, Address.class);
        return address;
    }

    public static Set<Address> mapAddressesDto(Set<AddressDto> addressDtos) {
        Set<Address> addresses = null;
        if (!addressDtos.isEmpty()) {
            addresses = new HashSet<>();
            for (AddressDto addressDto : addressDtos) {
                Address address = (Address) GenericTransformer.transform(addressDto, Address.class);
                addresses.add(address);
            }
        }

        return addresses;
    }

    public static UserRole mapUserRoleDto(UserRoleDto userRoleDto) {
        if (userRoleDto == null) {
            return null;
        }
        UserRole userRole = (UserRole) GenericTransformer.transform(userRoleDto, UserRole.class);
        return userRole;

    }

    /*
    * Map Entity to DTO 
     */
    public static UserDto mapUser(User entity) {
        UserDto dto = null;
        if (entity != null) {
            dto = (UserDto) GenericTransformer.transform(entity, UserDto.class);
            dto.setPerson(mapPerson(entity.getPerson()));
        }
//        dto.setUserRole(mapUserRole(entity.getUserRole()));
        return dto;
    }

    public static List<UserDto> mapUsers(List<User> users) {
        List<UserDto> userDtos = null;
        if (!users.isEmpty()) {
            users = new ArrayList<>();
            for (User user : users) {
                UserDto userDto = (UserDto) GenericTransformer.transform(user, UserDto.class);
                userDtos.add(userDto);
            }
        }

        return userDtos;
    }

    public static PersonDto mapPerson(Person entity) {
        PersonDto dto = (PersonDto) GenericTransformer.transform(entity, PersonDto.class);
        dto.setAddresses(mapAddresses(entity.getAddresses()));
        return dto;
    }

    public static AddressDto mapAddress(Address entity) {
        AddressDto dto = (AddressDto) GenericTransformer.transform(entity, AddressDto.class);
        return dto;
    }

    public static Set<AddressDto> mapAddresses(Set<Address> entity) {
        Set<AddressDto> addresses = null;
        if (!entity.isEmpty()) {
            addresses = new HashSet<>();
            for (Address address : entity) {
                AddressDto dto = (AddressDto) GenericTransformer.transform(address, AddressDto.class);
                addresses.add(dto);
            }
        }

        return addresses;
    }

    public static UserRoleDto mapUserRole(UserRole entity) {
        if (entity == null) {
            return null;
        }
        UserRoleDto dto = (UserRoleDto) GenericTransformer.transform(entity, UserRoleDto.class);
        return dto;
    }
}
