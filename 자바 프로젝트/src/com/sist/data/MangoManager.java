package com.sist.data;
import java.util.*;

import java.io.*;
public class MangoManager {
	private static ArrayList<MangoVO> list= new ArrayList<MangoVO>();
	
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\five\\mango.txt");
			// �޸𸮿� ��ü �����͸� ��Ƽ� ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String mango=in.readLine(); // readLine() => \n
				if(mango==null) break;//���� => ���� �� ���� ���
				/*
				 1|1|���̽ź�|
				 4.8|
				 ����� ������ �Ż絿 539 ��ȭ����|
				 02-546-9215|
				 ����ī�� / ���� / ��ġ|
				 2����-3����|
				  �߷�|
				 ��-��: 17:30 - 24:00 ��-��: 17:30 - 02:00|
				 https://mp-seoul-image-production-s3.mangoplate.com/832260_1538990876392786.jpg?fit=around
				 */
				StringTokenizer st=new StringTokenizer(mango, "|");
				while(st.hasMoreTokens())
				{
					MangoVO vo=new MangoVO();
					vo.setFno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					String score=st.nextToken();
					vo.setScore(score.trim());
					vo.setAddress(st.nextToken());
					vo.setTel(st.nextToken());
					vo.setType(st.nextToken());
					vo.setPrice(st.nextToken());
					vo.setParking(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setPoster(st.nextToken());
					list.add(vo);
				}
			}
					
				
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	/*
	public ArrayList<MangoVO> mangoListData(int page)
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		
		for(MangoVO vo:list)
		{
			if(i<10 && j>=pagecnt) //pagecnt: ������ġ
			{
				mangos.add(vo);
				i++; // 10���� �����ִ� ����
			}
			j++; // for ���ư��� Ƚ��
		}
		return mangos;
	}
	*/
	
	public int mangoTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		
	}
	//�󼼺���
	public MangoVO mangoDetailData(int fno)
	{
		return list.get(fno-1);
	}
	//��ȭ��ü�б�
	public ArrayList<MangoVO> mangoAllData(int cno)
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>();
		for(MangoVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				mangos.add(vo);
			}
		}
		return mangos;
	}
	// ��ȭ�˻� 
	public ArrayList<MangoVO> mangoFindData(String ss) // ArrayList:�����迭=>�˻�� �´� �������� VO�� ��� ó��
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>(); 
		// list ���� ������ ã�� -> movies�� ����
		for(MangoVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				mangos.add(vo);
			}
		}
		return mangos;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������:");
		int page=scan.nextInt();
		
		MangoManager m=new MangoManager();
		System.out.println(page+" page / "+m.mangoTotalPage()+" pages");
		
		/*
		//������ �б�
		ArrayList<MangoVO> list=m.mangoListData(page);
		
		for(MangoVO vo:list){
			System.out.println(vo.getTitle());
		}
		*/
	}
}
