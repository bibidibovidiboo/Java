// < 문제  >
// PPT 마지막 문제
import java.util.*;
public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int jumsu[]= {95,88,76,62,55};
		
		// 입력값 받기
		Scanner scan=new Scanner(System.in); 
		
		boolean bCheck=false;
		while(true) {
			bCheck=false; // ** 다시리셋
			System.out.print("과목 입력:");
			String subject=scan.nextLine();
			if(subject.equals("그만")) {
				break;
			}
			for(int i=0;i<course.length;i++) {
				if(subject.equals(course[i])) 
				{
					bCheck=true;
					System.out.println(jumsu[i]); 
				} 
				/*
				else {
				System.out.println("없는 과목입니다!!"); 
				} 
				여기에 넣으면  else를 5번 돌릴 수 있으므로 밖에다  if를 선언해야함 ★★
				 */
			}
			if(bCheck==false) {
				System.out.println("없는 과목입니다!!");
			}
			// 안넣으면 여기서 끝나면  false라 위로 올라가면 안돼서 ** 다시 넣음
		}
	
	} 
}