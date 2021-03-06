package bed;

import java.io.Serializable;

public class Bed implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title, picture, desc;
	private int id;

	public Bed(int id, String title, String picture, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.desc = desc;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"title\": \""+title+"\", \"picture\": \""+ picture+"\", \"desc\": \"" + desc + "\"}";
	}
}
