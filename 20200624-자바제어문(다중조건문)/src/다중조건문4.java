/*	< ´ÙÁß if¹® ¹®Á¦  >
 * 
 *	¹®Á¦ 1¹ø)
 * 	»ç¿ëÀÚ => Á¤¼öÀÔ·Â (1~12)
 * 	12,1,2 => °Ü¿ïÀÔ´Ï´Ù
 * 	3,4,5, => º½ÀÔ´Ï´Ù
 * 	if(month==3 || month==4 || month==5) -> ³»°¡ ÄÚµùÇÑ ¹æ½Ä
 * 	if(month>=3 && month<=5) -> ÀÌ°Íµµ °¡´É 
 * 	6,7,8 => ¿©¸§ÀÔ´Ï´Ù
 * 	9,10,11 => °¡À»ÀÔ´Ï´Ù
 * 
 *  =======================
 *  ¹®Á¦ 2¹ø)
 *  ¹®ÀÚ¸¦ ÀÔ·ÂÀ» ¹Þ¾Æ¼­ char ch
 *  	= ¼ýÀÚ ch>='0' && ch<='9'
 *  	= ¾ËÆÄºª ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *  	= ÇÑ±Û ch>='°¡' && ch<='ÆR' // ÆRÀÌ ÇÑ±Û ¸¶Áö¸· ±ÛÀÚÀÓ
 *  	= Æ¯¼ö¹®ÀÚ
 */
import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ¹®Á¦ 1¹ø)
		Scanner scan=new Scanner(System.in);
		System.out.println("Á¤¼öÀÔ·Â (1~12):");
		int month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println(month+"¿ùÀº °Ü¿ïÀÔ´Ï´Ù");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println(month+"¿ùÀº º½ÀÔ´Ï´Ù");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println(month+"¿ùÀº ¿©¸§ÀÔ´Ï´Ù");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println(month+"¿ùÀº °¡À»ÀÔ´Ï´Ù");
		}
		else {
			System.out.println("Àß¸øµÈ ÀÔ·ÂÀÔ´Ï´Ù");
		} */
		
		// ¹®Á¦ 2¹ø
		char ch='A'	; // º¯¼ö¼±¾ð
		
		Scanner scan=new Scanner(System.in);
		System.out.println("¹®ÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À:");
		ch=scan.next().charAt(0); // nextInt ´ë½Å ¹®ÀÚ´Â ÀÌ°É »ç¿ëÇØ¾ßÇÔ
		
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"´Â(Àº) ¼ýÀÚÀÔ´Ï´Ù");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println(ch+"´Â(Àº) ¾ËÆÄºªÀÔ´Ï´Ù");
		}
		else if(ch>='°¡' && ch<='ÆR') {
			System.out.println(ch+"´Â(Àº) ÇÑ±ÛÀÔ´Ï´Ù");
		}
		else {	
			System.out.println(ch+"´Â(Àº) Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù");
		}
	} 

}
