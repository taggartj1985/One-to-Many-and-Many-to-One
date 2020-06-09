package com.codeclan.example.springFilesandFolders;

import com.codeclan.example.springFilesandFolders.models.File;
import com.codeclan.example.springFilesandFolders.models.Folder;
import com.codeclan.example.springFilesandFolders.models.User;
import com.codeclan.example.springFilesandFolders.repository.FileRepository;
import com.codeclan.example.springFilesandFolders.repository.FolderRepository;
import com.codeclan.example.springFilesandFolders.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringFilesandFoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFileThenSave(){

		User me = new User("John");
		userRepository.save(me);
		Folder folder = new Folder("homework", me);
		folderRepository.save(folder);
		File test = new File("this is a test", "exe", 20, folder);
		fileRepository.save(test);
	}

}
