package com.ojt.crud.persistence.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Post {
	private int id;
	private String title;
	private String description;
	private Timestamp created_At;
	private Timestamp updated_At;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Timestamp created_At) {
		this.created_At = created_At;
	}
	public Timestamp getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Timestamp updated_At) {
		this.updated_At = updated_At;
	}
	
}
