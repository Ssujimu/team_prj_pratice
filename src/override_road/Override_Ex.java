package override_road;

class Admin{
	void printSum() {
		System.out.println("재정의 메소드 : 부모");
	}
}

public class Override_Ex extends Admin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// 메소드 명을 동일하게 해야 메소드 오버라이딩이 된다.
	void printSum() {
		System.out.println("재정의 받은 멧소드 : 자식");
	}

}
