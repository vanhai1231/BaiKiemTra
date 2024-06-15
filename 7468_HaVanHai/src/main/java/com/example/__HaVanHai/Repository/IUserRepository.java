package com.example.__HaVanHai.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.__HaVanHai.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
