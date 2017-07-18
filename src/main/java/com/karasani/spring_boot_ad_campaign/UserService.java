package com.karasani.spring_boot_ad_campaign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {

	private List<Users> users = new ArrayList<>(Arrays.asList(new Users("1","First User","First user description"),
			new Users("2","Second User","Second user description"),
			new Users("3","Third User","Third user description")));
	
	public List<Users> getAllUsers(){
		return users;
	}
	
	public Users getUser(String userid) {
		return users.stream().filter(t->t.getUserid().equals(userid)).findFirst().get();
	}

public void addUser(Users user) {
	users.add(user);
	
}




}
