import java.time.LocalDate;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("001", "Jame",LocalDate.of(2005, 2, 11), 15000.0);
		System.out.println(e.toString());
	}

}
