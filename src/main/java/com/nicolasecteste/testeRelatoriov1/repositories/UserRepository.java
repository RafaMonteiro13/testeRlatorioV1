package com.nicolasecteste.testeRelatoriov1.repositories;

import com.nicolasecteste.testeRelatoriov1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
