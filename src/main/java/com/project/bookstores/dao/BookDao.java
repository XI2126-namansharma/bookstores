package com.project.bookstores.dao;

import com.project.bookstores.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

//Dao interface for connecting server with database
public interface BookDao extends JpaRepository<Books,Integer> {

}
