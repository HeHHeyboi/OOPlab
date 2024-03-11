
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
	public Customer(String name) {
		this.name = name;
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
//sort by id
class SortById implements Comparator<Customer>{
	public SortById(){}
	
	public int compare(Customer o1,Customer o2){
		return o1.getId()-o2.getId();
	}
}
class ComparatorCustomerByName implements Comparator<Customer>{
	
	public ComparatorCustomerByName() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int compV = o1.getname().compareToIgnoreCase(o2.getname());
		if (compV == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
}
public class Loop {

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
		
		//เรียกใช้ SortbyID
		Collections.sort(customers,new ComparatorCustomerByIdAsc());
		
		System.out.println("== sorting customer list by ascending");
		customers.forEach(e->System.out.println(e));
		System.out.println("\n\nSearch by name");
		Customer cusSearch = new Customer("John");
		int index = Collections.binarySearch(customers,cusSearch, new ComparatorCustomerByName());
		if(index <=0) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Yes, it is "+customers.get(index));
		}
	}
}
