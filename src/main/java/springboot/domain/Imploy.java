package springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imploy {
	@Id //makes the value primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //for autoincrement
	private int id;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Imploy [name=" + name + ", password=" + password + "]";
	}
	public Imploy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
