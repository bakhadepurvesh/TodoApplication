package com.soft.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, unique = true)
    private String title;

    private Boolean completed;


}
