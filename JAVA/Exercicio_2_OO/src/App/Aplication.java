package App;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Aplication {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner in = new Scanner(System.in);
	Employee employee = new Employee();
	
	
	System.out.print("Name: ");
	employee.name = in.nextLine();
	
	System.out.print("Gloss salary: ");
	employee.glossSalary = in.nextDouble();
	
	System.out.print("Tax: ");
	employee.tax = in.nextDouble();
	
	System.out.println();
	System.out.printf("Employee: " + employee.name + ", $ " + "%.2f%n", employee.netSalary());
	
	System.out.println();
	System.out.print("Which percente to increase salary? ");
	double percentage = in.nextDouble();
	employee.increaseSalary(percentage);
	
	
	System.out.println();
	System.out.printf("Update data: " + employee);
	
	in.close();
	
}
}