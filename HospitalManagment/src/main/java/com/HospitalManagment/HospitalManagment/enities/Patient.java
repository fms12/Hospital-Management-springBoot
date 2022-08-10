package com.HospitalManagment.HospitalManagment.enities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private long id ;
	private String name;
	private int age;
	private long room;
	private long expenses;
	private String doctor_name;
	private String admit_date;
	private String status;
	
	

	public Patient(long id, String name, int age, long room, String doctor_name, String admit_date, long expenses,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctor_name = doctor_name;
		this.admit_date = admit_date;
		this.expenses = expenses;
		this.status = status;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getRoom() {
		return room;
	}

	public void setRoom(long room) {
		this.room = room;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getAdmit_date() {
		return admit_date;
	}

	public void setAdmit_date(String admit_date) {
		this.admit_date = admit_date;
	}

	public long getExpenses() {
		return expenses;
	}

	public void setExpenses(long expenses) {
		this.expenses = expenses;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	
	
}
