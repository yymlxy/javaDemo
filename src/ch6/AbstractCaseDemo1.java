package ch6;

abstract class A{
	public abstract void print(); 
}
class B extends A{
	public void print(){
		System.out.print("���B");
	}
}

public class AbstractCaseDemo1 {

	public static void main(String[] args) {
		A a =new B();
		a.print();
	}

}
