//package com.example.test_march.services;
//
//import com.example.test_march.dao.UserDao;
//import com.example.test_march.dto.UserDto;
//import com.example.test_march.entity.User;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityNotFoundException;
//
//@Service
////@AllArgsConstructor
//@NoArgsConstructor
//public class UserService {
//
//    private  UserDao userDao;
//    private  PasswordEncoder passwordEncoder;
//
////    @Autowired
//    public UserService(UserDao userDao, PasswordEncoder passwordEncoder) {
//        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    //    public User getById(int id) {
////        return userDao.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
////    }
//    public User getById(int id) {
//        User user = userDao.findById(id);
//        if (user == null) {
//            throw new EntityNotFoundException("User not found with id " + id);
//        }
//        return user;
//    }
//
//    public User getByUsername(String username) {
//        return userDao.findByUsername(username);
//    }
//
//    public User create(UserDto userDto) {
//        User user = new User();
//        user.setUsername(userDto.getUsername());
//        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
//
//        return userDao.save(user);
//    }
//
//    public User update(int id, UserDto userDto) {
//        User user = getById(id);
//        user.setUsername(userDto.getUsername());
//        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
//
//        return userDao.save(user);
//    }
//
//    public void delete(int id) {
//        User user = getById(id);
//        userDao.delete(user);
//    }
//
//}
