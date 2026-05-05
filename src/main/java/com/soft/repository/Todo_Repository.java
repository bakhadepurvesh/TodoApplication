package com.soft.repository;

import com.soft.entity.Todo_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Todo_Repository extends JpaRepository<Todo_Entity,Long> {


}
