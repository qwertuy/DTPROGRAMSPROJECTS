package com.niit.Ecommerce_backend.DAO;

import java.util.ArrayList;

import com.niit.Ecommerce_backend.Model.UserModel;

public interface UserDAO 
{
	//create 
 	public void addUser(UserModel u);
	//read
	public  void getId(int id);
	//update
	public void update(UserModel u);
	//deleted
	public void deleteById(int id);
	//Get All
	public ArrayList<UserModel> getAll();
}
