package ex1;

public abstract class Animal {
	private String name;
	
	public Animal() {
		super();
		System.out.println("Animal constructor called");
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name) {
    this.name = name;
	}
	
	abstract public  String speak(); 
	 
	public void display() {
		System.out.println("My name is " + this.name + ".  " + this.speak() + ".");
	}
}
