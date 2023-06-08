package com.apirest.controllers;

import com.apirest.domains.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

  @GetMapping("/users")
  public List<User> getUsers() {
    return List.of(new User());
  }

  @PostMapping("/users")
  public void addUser(@RequestBody User user){
  }

  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id){
    return new User();
  }

  @PutMapping("/users/{id}")
  public void update(@PathVariable Long id, @RequestBody User user){
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable Long id){
  }

}
