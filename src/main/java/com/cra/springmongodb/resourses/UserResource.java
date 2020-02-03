package com.cra.springmongodb.resourses;

import com.cra.springmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
     User user0 = new User("1", "Maria Silva", "maria@gmaail.com");
     User user1 = new User("2", "Maria Brom", "bronw@gmaail.com");
     List<User> list= new ArrayList<>();
        list.addAll(Arrays.asList(user0, user1));
     return ResponseEntity.ok().body(list);
    }
}
