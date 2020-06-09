package com.codeclan.example.springFilesandFolders.repository;

import com.codeclan.example.springFilesandFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
