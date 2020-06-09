package com.codeclan.example.springFilesandFolders.repository;

import com.codeclan.example.springFilesandFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
