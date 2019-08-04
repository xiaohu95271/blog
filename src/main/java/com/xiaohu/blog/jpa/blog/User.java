package com.xiaohu.blog.jpa.blog;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 实体类映射数据库表
 * 使用spring data jpa开发的时候，会将实体类中的成员变量与表中的字段一一对应，
 * 当我们在实体类中加上一个不与数据库表一一对应的成员变量的时候，此时我们只要在
 * 这个成员变量上加上注解@Transient
 */
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class User {

    //    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GenericGenerator(name="idGenerator", strategy="uuid")
//    @GeneratedValue(generator="idGenerator")
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;

    @Column(nullable = false)
    private String password;
    //name="username" 设置userName属性映射到数据库的username字段，而不是默认的user_name
    @Column(name = "username", nullable = true, unique = true)
    private String userName;

    @Column(nullable = true, unique = true)
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}