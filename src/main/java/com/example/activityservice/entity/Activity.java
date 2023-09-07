package com.example.activityservice.entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @Column(name = "types")
    private Set<Type> types = new HashSet<>();

}