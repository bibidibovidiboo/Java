package com.sist.back;
import java.util.*;
public class BoardManager {
	private static ArrayList<BoardVO> list = new ArrayList<BoardVO>();
	// �Խ����� ��ΰ� �� �� �ְ� staitic ����ؼ�  �������� �������� 
	
	// private int no => ��� �Է°� �޾����� ���ؼ� �ؿ�  ������ �Ἥ �ڵ����� ������
	public int sequence() // �ڵ� ���� ��ȣ ���� => �������� ���߿� ����Ŭ���� ����
	{
		int max=0;
		for(BoardVO vo:list) {
			if(max<vo.getNo()) {
				max=vo.getNo();
			}
		}
		return max+1;
	}
	
	// �߰�
	public void insert(BoardVO vo) {
		vo.setRegdate(new Date()); // new Date : ���� ��¥ #
		vo.setNo(sequence()); // # �� �ΰ��� ���α׷��Ӱ� �Է�������� ��
		// vo.setHit(0); => �̰� �� �ᵵ 0���� ����Ʈ�� �̰� �ȳ־��
		list.add(vo);
	}
	
	// ��� ���
	public ArrayList<BoardVO> select(){
		return list;
	}
}
