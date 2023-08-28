package com.imaginnovate.service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.entity.Employee;
import com.imaginnovate.exception.InvalidDataException;
import com.imaginnovate.repository.EmpRepo;

@Service
public class Empservice {

	@Autowired
	private EmpRepo employeeRepo;
	private Employee employee;

	public void saveEmp(Employee employee) {
		validateData(employee);
		employeeRepo.save(employee);

	}

	private void validateData(Employee employee) {
		if (employee == null) {
			throw new InvalidDataException(employee.getId(), "Invalid Employee Details");
		}

	}

	public Employee calculateTaxDeductions() {
		double yearlySalary = calculateYearlySalary(employee);
		double taxAmount = calculateTaxAmount(yearlySalary);
		double cessAmount = calculateCessAmount(yearlySalary);

		return null;
	}

	private double calculateYearlySalary(Employee employee) {
	    Date currentDate = new Date(0); // Current date
	    Calendar dojCalendar = Calendar.getInstance();
	    dojCalendar.setTime(employee.getDoj());

	    int dojMonth = dojCalendar.get(Calendar.MONTH);
	    int dojYear = dojCalendar.get(Calendar.YEAR);

	    Calendar currentCalendar = Calendar.getInstance();
	    currentCalendar.setTime(currentDate);

	    int currentMonth = currentCalendar.get(Calendar.MONTH);
	    int currentYear = currentCalendar.get(Calendar.YEAR);

	    // Calculate the number of months worked in the current year
	    int monthsWorked = (currentYear - dojYear) * 12 + currentMonth - dojMonth + 1;

	    // Assuming employee's monthly salary is constant
	    double monthlySalary = employee.getSalary();
	    double yearlySalary = monthlySalary * monthsWorked;

	    return yearlySalary;
	}


	private double calculateTaxAmount(double yearlySalary) {
		if (yearlySalary <= 250000) {
			return 0;
		} else if (yearlySalary <= 500000) {
			return 0.05 * (yearlySalary - 250000);
		} else if (yearlySalary <= 1000000) {
			return 0.05 * 250000 + 0.10 * (yearlySalary - 500000);
		} else {
			return 0.05 * 250000 + 0.10 * 500000 + 0.20 * (yearlySalary - 1000000);
		}
	}

	private double calculateCessAmount(double yearlySalary) {
		if (yearlySalary > 2500000) {
			return 0.02 * (yearlySalary - 2500000);
		}
		return 0;
	}

}
