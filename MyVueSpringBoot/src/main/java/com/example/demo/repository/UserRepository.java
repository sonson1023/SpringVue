/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

/**

  * @FileName : UserRepository.java

  * @Project : MySpringVue

  * @Date : 2018. 4. 9. 

  * @Author : admin

  * @Program Description :

  */
public interface UserRepository extends JpaRepository<User, Integer>{

}
