package entitites;

import java.util.Scanner;

public class Customer extends Person {
	
	private static int id=1000;
	private static final int creditScore=0;
	private float balance=0;
	private float credit=10000;
	private int userId;
	
	public Customer(String name, int age, String cpf, float balance) 
	{
		super(name, age, cpf);
		
		this.balance = balance;
		this.userId = id+1;
		id = this.userId;
	}
	
	
	public Customer(String name, int age, String cpf) 
	{
		super(name, age, cpf);
		
		this.userId = id+1;
		id = this.userId;
	}
	
	
	public void deposit(float deposit_amount) 
	{
		this.balance += deposit_amount;
	}
	
	
	public void withdraw(float withdraw_amount) 
	{
		float balance = this.balance;
		int fee = 5;
		
		if (balance >= withdraw_amount+fee)
		{ 
			this.balance -= withdraw_amount+fee;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	
	public void askForLoan(float loan_amount) 
	{
		Scanner sc = new Scanner(System.in);
		
	    float fee = (float) (loan_amount*1.05);
	    float total_loan = loan_amount + fee;
	    
		if (total_loan < credit) 
		{
			credit -= total_loan;
			System.out.println("Seu empréstimo foi conluído com sucesso!");
		} else{
			System.out.println("Você não possui crédito suficiente. "
					+ "Gostaria de pedir aumento de crédito? "
					+ "(S- SIM, N-NÃO)");
			//char answer = sc.next().charAt(0);
			//sc.nextLine();
			char answer = 'S'; //erro, arrumar mais tarde e fazer teste
			if (answer == 'S' || answer == 's') 
			{
				askForCreditIncrease();
			}
		}
		
		sc.close();
	}


	@SuppressWarnings("unused")
	public boolean askForCreditIncrease() 
	{
		if (creditScore < 1000000000) 
		{
	    	System.out.println("Seu pedido de crédito foi negado.");
	    	return false;
	    } 
		else 
	    {
			System.out.println("Seu pedido de crédito foi aceito mas./n"
					+ "Segue novo valor do seu salário: R$ "+ this.credit);
			return true;
	    }
	}
	
	public String toString() 
	{
		return super.toString() +
				"\nSaldo: " + String.format("%.2f", balance) +
				"\nCredito: " + String.format("%.2f", credit);
	}
	
	
	public int getIdUser() {
		return userId;
	}
	
	public float getBalance() {
		return balance;
	}

}
