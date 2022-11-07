import java.util.Scanner;

class Product{
	private int id;
	private String desc;
	private String producer;
	private int price;
	
	public void setValue(int id) {
		Scanner scn=new Scanner(System.in);
		
		this.id=id;
		System.out.print("상품 설명>");
		desc=scn.nextLine();
		System.out.print("생상자>");
		producer=scn.nextLine();
		System.out.print("가격>");
		price=scn.nextInt();
	}
	
	public void printInfo() {
		System.out.println("상품ID>"+id);
		System.out.println("상품 설명>"+desc);
		System.out.println("생상자>"+producer);
		System.out.println("가격>"+price);
	}
	
}

class Books extends Product{
	private String isbn;
	private String author;
	private String title;
	
	public void setValue(int id) {
		super.setValue(id);
		Scanner scn=new Scanner(System.in);
		
		System.out.print("책 제목>");
		title=scn.nextLine();
		System.out.print("저자>");
		author=scn.nextLine();
		System.out.print("ISBN>");
		isbn=scn.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		
		System.out.println("ISBN>"+isbn);
		System.out.println("책 제목>"+title);
		System.out.println("저자>"+author);
	}
}

class ConversationBook extends Books{
	private String lang;
	
	public void setValue(int id) {
		super.setValue(id);	
		Scanner scn=new Scanner(System.in);
		
		System.out.print("언어>");
		lang=scn.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		
		System.out.println("언어>"+lang);
	}
}

class CompactDisc extends Product{
	private String album;
	private String singer;
	
	public void setValue(int id) {
		super.setValue(id);
		Scanner scn=new Scanner(System.in);
		
		System.out.print("앨범 제목>");
		album=scn.nextLine();
		System.out.print("가수>");
		singer=scn.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		
		System.out.println("앨범 제목>"+album);
		System.out.println("가수>"+singer);
	}
}
public class google_oop_InheritanceScanner2_Product {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		boolean flag=true;
		int num=0;
		Product[] prd=new Product[10];
		
		while(flag) {
			System.out.print("상품 추가(1), 모든 상품 조회(2), 종료(3)");
			int m=scn.nextInt();
			
			switch(m) {
			case 1:
				if(num<10) {
					Product p;
					
					System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3)>");
					int t=scn.nextInt();
					scn.nextLine();
					
					switch(t) {
					case 1:
						p=new Books();
						break;
					case 2:
						p=new CompactDisc();
						break;
					case 3:
						p=new ConversationBook();
						break;
					default:
						p=null;
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
					
					if(p!=null) {
						p.setValue(num);
						prd[num]=p;
						System.out.println(prd[num]);
						num++;
					}
				}else {
					System.out.println("최대 10개까지만 등록 가능합니다.");
				}
				break;
			case 2:
				for(int i=0; i<num; i++) {
					prd[i]=printInfo();	//?? public인데 왜 안 돼 ? ? ?
				}
				break;
			case 3:
				flag=false;
				break;
			default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		}
		
	}

}
