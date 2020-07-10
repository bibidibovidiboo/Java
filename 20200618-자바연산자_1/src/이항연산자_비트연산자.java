/*  < 비트연산자  >
 *	비트연산자 => 비트와 비트를 연산
 *		8
 *		========
 *		1 0 0 0 
 *		========
 * 		6 
 * 		========
 * 		0 1 1 0
 * 		========
 * 			& ㅣ ^ ==> 회로, 암호화/복호화
 * 		===========
 * 		00	0 0	 0
 * 		01	0 1	 1
 * 		10	0 1  1
 * 		11	1 1  0
 *		===========
 *		
 *		10 & 5
 *
 *		1010
 *		0101 => 101인데 비트 맞춰주려고 앞에 0넣음
 *		===== &
 *		0000  (위아래 곱하면) => 0 
 *
 * 		1010
 * 		0101
 * 		==== |
 * 		1111 ==> 15
 * 
 * 		1010
 * 		0101
 * 		==== ^
 * 		1111 => 15
 * 
 * 		27 & 13
 * 		11011
 * 		01101
 * 		=====
 * 		00000 ===> 9
 * 
 *  	27 | 13
 *		11011
 * 		01101
 * 		===== |
 * 		11111 ===> 31
 * 
 * 		11011
 * 		01101
 * 		=====
 * 		10110 ===> 22
 * 
 * 
 *  	27 ^ 13
 * 
 * 		27
 * 	     11011
 * 		13
 * 		 01101
 * 
 */
public class 이항연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10&5);
		System.out.println(10|5);
		System.out.println(10^5);
	
		System.out.println(27 & 13); //9
		System.out.println(27 | 13); //31
		System.out.println(27 ^ 13); //22
		System.out.println(0b10110);
		
		System.out.println(Integer.toBinaryString(10));
	
	}

}
