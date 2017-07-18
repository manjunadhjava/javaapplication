package com.karasani.spring_boot_ad_campaign;

public class Users {
private String userid;
private String name;
private String description;

public Users() {
	
}

public Users(String userid, String name, String description) {
	super();
	this.userid = userid;
	this.name = name;
	this.description = description;
}

public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
