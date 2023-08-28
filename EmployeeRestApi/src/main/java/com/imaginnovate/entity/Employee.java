package com.imaginnovate.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_id")
	private String employeeId;

	@Column(name = "first_name")
	@NotNull
	@NotBlank(message = "first name is required")
	private String firstName;

	@Column(name = "last_name")
	@NotBlank(message = "last name rquired")
	private String lastName;

	@Column(nullable = false)
	@Email(message = "please enter valid email format")
	private String email;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL)
	private List<PhoneNumber> phoneNumbers;

	@Temporal(TemporalType.DATE)
	@Column(name = "doj", nullable = false)
	private Date doj;

	@Column(name = "salary", nullable = false)
	private double salary;
	
	public Long getEmpTax() {
		return empTax;
	}

	public void setEmpTax(Long empTax) {
		this.empTax = empTax;
	}

	public Long getCess() {
		return cess;
	}

	public void setCess(Long cess) {
		this.cess = cess;
	}

	private Long empTax;
	
	private Long cess;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeId=" + employeeId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phoneNumbers=" + phoneNumbers + ", doj=" + doj + ", salary="
				+ salary + "]";
	}

}
