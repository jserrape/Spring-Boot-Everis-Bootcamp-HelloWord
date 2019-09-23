package com.example.HelloWorld.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HelloWorld.Entidades.User;

public interface HelloRepository extends JpaRepository<User, Long>{

}
