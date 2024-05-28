package com.example.restapi_sqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.restapi_sqlserver.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
