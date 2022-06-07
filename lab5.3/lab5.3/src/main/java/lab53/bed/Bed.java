package lab53.bed;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bed")
public class Bed implements Serializable{
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	int id;
	private String title, picture, description;
	

	public Bed(int id, String title, String picture, String description) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.description = description;
	}

	public Bed() {
		super();// TODO Auto-generated constructor stub
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"title\": \""+title+"\", \"picture\": \""+ picture+"\", \"description\": \"" + description + "\"}";
	}
}
