package org.dummy.emp;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;*/

//@Entity
//@Table(name="Employee_Details")

public class Employee {

	
	//@Id
	//@Column(name = "Emp_Id",nullable=false,unique=true)
	//@GeneratedValue
	private int id;
	//@Column(name = "Email_Id",nullable=false,unique=true)
	private String email;
	//@Column(name = "Name",length=150,nullable=false)
	private String name;
	//@Column(name = "Phone_No")
	private int phone;
	//@Column(name = "Basic_Salary")
	private double basicSalary;
	//@Column(name = "TA")
	private int travelAllowance;
	//@Transient
	//private double netSalary;
	//@Column(name = "DA")
	private float dearnessAllowance;
	//@Column(name = "HRA")
	private float houseRentAllowance;
	//@Column(name = "PF")
	private float providentFund;

	

public Employee(String email, String name, int phone, double basicSalary, int travelAllowance,float dearnessAllowance, float houseRentAllowance, float providentFund) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.basicSalary = basicSalary;
		this.travelAllowance = travelAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.houseRentAllowance = houseRentAllowance;
		this.providentFund = providentFund;
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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(int travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	

}
