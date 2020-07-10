// < 네이버영화 예제  - 무비파인드 >
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.*;
public class MovieFind extends JPanel {
	JLabel la=new JLabel("영화 검색",JLabel.CENTER);
	JLabel la2=new JLabel("Search");
	JTextField tf=new JTextField(); // 검색창 
	JTable table;
	DefaultTableModel model;
	TableColumn column;
	MovieFind(){
		setLayout(null);
		
		la.setFont(new Font("맑은 고딕",Font.BOLD,45));
		la.setBounds(10, 15, 1260, 50);
		add(la);

		la2.setBounds(100, 75, 100, 35); // search창 
		add(la2);
		
		tf.setBounds(205, 75, 300, 35); // 입력창
		add(tf);
		
		String[] col= {"순위","영화명","감독","장르","출연"};
		String[][] row=new String[0][5];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		table.setRowHeight(40); // 행 높이 늘리기
		table.getTableHeader().setReorderingAllowed(false);		

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
		
		for(int i=0;i<5;i++) {
			// 표의 컬럼의 길이를 설정 
			column=table.getColumnModel().getColumn(i);

			if(i==0) {
				column.setPreferredWidth(50);
			}
			else if(i==1) {
				column.setPreferredWidth(250); // 영화명
			}
			else if(i==2) {
				column.setPreferredWidth(220); // 감독
			}
			else if(i==3) {
				column.setPreferredWidth(150); // 장르
			}
			else if(i==4) {
				column.setPreferredWidth(450);
			}
			
		}
		

		
	}

}
