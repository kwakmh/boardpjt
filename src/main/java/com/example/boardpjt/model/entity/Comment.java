package com.example.boardpjt.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter



public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name= "user_account_id", nullable = false)
    private UserAccount author;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name= "post_id", nullable = false)
    private Post post;

}






