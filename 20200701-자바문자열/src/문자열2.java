// < ���� ��ȭ ���� >
// contains : ���Ե� ���ڿ� ã��
import java.util.*;
import javax.swing.*; // window
public class ���ڿ�2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {
				"#����ִ�",
				"���",
				"����� �ð�",
				"ħ����",
				"�¿���: �� �Ϸ��� ����",
				"�߱��ҳ�",
				"�ݵ�",
				"������ ���׽�",
				"��Ʈ�� �����",
				"������ ���",
			};
			
			String[] actor= {
				"������(���ؿ�), �ڽ���(������)",
				"������(����), ������(ȭ��), ����ȣ(�߽���)",
				"������(������), �����(�����), ���ر�(���ر�)",
				"����ȿ(����), �蹫��(����)",
				"�� Ȧ����(�̾� ����Ʈǲ ��Ҹ�), ũ���� ����(�߸� ����Ʈǲ ��Ҹ�)",
				"���ֿ�(�ּ���), ������(������)",
				"������, ������",
				"���ϸ� ��鸮(������), ���̹� ����(��), ���ٽ��� ����(����ũ)",
				"�⿬ũ������ ����(��罺 ����/��Ʈ��), ����Ŭ ����(��������), ���� �Ͻ�(��ī��)",
				"�� ���(P.T. �ٳ�), �� ������(�ʸ� Į����), �̼� ��������(ä��Ƽ �ٳ�)",
			};
			
			// �˻���â ���� - import javax.swing.* �־ �Ǵ� ��
			String ss=JOptionPane.showInputDialog("�˻��� �Է�");
			
		    // System.out.println(ss); 
		    // ss�� ���Ե��� ��������� 
			
			String temp="";
			for(String s:title) {
				// �����ϳ��� ss�� ���Եƴ°�
				if(s.contains(ss)) {
					temp+=s+"\n";
					//System.out.println(s);
				} 
				// �̰� �س�� â�� ������� �˻��� �ȴ� 
			}
			// System.out.println(temp);
			JOptionPane.showConfirmDialog(null, temp); // ������ ����â
			
			// �Ϲ����� �˻����� - contains / �α��� equals
			
	} //

}
