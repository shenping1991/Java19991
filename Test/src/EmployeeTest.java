import java.io.*;
public class EmployeeTest {
	public static void main(String []args) {
		Employee empKate=new Employee("Kate");
		Employee empPink=new Employee("Pink");
		
		empKate.empAge(20);
		empKate.empDesignation("����");
		empKate.empSalary(1000);
		empKate.printEmployee();
		
		empPink.empAge(30);
		empPink.empDesignation("�м�");
		empPink.empSalary(5000);
		empPink.printEmployee();
		
	}
}
