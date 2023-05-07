package obj;

class BookMall {
	String bookTitle;
	int bookPrice;
	int bookStock;

	//생성자
	public BookMall() {}

	// getter, setter : 입력(set)할 때 유효성 체크하거나 외부에서 필드로 바로 접근 x(캡슐화)
	// 필드 앞에 private
	// 저장(set), 출력(get)


	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		if(bookPrice < 10000) {//부정확하게 입력하면 프로그램이 10000으로 자동설정
			System.out.println("책 가격은 최소 10,000원 이상이어야 합니다.");
			this.bookPrice = 10000; //무조건 10,000원부터 시작
		}else {//정확하게 입력하면 입력한 가격 그대로 필드에 저장
			this.bookTitle = bookTitle;
		}
		
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookStock() {
		return bookStock;
	}

	public void setBookStock(int bookStock) {
		if(bookStock < 1) {
			System.out.println("책 수량은 1권 이상이어야 합니다.");
			this.bookStock = 1;
		}else {
			this.bookStock = bookStock;
		}
		
	}
	
	public String showBook() {
		return "제목 : " + this.bookTitle + "| 가격 : " + this.bookPrice + " | 수량 : " + this.bookStock;
	}

}

public class Object_Ex04 {

	public static void main(String[] args) {
		//1권을 책을 set, get을 이용해서 입력, 출력
		BookMall[] book = new BookMall[4]; //공간
		book[0] = new BookMall();
		book[0].setBookTitle("자바");
		book[0].setBookPrice(25000);
		book[0].setBookStock(9999);
		
		System.out.println(book[0].getBookTitle());
		System.out.println(book[0].getBookPrice());
		System.out.println(book[0].getBookStock());
		
		
		
		
	}

}
