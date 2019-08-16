package ch6;

abstract class A{
	public abstract void print(); 
}
class B extends A{
	public void print(){
		System.out.print("Êä³öB");
	}
}

public class AbstractCaseDemo1 {

	public static void main(String[] args) {
		A a =new B();
		a.print();
	}

}
