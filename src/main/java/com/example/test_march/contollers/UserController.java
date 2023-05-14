//package com.example.test_march.contollers;
//
//import com.example.test_march.dto.UserDto;
//import com.example.test_march.entity.User;
//import com.example.test_march.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/{id}")
//    public User getById(@PathVariable int id) {
//        return userService.getById(id);
//    }
//
//    @GetMapping("/username/{username}")
//    public User getByUsername(@PathVariable String username) {
//        return userService.getByUsername(username);
//    }
//
//    @PostMapping
//    public User create(@RequestBody UserDto userDto) {
//        return userService.create(userDto);
//    }
//
//    @PutMapping("/{id}")
//    public User update(@PathVariable int id, @RequestBody UserDto userDto) {
//        return userService.update(id, userDto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable int id) {
//        userService.delete(id);
//    }
//
//}
//
