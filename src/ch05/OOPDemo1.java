package ch05;
import java.io.*;

public class OOPDemo1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Person p1=new Person("aa",17);
//		p1.tell();
//		Student s1=new Student("aa1","cdd",90,78,77);
//		System.out.println("总分:"+s1.max());
//		String s1="hh";
//		String s2="hh";
//		System.out.print(b);
//		if(args.length!=1){
//			System.out.println("输入的参数不正确！");
//			System.exit(1);
//		}
//		String name=args[0];
//		System.out.println(name);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = null; 
        System.out.println("Enter your value:"); 
        str = br.readLine(); 
        System.out.println("your value is :"+str); 
	}
}
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell(){
		System.out.print("姓名："+getName()+"\t年龄："+getAge());
		
	}
}
class Student{
	private String stuno;
	private String name;
	private float math;
	private float english;
	private float computer;
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	public Student() {
		super();
	}
	public Student(String stuno, String name, float math, float english, float computer) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	public float sum(){
		return this.getComputer()+this.getEnglish()+this.getMath();
	}
	public float avg(){
		return this.sum()/3;
	}
	public float max(){
		float max=math;
		max=max>computer?max:computer;
		max=max>english?max:english;
		return max;
	}
}
