
public class Main2 {
	
	public void testFunc() {
		System.out.println("Hello world");
		
	}
	public static void testFu2() {
		System.out.println("Goodbye");
	}
	//none-static inner class
	class NoneStaticInner{
		private int data;
		NoneStaticInner next;
		public NoneStaticInner() {
			// TODO Auto-generated constructor stub
			this.data =-1;
		}
		public void testNoneInner() {
			testFunc();
		}
	}
	//static inner class
	static class staticInner{
		public void testStaticInner() {
			testFu2();
		}
		
	}

	public static void main(String[] args) {
		// none-static inner class
		//static inner class
		Main2 main2 = new Main2();
		Main2.NoneStaticInner curNone = main2.new NoneStaticInner();
		System.out.println("Before data = "+ curNone.data);
		curNone.data = 9;
		System.out.println("After data ="+curNone.data);
		
		Main2.staticInner sInner = new Main2.staticInner();
		sInner.testStaticInner();
	}

}
