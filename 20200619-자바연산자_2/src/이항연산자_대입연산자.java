/*		< ���Կ�����  >
 * 		���� => ������� �޴´�
 * 		����)
 * 			=> int a=10 => 10�� a��� �޸𸮿� �����Ѵ�
 * 			���մ��Կ�����
 * 			op= => op(������)
 * 			+=
 * 				ex) int a=10;
 * 					a+=2; => a=a+2
 * 					a=12
 * 			-=
 * 				ex) int a=10;
 * 					a-=5 => a=a-5
 * 					a=5
 * 			*=
 * 				ex) int a=10;
 * 					a*=5 => a=a*5
 * 					a=50
 * 			/=
 * 			%=
 * 			&=
 * 				int a=10;
 * 					a&=3; => a=a&3
 * 					1010
 * 					0011	
 * 					====
 * 					0010   => 2 
 * 				
 * 			|=
 * 				ex) int a=10;
 * 					a|=3; => a=a|3
 * 					1010
 * 					0011	
 * 					====
 * 					1011   => 11
 * 			<<=
 * 				ex) int a=10;
 * 					a<<=3; => a<<3 =a*2��3��
 * 					a=80
 * 			>>=
 * 				ex) int a=10;
 * 					a>>=3; => a>>3 =a/2��3��
 * 					a=1
 * 
 * 			�Ѱ����� : ����������
 * 			  ++
 * 			���ϴ°�����ŭ���� : ���� ���Կ�����
 * 			  +=5
 * 
 */
public class ���׿�����_���Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//���մ��� ������
		//���� => 1�� ����(++)
		//a++;a++;a++; => a+=3
		a+=5; //a=a+5 => 15
		System.out.println("a="+a);
		
		int b=10;
		b-=5; //b=b-5 => 5
		System.out.println("b="+b);
		
		int c=10;
		c*=5;
		System.out.println("c="+c);
		
		int d=10;
		d/=3;
		System.out.println("d="+d);

	}

}
