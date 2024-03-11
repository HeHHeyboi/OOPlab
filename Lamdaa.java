import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;

import javax.swing.plaf.synth.Region;

public class Lamdaa {

	public static void main(String[] args) {
		// TODO Auto-generated 
		//Integer [] scores = {10,20,30,55,60};
//		ArrayComputing<Integer>  arr = (a) -> {
//			int sum = 0;
//			for(int num: a) 
//			{sum +=num;}
//			return sum;
//			};
//			
//		int total = arr.apply(scores);
//		System.out.println(total);
//	
//	ArrayComputing<Integer>  arr = (a) -> {
//			int sum = 0;
//			 for (int num: a) 
//			 {if (sum < num) {sum = num;}}
//			 return sum;
//			 };
//		
//		int total = arr.apply(scores);
//		System.out.println(total);
		Employee[] employees = new Employee[5];
		
		employees[3] = new Employee(0,"A");
		employees[2] = new Employee(1,"B");
		employees[4] = new Employee(2,"A");
		employees[1] = new Employee(3,"C");
		employees[0] = new Employee(4,"D");
		
		for(Employee e : employees) {
			System.out.println();
		}
		Arrays.sort(employees);
		
		for(Employee e : employees) {
			System.out.println();
		}
		
		
		
		
		
		
	}	
}	
		//annonimas
		//ArrayComputing<Integer> total = new ArrayComputing<Integer>() {
//			
//			@Override
//			public int apply(Integer[] array) {
//				int sum = 0;
//				for(int num: array) 
//				{sum +=num;}
//				return sum;
//			}
//		};
//		int A = total.apply(scores);
//		System.out.print(A);
		
		
//		ArrayComputing<Integer> A = new ArrayComputing<Integer>() {
//			
//			@Override
//			public int apply(Integer[] array) {
//				int sum = 0;
//				for(int num: array)
//				{if(sum < num) {sum  = num;}}
//				return sum;
//			}
//		};
//		int a = A.apply(scores);
//		System.out.println(a);
//		
//		
//	}
//	public interface ArrayComputing<T>{
//		int apply(T [] array);
//	}

