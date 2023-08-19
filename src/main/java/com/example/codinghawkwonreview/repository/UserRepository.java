package com.example.codinghawkwonreview.repository;

import com.example.codinghawkwonreview.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);
}
