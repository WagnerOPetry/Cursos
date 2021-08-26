package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		// Ler Dados:

		System.out.print("How many employee will be registered? ");
		int n = in.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = in.nextInt();
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Salary: ");
			double salary = in.nextDouble();
			list.add(new Employee(id, name, salary));

		}

		// Atualizar salário do funcionário

		System.out.println();
		System.out.print("Enter the employee is that will hava salary increase: ");
		int id = in.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This Id does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = in.nextDouble();
			emp.increaseSalary(percentage);
		}

		// Listar funcionários

		System.out.println();
		System.out.println("List os employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		in.close();
	}

		public static boolean hasId(List<Employee> list, int id) {
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
	}

}
