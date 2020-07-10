// < 제어문정리 예제  >
// 윈도우 창 띄워서 연습
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm extends JFrame implements ActionListener {
	JMenuBar bar=new JMenuBar();
	JMenuItem open=new JMenuItem("열기");
	JMenuItem save=new JMenuItem("저장");
	JMenuItem copy=new JMenuItem("복수");
	JMenuItem close=new JMenuItem("종료");
	// 생성자 ==> 클래스 저장
	public MainForm() {
		// 메뉴 구성
		JMenu file=new JMenu("파일");
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(close);
		bar.add(file);
		
		// 윈도우 올리기
		setJMenuBar(bar);
		// 윈도우 크기결정
		setSize(1024, 768);
		setVisible(true); // 윈도우 보여준다
		
		open.addActionListener(this); //  이벤트 등록
		save.addActionListener(this);
		copy.addActionListener(this);
		close.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open) // open 메뉴를 눌렀더니
		{
			JOptionPane.showMessageDialog(this,"파일 열기 선택");
		}
		else if(e.getSource()==save) 
		{
			JOptionPane.showMessageDialog(this,"파일 저장 선택");
		}
		else if(e.getSource()==copy) 
		{
			JOptionPane.showMessageDialog(this,"파일 복사 선택");
		}
		else if(e.getSource()==close) 
		{
			JOptionPane.showMessageDialog(this,"파일 닫기 선택");
		}
	}
	
}
