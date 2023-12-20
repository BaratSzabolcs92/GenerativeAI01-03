package com.example.demo3;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "author")
    private Set<Post> posts;

}
