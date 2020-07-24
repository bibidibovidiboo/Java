package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.text.*; // ��¥��ȯ => SimpleDateFormat
import com.sist.back.*;
public class BoardMainFrame extends JFrame implements ActionListener {
	
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane(); // CardLayout ���� ���̿� ��
	// ���α׷� ���� => ArrayList => BoarderManager
	BoardManager bm=new BoardManager();
	public BoardMainFrame() {
		// �Ǹ���� 
		tp.addTab("�Խ��Ǹ��", bp); // �� ������ �̵�
		tp.addTab("�۾���", bi); // ������ �̵�
		tp.setTabPlacement(tp.BOTTOM); // ���� �Ʒ��� �̵�
		// tp.setSelectedIndex(1); // �۾��Ⱑ ���� �߰� �Ϸ��� 
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this); // ����
		bi.b1.addActionListener(this); // �۾���
		bi.b2.addActionListener(this); // ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bp.b) {
			// �۾��� ȭ�� �̵�
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) {
			// ArrayList�� ����
			// �Է��� �����͸� �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getName();
			String pwd=String.valueOf(bi.pf.getPassword());
			// password�� char[]�� �Ǿ��ִ� => �̺κ� �ڡ�
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); // ArrayList�� �߰�
			// ����߰� => �޼ҵ�
			listPrint();
			// ����̵�
			tp.setSelectedIndex(0);
			
		}
		else if(e.getSource()==bi.b2) { // ���
			// ������� �̵�
			tp.setSelectedIndex(0);
		}
		
	}
	public void listPrint() {
		// ArrayList�ޱ�
		ArrayList<BoardVO> list=bm.select();
		// ���̺� ���
		// ���̺� �����
		// () ����� ���� ��
		for(int i=bp.model.getRowCount()-1;i>=0;i--) {
			bp.model.removeRow(i);
		}
		// �Ǹ��������� 0���� �� �� ���� ������ 
		
		// ���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); // ��¥���� ��
		// MM (��) mm (��)
		for(BoardVO vo:list) {
			String[] data= {
					String.valueOf(vo.getNo()), // ������ �ȵ��� �տ� ��Ʈ�� �ٿ��� ����ȯ
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()), // ��¥��ȯ => ���� import
					String.valueOf(vo.getHit())
			};
			bp.model.addRow(data);
		}
	}

}