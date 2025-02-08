package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository; //JPA repository

public interface UserRepository extends JpaRepository<UserEntity, Long> { // 操作对象是UserEntity，long是primary key的数据类型

    UserEntity findByUsername(String username);

    boolean existsByUsername(String username);
}