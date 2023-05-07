package obj;

class BookMall {
	String bookTitle;
	int bookPrice;
	int bookStock;
	boolean isSell = false; //true 판매가능, false 등록되어 있지만 판매x
	
	//생성자를 이용해서 저장하기
	public BookMall() {}
	
	public BookMall(String bookTitle, int bookPrice, int bookStock) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookStock = bookStock;
		this.isSell = true;
		
	}
	
	
}


public class Object_Ex02 {

	public static void main(String[] args) {
		BookMall[] book = new BookMall[1]; //메모리공간만 생성
		
		//실제 1개의 데이터가 저장되는 객체는 new BookMall();
		//입력 : for
		for(int i = 0; i < book.length; ++i) {
			book[i] = new BookMall("자바의 정석", 25000, 77);
		}
		
		//출력 : for
		for(int i = 0; i < book.length; ++i) {
			System.out.println(book[i].bookTitle);
			System.out.println(book[i].bookPrice);
			System.out.println(book[i].bookStock);
		}
		
		
		
		
		
		
		
	}

}