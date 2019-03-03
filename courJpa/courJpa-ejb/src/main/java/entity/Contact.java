package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: contact
 *	Entity Annotations should be notted on top of the variables or dispressed  
 */
@Entity

public class contact implements Serializable {

	   
	@Id
	private int Id;
	private String phoneNumber;
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy= "contact")
	private Gerant gerant;
	
	
	
	public contact() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public Gerant getGerant(){
		return gerant;
	}
   
}
