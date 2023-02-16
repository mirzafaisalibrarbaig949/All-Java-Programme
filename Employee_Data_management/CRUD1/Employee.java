package CRUD1;

public class Employee {

	private int		 employeeId;
	private String 	 employeeName;
	private String   employeeEmail;
	private String 	 employeeJob;
	private double 	 employeeSal;
	private int		 employessDeptId;
	private String 	 employeeAddress;
	
	
	
	
	public Employee(int employeeId, String employeeName, String employeeEmail, String employeeJob, double employeeSal,
			int employessDeptId, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeJob = employeeJob;
		this.employeeSal = employeeSal;
		this.employessDeptId = employessDeptId;
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public double getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}
	public int getEmployessDeptId() {
		return employessDeptId;
	}
	public void setEmployessDeptId(int employessDeptId) {
		this.employessDeptId = employessDeptId;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	

}
