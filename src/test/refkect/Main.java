package test.refkect;

/**
 * @author Administrator
 * ���Է���������
 */
public class Main {

	public static void main(String[] args) {
		new A();
		System.out.println("------------------");
		new B();
		
	}
	
}

class A{
	
	static{
		System.out.println("AAAAAAAAAAAAAA");
	}
		
	}
	class B{
		static{
			System.out.println("BBBBBBBBBBB");
		}
		
	}
