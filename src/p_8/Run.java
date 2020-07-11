package p_8;

public class Run {

	public static void main(String[] args) {
		
//		<<상속>>
//		  목표 : 상속 테스트하기
//		  요구 : 부모 클래스인 Phone과 각각의 자식 클래스인 Iphone, Android클래스를 만들어 오버라이딩을 해보자.
//		  
//		  		-Phone클래스
//		  			String name;	//이름
//	      			int price;	//가격
//		  
//		  		-Iphone클래스
//		  			int Pnumber;	//생산번호
//		
//		  		-Android클래스
//		  			int date;	//보증기간
//		  
//		  		-Phone와 Iphone은 toString()을 만들어 쓴다. Android는 만들지 않는다.
//		 		-자식 클래스는 부모가 가진 데이터 외에도 각각 위에서 기술한 데이터를 가지며,toString()으로 출력한다.
//				-Phone클래스에 벨소리 call()을 만들어 이후 자식 클래스에서 오버라이딩한다.
//				-Android에서 별도의 toString()을 만들지 않아 가진 데이터에 비해 어떻게 출력되는지 확인하자.
//		 
//		 출력 예시 : 
//		Phone [name=폴더폰, price=300000]
//		Iphone [Pnumber=1, name=백설공주, price=1000000]
//		Phone [name=로켓, price=1100000]
//
//		띠리리리링~
//		사과사과사과~
//		우주우주우주~

		
		
		Phone p = new Phone("폴더폰", 300000, 016);
		Phone p1 = new Iphone("백설공주", 1000000, 010, 001);
		Phone p2 = new Android("로켓", 1100000, 010, 20200709);
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("");
		System.out.println(p.call());
		System.out.println(p1.call());
		System.out.println(p2.call());
	}

}
