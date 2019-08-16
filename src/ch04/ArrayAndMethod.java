package ch04;

public class ArrayAndMethod {

	public static void main(String[] args) {
//		arrayDemo1();
//		System.out.println(sum1(100));
//		int array1[]={5,4,8,9,22};
//		sort(array1);
//		System.out.println("½×³Ë"+sumjc(5));
		insertArray();
		

	}
	public static void arrayDemo1(){
		int score[][]={
				{22,12,23},
				{1,2},
				{55,63,77,88,12}
		};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	public static int sum1(int num){
		
		if(num==1){
			return 1;
		}
		else{
			return num + sum1(num-1);
		}
	}
	public static void sort(int tmp[]){
		int max;
		for(int i=1;i<tmp.length;i++){
			for(int j=0;j<tmp.length;j++){
				if(tmp[j]<tmp[i]){
					max=tmp[i];
					tmp[i]=tmp[j];
					tmp[j]=max;
				}
			}
		}
		for(int x = 0;x<tmp.length;x++){
			System.out.print(tmp[x]+"\t");
		}
		System.out.println();
	}
	public static long sumjc(int n){
		int sum=0;
		for(int j=1;j<=n;j++){
			int tmpjc=1;
			for(int i=1;i<=j;i++){
				tmpjc=tmpjc*i;
			}
			sum=sum+tmpjc;
			System.out.println(tmpjc);
		}
		
		return sum;
	}
	public static void insertArray(){
		int sort[]={1,5,12,16,44};
		int x=13;
		boolean flag=false;
		int last[]=new int[6];
		last[0]=13;
		for(int k=0;k<5;k++){
			last[k+1]=sort[k];
		}
		for(int i=1;i<last.length;i++){
			for(int j=0;j<last.length;j++){
				if(last[i]<last[j]){
					int min=last[i];
					last[i]=last[j];
					last[j]=min;
					break;
				}
			}
			
		}
		for(int l=0;l<last.length;l++){
			System.out.print(last[l]+"\t");
		}
	}

}














