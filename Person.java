// Task #1

public class Person {

	private String name;
	private int age;
	
	// Task #5
	public Person()
	{
		name = "";
		age = 0;
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// Task #4
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
