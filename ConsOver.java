class Constructor_Ex2 {
	
	Constructor_Ex2() {
		
		System.out.println("Constructor Overloading Example");
	}
	
	Constructor_Ex2(int x) {
		
		System.out.println("Constructor int - " + x);
	}
	
	Constructor_Ex2(float x) {
		
		System.out.println("Constructor float - " + x);
	}
	
	Constructor_Ex2(char x) {
		
		System.out.println("Constructor char - " + x);
	}
}
 
class ConsOver {
	
	public static void main(String args[]) {
		
		Constructor_Ex2 obj1 = new Constructor_Ex2();
		Constructor_Ex2 obj2 = new Constructor_Ex2(111);
		Constructor_Ex2 obj3 = new Constructor_Ex2((float) 11.20);
		Constructor_Ex2 obj4 = new Constructor_Ex2('B');
	}
}