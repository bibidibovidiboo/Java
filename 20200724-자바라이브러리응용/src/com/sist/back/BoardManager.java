package com.sist.back;
import java.util.*;
public class BoardManager {
	private static ArrayList<BoardVO> list = new ArrayList<BoardVO>();
	// 게시판은 모두가 볼 수 있게 staitic 사용해서  공통으로 생성해줌 
	
	// private int no => 얘는 입력값 받아주질 못해서 밑에  시퀀스 써서 자동증가 시켜줌
	public int sequence() // 자동 증가 번호 제작 => 시퀀스는 나중에 오라클에도 나옴
	{
		int max=0;
		for(BoardVO vo:list) {
			if(max<vo.getNo()) {
				max=vo.getNo();
			}
		}
		return max+1;
	}
	
	// 추가
	public void insert(BoardVO vo) {
		vo.setRegdate(new Date()); // new Date : 오늘 날짜 #
		vo.setNo(sequence()); // # 이 두개는 프로그래머가 입력해줘야할 값
		// vo.setHit(0); => 이거 안 써도 0값이 디폴트라 이거 안넣어도됨
		list.add(vo);
	}
	
	// 목록 출력
	public ArrayList<BoardVO> select(){
		return list;
	}
}
