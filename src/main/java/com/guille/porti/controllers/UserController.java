package com.guille.porti.controllers;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guille.porti.models.User;
import com.guille.porti.service.UserService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
@RequestMapping (path = "/api/porti")
public class UserController {
    private final UserService userService;
    @GetMapping(value = "")
    public List<User> getAllUsers(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getfindById(@PathVariable Long id){
        return userService.findById(id);
    }
    @PostMapping(value = "add" , consumes = "application/json")
    public ResponseEntity<User> createPicture(@RequestBody User user){
        User saveUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
    }
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User userDetails){
        return userService.updatePicture(id, userDetails);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable long id){
        userService.deleteById(id);
        return ResponseEntity.ok("User deleted Successfully");
    }
}
