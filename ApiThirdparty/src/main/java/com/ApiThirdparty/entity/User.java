package com.ApiThirdparty.entity;




public class User {
	private String name;
	private String job;
	private int id;
	private String createAt;
	public User(String name, String job, int id, String createAt) {
		super();
		this.name = name;
		this.job = job;
		this.id = id;
		this.createAt = createAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", job=" + job + ", id=" + id + ", createAt=" + createAt + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
