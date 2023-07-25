package hierarchical_inheritance;

public class Test {
	public static void main(String[] args) {
	
		C1 p1 = new C1();
		p1.m1();
		p1.m3();
		
		C2 c2 = new C2();
		c2.m1();
		c2.m2();	
	}

}
