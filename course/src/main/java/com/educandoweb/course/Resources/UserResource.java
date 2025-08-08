package com.educandoweb.course.Resources;

import com.educandoweb.course.Entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gabriel", "gabriel@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
