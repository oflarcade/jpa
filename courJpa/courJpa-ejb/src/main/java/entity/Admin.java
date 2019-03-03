package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
public class Admin extends User implements Serializable {

	   
	
	private String Username;
	private String Password;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	  
	public String getUsername() {
		return this.Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
   
}
