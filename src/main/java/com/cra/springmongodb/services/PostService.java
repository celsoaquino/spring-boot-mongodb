package com.cra.springmongodb.services;

import com.cra.springmongodb.domain.Post;
import com.cra.springmongodb.domain.User;
import com.cra.springmongodb.dto.UserDTO;
import com.cra.springmongodb.repositories.PostRepository;
import com.cra.springmongodb.repositories.UserRepository;
import com.cra.springmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
