package com.codeclan.example.springFilesandFolders.repository;


import com.codeclan.example.springFilesandFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
