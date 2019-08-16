package ch6;

public class ArrayDemo {

	public static void main(String[] args) {
		ReverseArray a=null;
		a=new ReverseArray(4);
		a.add(30);
		a.add(44);
		a.add(12);
		a.add(88);
		print(a.getArray());

	}
	public static void print(int i[]){
		for(int x=0;x<i.length;x++){
			System.out.print(i[x]+"\t");
		}
	}

}

class Array{
	private int tmp[];
	private int foot;
	public Array(int len){
		if(len>0){
			this.tmp=new int[len];
		}
		else{
			this.tmp=new int[1];
		}
	}
	public boolean add(int i){
		if(this.foot<this.tmp.length){
			tmp[foot]=i;
			foot++;
			return true;
		}
		else{
			return false;
		}
	}
	public int[] getArray(){
		return this.tmp;
	}
}

class ReverseArray extends Array{
	public ReverseArray(int len){
		super(len);
	}
	public int[] getArray(){
		int t[]=new int[super.getArray().length];
		int count=t.length-1;
		for(int x=0;x<t.length;x++){
			t[x]=super.getArray()[count];
			count--;
		}
		return t;
	}
}

class SortArray extends Array{
	public SortArray(int len){
		super(len);
	}
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());
		return super.getArray();
	}
}
