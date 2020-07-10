// < 선택문  >
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		 // {int a=10;} 이러면 a가 사라진다 -> 블록 안에서만 쓸 수 있다 , {} 언제든지 쓸 수 있다
		switch(a) {
		case 10:
		{
			int b=100;
			System.out.println("a="+a+",b="+b);
			break;
		}
		case 11: // case 사이에 {} 넣어서 똑같은 변수명 사용가능 (지역변수=블록변수) -> 자동으로 사라짐
			{
			int b=200;
			System.out.println("a="+a+",b="+b);
			break;
		}
		}
	}

}
