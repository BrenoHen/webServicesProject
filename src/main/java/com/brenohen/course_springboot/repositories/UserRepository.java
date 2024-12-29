package com.brenohen.course_springboot.repositories;

import com.brenohen.course_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
