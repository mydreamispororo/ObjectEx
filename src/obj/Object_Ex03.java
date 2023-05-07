package obj;

class BookMall {
	String bookTitle;
	int bookPrice;
	
	public BookMall() {	}
	
	public BookMall(String bookTitle, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	public String showBook() {
		return "상품제목 : " + this.bookTitle + " | 상품가격 : " + this.bookPrice;
	}
	
	public void showInfo() {
		System.out.println("상품제목 : " + this.bookTitle + " | 상품가격 : " + this.bookPrice);
	}
}

public class Object_Ex03 {

	public static void main(String[] args) {
		//2개의 책 정보를 생성자로 등록하여 메소드로 출력
		//공간2 + new 2
		/*
		BookMall[] book = new BookMall[2];
		book[0] = new BookMall("자바", 10000); //책 1권 저장
		book[1] = new BookMall("스프링", 25000); //책 1권 저장
		
		for(int i = 0; i < book.length; ++i) {
			System.out.println(book[i].showBook());
			book[i].showInfo();
		}
		*/
		
		//for입력
		BookMall[] book = new BookMall[2];
		for(int i = 0; i < book.length; ++i) {
			book[i] = new BookMall("자바", 10000);
		}
		
		//for출력
		for(BookMall bm : book) {
			System.out.println(bm.showBook());
		}
		
		
		
		
		
		
	}

}









