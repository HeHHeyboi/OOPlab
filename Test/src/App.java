import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
       	//#region Comparable test
		// Employee[] employees = new Employee[5];
		// 
		// employees[0] = new Employee(4,"D");
		// employees[1] = new Employee(3,"C");
		// employees[2] = new Employee(1,"B");
		// employees[3] = new Employee(0,"A");
		// employees[4] = new Employee(2,"A");
		// System.out.println("Before sorting");
		// for(Employee e : employees) {
			// System.out.println("id: "+e.id+"Name: "+e.name);
		// }
		// Arrays.sort(employees);
		// System.out.println("\n\nAfter sorting");
		// for(Employee e : employees) {
			// System.out.println("id: "+e.id+"Name: "+e.name);
		//}
			//#endregion
//		while (reader.hasNext()) {
//			String[] tokens = reader.nextLine().split(",");
//			for (var i: tokens) {
//				System.out.println(i);
//			}
//		}
	//#region Stream& try and catch
		Map<String, Integer> wordCounts = new HashMap<>();
		//TreeMap<String,Integer> word = new TreeMap<>();
		String filename =  "fruits.txt";
//		while (reader.hasNext()) {
//			String[] tokens = reader.nextLine().split(",");
//			for (var i: tokens) {
//				System.out.println(i);
//			}
//		}
		
		try {
			File fruitText = new File(filename);
			Scanner reader = new Scanner(fruitText);
			while (reader.hasNext()) {
				String line = reader.nextLine();
				String[] words = line.split(",");//apple , watermelon , banana , Apple
				
				for (var f: words) {
					f= f.trim().toLowerCase();
					
					if (wordCounts.containsKey(f)) {
						wordCounts.put(f, wordCounts.get(f)+1);//apple 1 -> apple 2
					} else {
						wordCounts.put(f,1);//banana 1 : w = banana , value =1
					}
				}

			}
			reader.close();
			
			// System.out.println("-----------Word Counting-----------");
            // System.out.println("-----------------------------------");
            // System.out.println("Furit\t\tFrequency");
            // System.out.println("-----------------------------------");
            // for (var e:wordCounts.entrySet()) {
            // 	System.out.println(e.getKey() + String.format("%12s", "\t") + e.getValue());
            // }
		} 
		catch (FileNotFoundException  e) {
			System.err.println("Error: File not found " + filename);
		}
		//#endregion
	
	}
	
}

