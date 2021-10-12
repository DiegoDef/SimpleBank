package entitites;

public class Person {
	private String name;
	private int age;
	private String cpf;

	public Person(String name, int age, String cpf) 
	{
		this.name = name;
		this.age = age;
		this.cpf = cpf;
	}
	
	public String toString() 
	{
		return "Nome: " + name +
				"\nIdade: " + age +
				"\nCPF: " + cpf;
	}
	
}
