/* < IndexOf >
 * 	IndexOf , lastIndexOf => 문자의 위치 찾기 => 정수
 *  문자 자르기 => substring() 이 안에 넣을 때 많이 등장함
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="fsdfsa.jfsdjfjsjdfjsdfjsdfj.java";
		// 앞에서 . 찾을 때 IndexOf , 뒤에서 . 찾을 때 lastIndexOf ★
		System.out.println(msg.indexOf(".")); // 0부터 시작해서 6
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자:"+msg.substring(msg.lastIndexOf(".")+1)); 
		// substring() 안에꺼를 셀 수 없으니 통째로 넣고 0부터 시작이라 +1 했음 
	}
}
