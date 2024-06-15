package com.example.__HaVanHai.Repository;


import com.example.__HaVanHai.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}