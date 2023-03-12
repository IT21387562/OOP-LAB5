package ex1;

class Cat extends Animal {
	
	public Cat() {
		System.out.println("Cat constructor called");
		// TODO Auto-generated constructor stub
	}
	public Cat(String name) {
		super(name);
	}
	public String speak() {
		return "Meow Meow";
	}
}