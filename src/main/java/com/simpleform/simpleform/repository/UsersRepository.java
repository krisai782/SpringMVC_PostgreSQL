package com.simpleform.simpleform.repository;
import com.simpleform.simpleform.model. Users Model;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface Users Repository extends JpaRepository<UsersModel, Integer> {
        Optional<Users Model> findByLoginAnd Password(String login, String password);
        }
