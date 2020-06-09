package com.codeclan.example.springFilesandFolders.components;

import com.codeclan.example.springFilesandFolders.models.File;
import com.codeclan.example.springFilesandFolders.models.Folder;
import com.codeclan.example.springFilesandFolders.models.User;
import com.codeclan.example.springFilesandFolders.repository.FileRepository;
import com.codeclan.example.springFilesandFolders.repository.FolderRepository;
import com.codeclan.example.springFilesandFolders.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User moss = new User("Moss");
        User jen = new User("Jen");
        User roy = new User("Roy");
        userRepository.save(moss);
        userRepository.save(jen);
        userRepository.save(roy);

        Folder internet = new Folder("Black Box", jen);
        folderRepository.save(internet);

        File wireless = new File("No Wires", "EXE", 30, internet);
        fileRepository.save(wireless);

    }
}
