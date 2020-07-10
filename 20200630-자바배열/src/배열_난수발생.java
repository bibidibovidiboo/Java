/*   < 난수발생  >	
 * 	 Math.random() 
 */
public class 배열_난수발생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 번호 저장하는 공간 ==>
		int[] lotto=new int[6];
		for(int i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
		// 출력
		for(int i:lotto) {
			System.out.print(i+" ");
		}
	}
}
