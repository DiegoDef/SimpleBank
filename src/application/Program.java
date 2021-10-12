package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Customer;
import entitites.Employee;
import entitites.Person;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Person person = new Person("Diego", 18, "117.932.260-67");
		Customer customer = new Customer("Rafael", 40, "827.019.300-30",4000);
		Employee employee = new Employee("David", 28, "594.436.940-00", 1400);
		
		System.out.println(person + "\n");
		System.out.println(customer + "\n");
		System.out.println(employee + "\n");
		
		customer.askForCreditIncrease();
		customer.askForLoan(1500);
		customer.askForLoan(10000);
		
		employee.askSalaryIncrease(1800);
		
		
		sc.close();

	}

}
