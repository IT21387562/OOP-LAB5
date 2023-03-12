package ex1;

public class Dog extends Animal {
	
	public Dog() {
		System.out.println("Dog constructor called");
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		   super(name);
		}
		public String speak() {
		    return "Bow Wow";
		}
		}