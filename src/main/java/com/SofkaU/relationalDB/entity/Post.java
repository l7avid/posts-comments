package com.SofkaU.relationalDB.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private String title;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    ) //para indicar la relacion entre el modelo Post y Comment -> Un solo Post contiene muchos Comments
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post addComments(Comment comment){
        this.comments.add(comment);
        return this;
    }
}
