// < ���̹���ȭ ����  - �������ε� >
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.*;
public class MovieFind extends JPanel {
	JLabel la=new JLabel("��ȭ �˻�",JLabel.CENTER);
	JLabel la2=new JLabel("Search");
	JTextField tf=new JTextField(); // �˻�â 
	JTable table;
	DefaultTableModel model;
	MovieFind(){
		setLayout(null);
		
		la.setFont(new Font("���� ���",Font.BOLD,45));
		la.setBounds(10, 15, 1260, 50);
		add(la);

		la2.setBounds(100, 75, 100, 35); // searchâ 
		add(la2);
		
		tf.setBounds(205, 75, 300, 35); // �Է�â
		add(tf);
		
		String[] col= {"����","��ȭ��","����","�帣","�⿬"};
		String[][] row=new String[0][5];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		MovieVO[] movies=MovieManager.movieFindData(1);
		for(MovieVO vo:movies) {
			String[] temp={
				String.valueOf(vo.mno),
				vo.title,
				vo.director,
				vo.genre,
				vo.actor
			};
			
			model.addRow(temp);
		}
	
		js.setBounds(10, 120, 1260, 750);
		add(js);

		
	}

}
