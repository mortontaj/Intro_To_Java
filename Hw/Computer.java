package java_package_pro;
import java.util.Scanner;

public class Computer {

	private	String Name;
	private long Year; 
	private double Cost; 
	// Any real number in [1.00, 5.00)
	// Most computers have an life expectancy within 1 - 5 years
	// :-)
	private double AvgLife=((Math.round(Math.random()*400.00) / 100.00) + 1.00) ;
	
	private String getName() {
		return Name;
	}

	private void setName(String Name) {
		this.Name = Name;
	}

	private long getYear() {
		return Year;
	}

	private void setYear(long Year) {
		this.Year = Year;
	}

	private double getCost() {
		return Cost;
	}

	private void setCost(double Cost) {
		this.Cost = Cost;
	}
	
	public void display() {
		System.out.println(this.Name);
		System.out.println(this.Year);
		System.out.println(this.Cost);
		System.out.println(this.AvgLife + " years");
	}
	
	public String toString() {
		 return Name + " Computer\n[Class= " + Name + ", Year= " + Year + ", Cost= $" + Cost + ", AvgLife= " + AvgLife + " years]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Computer Dell = new Computer();
//		Dell.setName("Dinosaur");
		// User creates a name for their computer
		
		System.out.println("Name your Dell computer: ");
		Dell.setName(input.nextLine()); // Type: Fun :)
		Dell.setCost(2599.99);
		Dell.setYear(2020);
		Dell.display();
		System.out.println(Dell.toString());
		
		System.out.println();
		Computer Acer = new Computer();
		System.out.println("Name your Acer computer: ");
//		Dell.setName("XLR8");
		Acer.setName(input.nextLine()); // Type: knee :)
		Acer.setCost(2799.99);
		Acer.setYear(2022);
		Acer.display();
		System.out.println(Acer.toString());
		
		System.out.print(Dell.getName());
		System.out.print(Acer.getName());
		System.out.println(Dell.getYear());
	}

}
