import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes.Name;

class Customer{
	int id;
	String name;
	Double balance;
	public Customer() {
		
	}
	public Customer(int id,String name,Double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public String getname() {
		return name;
		
	}
	public Double getBalance() {
		return balance;
	}
	public String toString() {
		return "ID: "+id+" Name: " +name +" Balance: "+balance;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var x = <expression>
		var x = 2;
		
		if(Integer.class.isInstance(x)) {
			System.out.println("integer");
		}
		else {
			System.out.print("not integer");
		}
		var y = 7;
		System.out.println("y="+y);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(10,"John",2500.00));
		customers.add(new Customer(1,"Billy",2.00));
		customers.add(new Customer(3,"Pto",15000.00));
		customers.add(new Customer(5,"Best",3000.00));
		
		System.out.println("For each loop");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("\n\nNormal for loop");
		for(int i =0 ;i<customers.size();i++) {
			System.out.println(customers.get(i));
		
		}
		// looping iterator, an integer is reference pointer
		System.out.print("\n\n looping iterator, an integer is reference pointer");
		Iterator<Customer> it;// it = customer.iterator();
		var itv = customers.iterator();
		while(itv.hasNext()) {// if pointed list is not null, it.hasNext() true
			Customer customer = itv.next();
			System.out.println(customer);
		}
		//looping foreach,Fucntional programming,Arrow programming
		//via Lambda funciton
		// parameter list -> <body>
		System.out.println("\n\nLooping by foreach");
		customers.forEach(e->System.out.println(e));
		System.out.println("\n\n Looping by foreach -method reference");
		customers.forEach(System.out::println);// Scope resolution, used to identify function
	}
}
