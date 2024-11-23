package week3.day2.assignments;

public class ConcreteClass extends MultipleLanguage implements TestTool,Language {


	public void java() {
		System.out.println("java from Interface");
		
	}

	public void selenium() {
		System.out.println("selenium from Interface");
		
	}

	@Override
	public void rupy() {
		System.out.println("rupy from abstract class");
		
	}
	

	public static void main(String[] args) {
		
		ConcreteClass obj = new ConcreteClass();
		obj.java();
		obj.selenium();
		obj.rupy();
		obj.python();
	}

}
