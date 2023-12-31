package com.example.bookoreilly.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Z1 {
    @Id
    private int id;
    private String name;

}
