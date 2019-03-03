package entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gerant
 *
 */
@Entity
public class Gerant extends User implements Serializable {

	
	private int StationId;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private contact contact;
	
	public Gerant() {
		super();
	}  
	   
	public int getStationId() {
		return this.StationId;
	}

	public void setStationId(int StationId) {
		this.StationId = StationId;
	}   
	
	
	public contact getContact(){
		return contact;
	}
	
	public void setContact(contact contact){
		this.contact = contact;
	}
   
}
