package ex2;

class Person implements ICompute {
	 private String name;
	 private double basicSal;
	 private double otRate;
	 private double otHrs;
	 private int netSal;
	 
	 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}


	public Person(String name, double basicSal, double otRate, double otHrs, int netSal) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		this.netSal = netSal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBasicSal() {
		return basicSal;
	}


	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}


	public double getOtRate() {
		return otRate;
	}


	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}


	public double getOtHrs() {
		return otHrs;
	}


	public void setOtHrs(double otHrs) {
		this.otHrs = otHrs;
	}


	public double getNetSal() {
		return netSal;
	}


	public void setNetSal(int netSal) {
		this.netSal = netSal;
	}
	
	public int calculate() {
		netSal = (int) (basicSal +(otRate*otHrs));
		return netSal;
	}
	
	public void display() {
		System.out.println("Name : " + getName());
		
	}
	 
	 
	}
