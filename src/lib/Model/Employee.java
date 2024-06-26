package lib.Model;

import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

import lib.TaxFunction;

public class Employee {

	private String employeeId;
	private User employeeDetail;
	private Spouse employeeSpouse;
	private List<Child> employeeChild;
	private LocalDate employeeDateJoined;
	private Salary employeeSalary;

	public Employee(User employeeDetail, Spouse employeeSouse, List<Child> employeeChild, Salary employeeSalary) {
		this.employeeId = UUID.randomUUID().toString();
		this.employeeDetail = employeeDetail;
		this.employeeSpouse = employeeSouse;
		this.employeeChild = employeeChild;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public User getEmployeeDetail() {
		return this.employeeDetail;
	}

	public Spouse getEmployeeSpouse() {
		return this.employeeSpouse;
	}

	public List<Child> getEmployeeChild() {
		return this.employeeChild;
	}

	public LocalDate getEmployeDateJoined() {
		return this.employeeDateJoined;
	}

	public Salary getEmployeeSalary() {
		return this.employeeSalary;
	}

	public int getMonthWorkingInYear() {
		LocalDate date = LocalDate.now();
		if (date.getYear() == employeeDateJoined.getYear()) {
			return date.getMonthValue() - date.getMonthValue();
		}

		return 12;
	}

	public int getAnnualIncomeTax() {
		return TaxFunction.calculateTax(this, employeeSalary);
	}
}
