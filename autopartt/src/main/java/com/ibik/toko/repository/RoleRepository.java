package com.ibik.toko.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibik.toko.models.ERole;
import com.ibik.toko.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
