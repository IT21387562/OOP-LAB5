package ex1;

class ToyCat extends Cat {
	String manufacturer;
	
	
	public ToyCat() {
		System.out.println("Toycat constructor called");
		// TODO Auto-generated constructor stub
	}
	public ToyCat(String name, String manufacturer) {
		super(name);
		this.manufacturer = manufacturer;
	}
	public void display() {
		super.display();
		System.out.println("I am from " + manufacturer + ".");
	}
}