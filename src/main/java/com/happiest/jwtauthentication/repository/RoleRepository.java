package com.happiest.jwtauthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.happiest.jwtauthentication.model.Role;
import com.happiest.jwtauthentication.model.RoleName;

/**
 * @author Rajkumar
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}