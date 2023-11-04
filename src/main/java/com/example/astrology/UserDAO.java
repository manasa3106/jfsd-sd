package com.example.astrology;

import java.util.List;

public interface UserDAO {

	public void insertUser(User u);		
	List<User> retrieveUser();
}

