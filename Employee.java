import java.security.PublicKey;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee{
	private String id;
	private String name;
	private LocalDate birthDate;
	private double salary;
		
	public Employee(String id,String name,LocalDate date,double salary){
		this.id = id;
		this.birthDate = date;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return this.id;
	}
	@Override
	public String toString() {
		DateTimeFormatter formdate =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "id: "+id+" name: "+name+" date: "+this.birthDate.format(formdate)+" salary: "+salary;
	}
}