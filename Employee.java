package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Employee_Details")

public class Employee {

	// public static void main(String[] args) {
	@Id
	@Column(name = "Emp_Id",nullable=false,unique=true)
	@GeneratedValue
	private int id;
	@Column(name = "Email_Id",nullable=false,unique=true)
	private String email;
	@Column(name = "Name",length=150,nullable=false)
	private String name;
	@Column(name = "Phone_No")
	private int phone;
	@Column(name = "Basic_Salary")
	private double basicSalary;
	@Column(name = "TA")
	private int travelAllowance;
	@Transient
	private double netSalary;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float providentFund;

	public Employee(String email, String name, int phone) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
