package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Testspring {

@Id
@GeneratedValue(strategy=GenerationType.AUTO) 
 int k_id;
String name;
String email;
public int getK_id() {
	return k_id;
}
public void setK_id(int k_id) {
	this.k_id = k_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
