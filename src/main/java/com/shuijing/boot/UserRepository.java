package com.shuijing.boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContaining(@Param("name") String name);

    @Query("select u from User u where u.birthday = ?1")
    List<User> findByBirthday(@Param("birthday") LocalDate birthday);

    @Query(value = "select * from user where birthday = :birthDay",nativeQuery = true)
    List<User> findByBirthDayNative(@Param("birthDay") String birthDay);
}
