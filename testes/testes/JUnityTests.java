package testes;

import org.junit.Before;
import org.junit.Test; lucas mondini

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import entitites.Customer;
import entitites.Employee;

public class JUnityTests {
	private Customer customer;
	private Employee employee;
	
	@Before
	public void setUp() {
		customer = new Customer("Rafael", 40, "827.019.300-30",4000);
		employee = new Employee("David", 28, "594.436.940-00", 1400);
	}
	
	@Test
	public void testDeposit() {
		customer.deposit(200);
		System.out.println(customer.getBalance());
		assertThat(customer.getBalance(), is(4200.00f));
	}
	
	@Test
	public void testWithdraw() {
		int withdrawValue = 2000;
		
		customer.withdraw(withdrawValue);
		
		assertThat(customer.getBalance(), is(1995.00f));
	}
	
	@Test
	public void testAskForCreditIncrease() {
		boolean result = customer.askForCreditIncrease();
		
		assertFalse(result);
	}
	
	@Test
	public void testAskForSalaryIncrease() {
		boolean result = employee.askSalaryIncrease(1000);
		
		assertFalse(result);
	}
}
