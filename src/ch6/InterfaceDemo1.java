package ch6;
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.print("Æ»¹û");
	}
}
class Orange implements Fruit{

	@Override
	public void eat() {
		System.out.print("éÙ×Ó");
	}
}
class Factory{
	public static Fruit getInstance(String name){
		Fruit f=null;
		if("apple".equals(name)){
			f=new Apple();
		}
		if("orange".equals(name)){
			f=new Orange();
		}
		return f;
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Fruit f1=Factory.getInstance(args[0]);;
		f1.eat();
	}
}
