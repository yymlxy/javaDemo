package ch05;

public class BookInfo {
	private String bookName;
	private static int count=0;
	private static String bookNo;
	private float bookPrice;
	private static int bookNumber;
	private static int bookCount=0;
	
	public BookInfo(int n){
		count++;
		BookInfo.bookNo="No"+count;
		BookInfo.bookNumber=n;
	}

	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public static String getBookNo() {
		return bookNo;
	}

	public float getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}


	public static int getBookNumber() {
		return bookNumber;
	}


	public static void setBookNumber(int bookNumber) {
		BookInfo.bookNumber = bookNumber;
	}


	public int getBookCount() {
		return bookCount;
	}




	public static void main(String[] args) {
		BookInfo b[]=new BookInfo[3];
		for(int i=0;i<b.length;i++){
			b[i]=new BookInfo(3);
			BookInfo.bookCount+=BookInfo.bookNumber;
			System.out.println(BookInfo.getBookNo());
		}
		System.out.println(BookInfo.bookCount);

	}

}
