package org.fasih.batchjpa.controller;

import org.fasih.batchjpa.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebController {

    @Autowired
    private PostRepository postRepo;

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public ResponseEntity<String> save() {
        try {
            List<Post> posts = new ArrayList<>();
            posts.add(new Post("Post 1"));
            posts.add(new Post("Post 2"));
            posts.add(new Post("Post 3"));
            posts.add(new Post("Post 4"));
            posts.add(new Post("Post 5"));
            posts.add(new Post("Post 6"));
            posts.add(new Post("Post 7"));
            posts.add(new Post("Post 8"));
            posts.add(new Post("Post 9"));
            posts.add(new Post("Post 10"));
            posts.add(new Post("Post 11"));
            posts.add(new Post("Post 12"));
            posts.add(new Post("Post 13"));
            posts.add(new Post("Post 14"));
            posts.add(new Post("Post 15"));
            posts.add(new Post("Post 16"));
            posts.add(new Post("Post 17"));
            posts.add(new Post("Post 18"));
            posts.add(new Post("Post 19"));
            posts.add(new Post("Post 20"));

            postRepo.saveAll(posts);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
