package ch07;

public class Exception01 {

	public static void main(String[] args) {
		Math m = new Math();
		try {
			System.out.print(m.div(10, 2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Math {
	public int div(int i, int j) throws Exception {
		int temp = i / j;
		return temp;
	}
}
