package org.emp;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;*/

//@Entity
//@Table(name = "Employee_Details")
public class Employee {
	//@Id
	//@Column(name = "Emp_Id")
	//@GeneratedValue
	private int id;
	//@Column(name = "Emp_Name", length = 150,nullable = false)
	private String name;
	//@Column(name = "Email_Id")
	private String email;
	//@Column(name = "Phone_No")
	private long phone;
	//@Column(name = "Basic_Salary")
	private double basicSalary;
	//@Column(name = "HRA")
	private float houseRentAllowance;
	//@Column(name = "PF")
	private float providentFund;
	//@Column(name = "TA")
	private float travelAllowance;
	//@Column(name = "DA")
	private float dearnessAllowance;
	//@Transient
	private double netSalary;

	

	public Employee(String name, String email, long phone, double basicSalary, float houseRentAllowance,
			float providentFund, float travelAllowance, float dearnessAllowance) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.basicSalary = basicSalary;
		this.houseRentAllowance = houseRentAllowance;
		this.providentFund = providentFund;
		this.travelAllowance = travelAllowance;
		this.dearnessAllowance = dearnessAllowance;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
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

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

};