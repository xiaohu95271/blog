package com.xiaohu.blog.jpa.blog;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{

    User findById(String id);
    void deleteById(String id);
}