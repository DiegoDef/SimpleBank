package entitites;

public class Employee extends Person {
	
	private static int id=100;
	public static final int importance=0;
	private float salary;
	private int userId;
	
	public Employee(String name, int age, String cpf, float salary) 
	{
		super(name, age, cpf);
		
		this.salary = salary;
		this.userId = id+1;
		id = this.userId;
	}
	
	
	@SuppressWarnings("unused")
	public boolean askSalaryIncrease(float raise_amount) 
	{
		raise_amount = 0; // ignored
	    
		if (importance < 1000000000) {
	    	System.out.println("Seu pedido de aumento de salário foi negado.");
	    	return false;
	    } else {
	    	this.salary += 5;
			System.out.println("Seu pedido de aumento foi aceito mas "
					+ "com um valor diferente do pedido.\nSegue novo valor "
					+ "do seu salário: R$ "+ this.salary);
			return true;
	    }
	
	}
	
	
	public String toString() 
	{
		return super.toString() +
				"\nSalário: " + String.format("%.2f", salary);
	}
	
	
	public int getIdUser() {
		return userId;
	}

}
