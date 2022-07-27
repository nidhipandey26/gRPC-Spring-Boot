package com.controller;


import com.nidhi.grpc.Userservice;
import com.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private ApiService apiService;

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(Userservice.UserReq user) {
      apiService.createUser(user);
    }

//    @PostMapping("/saveAll")
//    public List<User> saveUsers(@RequestBody List<User> users) {
//        return userService.saveOrUpdateUsers(users);
//    }

    @PutMapping("/update")
    public void updateUser(Userservice.UserReq userReq){
         apiService.updateUser(userReq);
    }

    @GetMapping("/{id}")
    public Userservice.UserRes getUserById(@PathVariable long id) {
        return apiService.findUserById(id);
    }

    @GetMapping("/users")
    public List<Userservice.UserRes> findAllUser() {
        return apiService.findAllUsers();
    }

    @GetMapping
    public List<Userservice.UserRes> search(Userservice.UserFilter userFilter){
        return apiService.findUserByFillter(userFilter);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id) {
      apiService.deletUserById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllUser() {
        apiService.deleteAllUsers();
    }
}
