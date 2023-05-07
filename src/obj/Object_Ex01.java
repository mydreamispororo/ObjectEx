package obj;

class BookMall {
	//책 제목, 책가격, 책수량
	String bookTitle;
	int bookPrice;
	int bookStock;
	
	public BookMall() {	} //기본 생성자
	
	
}



public class Object_Ex01 {

	public static void main(String[] args) {
		//책 정보 1개를 등록
		//객체 : 책을 1권 등록할 때 필요 : new BookMall();
		//객체2 : 책을 2권 등록할 때 필요 : new Book(); new Book();
		
		BookMall[] book = new BookMall[1]; //메모리에 공간(new BookMall())만 설정하는 것
		
//		book[0] = new BookMall(); //책 1권을 저장하기 위한 객체를 배열에 삽입
//		book[0].bookTitle = "자바의 정석 기초편";
//		book[0].bookPrice = 20000;
//		book[0].bookStock = 9999;
//		
//		System.out.println(book[0].bookTitle + " | " + book[0].bookPrice + " | " + book[0].bookStock);
//		
//		for(int i = 0; i < book.length; ++i) {
//			System.out.println(book[i].bookTitle + " | " + book[i].bookPrice + " | " + book[i].bookStock);
//		}
		
		//new BookMall() 1개면 책 하나의 정보를 저장
		
		//입력 배열 : for
		book[0] = new BookMall();
		book[0].bookTitle = "자바의 정석";
				
		for(int i = 0; i < book.length; ++i) {
			book[i] = new BookMall();
			book[i].bookTitle = "자바의 정석 기초편";
			book[i].bookPrice = 20000;
			book[i].bookStock = 9999;
		}
		
		//출력 배열 : for
		for(BookMall b : book) {
			System.out.println(b.bookTitle);
			System.out.println(b.bookPrice);
			System.out.println(b.bookStock);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
