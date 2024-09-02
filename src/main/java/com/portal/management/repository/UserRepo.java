package com.portal.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.management.models.entity.OurUser;
import java.util.Optional;


public interface UserRepo extends JpaRepository<OurUser, Integer>{
    Optional<OurUser> findByEmail(String email);
}
