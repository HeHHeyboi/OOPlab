import java.awt.image.AbstractMultiResolutionImage;

public class Q1_main {
	public static int divider(int a,int b) throws ArithmeticException ,Exception{
		return a/b;
	}
	public static void copyArray(int[] source,int[] dest) {
		try {
			for(int i = 0;i<source.length;i++) {
				dest[i] = source[i];
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
			System.err.println(e.getLocalizedMessage());
			throw e;
		}
		finally {
			System.out.println("Copy finished");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,24,5,30};
		int[] b = {0,1,2,3};
		int[] c = new int[3];
		try {
			copyArray(b, c);
			for (int i : c) {
				System.out.println(i);
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			if(b[index]==0) {
				throw new ArithmeticException("Divided by Zero");
			}
			int result = divider(a[index], b[index]);
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Exception (divider is zero): "+e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Main: "+e.getMessage());
			
		}
		finally {
			System.out.println("Main : Finally");
			
		}*/
		System.out.println("Outside of try block");
	}

}
