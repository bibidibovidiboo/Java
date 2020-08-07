package com.sist.data;

import java.util.*;

import java.io.*;

public class MusicManager {
   private static ArrayList<MusicVO> list = new ArrayList<MusicVO>();
   static {
      try {
        
         FileInputStream fr = new FileInputStream("c:\\javaDev\\five\\music.txt");

         BufferedReader in = new BufferedReader(new InputStreamReader(fr));
         while (true) {
            String music = in.readLine(); 
        
            if (music == null)
               break;
          
            StringTokenizer st = new StringTokenizer(music, "|"); 
            while (st.hasMoreTokens()) {
               MusicVO vo = new MusicVO();
               vo.setMno(Integer.parseInt(st.nextToken())); 
               vo.setCno(Integer.parseInt(st.nextToken()));

               vo.setTitle(st.nextToken()); // ����
               vo.setCover(st.nextToken()); // �ٹ�Ŀ��
                              
               vo.setArtist(st.nextToken()); // ��Ƽ��Ʈ
               vo.setGenre(st.nextToken()); //  �帣
         
               vo.setRelease(st.nextToken()); // �߸���
               
               vo.setKinds(st.nextToken()); // ����
               vo.setCompany(st.nextToken()); // ��ȹ��
               vo.setDistributor(st.nextToken()); // �����
            
               // ����ð� 
               String time = st.nextToken();
              
                   vo.setTime(time.trim());  
               
               list.add(vo);

            }
         }
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

   public ArrayList<MusicVO> musicListData(int page) {
      ArrayList<MusicVO> movies = new ArrayList<MusicVO>();
      int i = 0;
      int j = 0;
      int pagecnt = (page * 10) - 10;
  
      for (MusicVO vo : list) {
         if (i < 10 && j >= pagecnt) 
         {
            movies.add(vo);
            i++;
         }
         j++;
      }
      return movies;
   }

   public int movieTotalPage() {
      return (int) Math.ceil(list.size() / 10.0);
   }

   // �󼼺���
   public MusicVO musicDetailData(int mno) {
      return list.get(mno - 1);
   }

   // ��ȭ ��ü �б�
   public ArrayList<MusicVO> MusicAllData(int cno) {
      ArrayList<MusicVO> music = new ArrayList<MusicVO>();
      for (MusicVO vo : list) {
         if (vo.getCno() == cno) {
            music.add(vo);
         }
      }
      return music;
   }
   // �˻�
   public ArrayList<MusicVO> musicFindData(String ss)
   {
      ArrayList<MusicVO> movies=new ArrayList<MusicVO>(); // �����迭
      //list
      for(MusicVO vo:list)
      {
         if(vo.getTitle().contains(ss))
         {
            movies.add(vo);
         }
      }
      return movies;
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("������ : ");
      int page = scan.nextInt();
      MusicManager m = new MusicManager();
      System.out.println(page + "page /" + m.movieTotalPage() + " pages");

      // ������ �б�

      ArrayList<MusicVO> list = m.musicListData(page);

      for (MusicVO vo : list) {
   
         
         System.out.println("��   ��:"+vo.getTitle());//(st.nextToken()); // ����
         System.out.println("�ٹ�Ŀ��:"+vo.getCover());//("https:" + st.nextToken()); // �ٹ�Ŀ��
         System.out.println("��Ƽ��Ʈ:"+vo.getArtist());
         System.out.println("��      ��:"+vo.getGenre()); //  �帣
         System.out.println("�� �� ��:"+vo.getRelease()); // �߸���
         System.out.println("��     ��:"+vo.getKinds()); // ����
         System.out.println("�� ȹ ��:"+vo.getCompany()); // ��ȹ��
         System.out.println("�� �� ��:"+vo.getDistributor()); // �����
         System.out.println("�� �� �� ��:"+vo.getTime()); // �ð�
         
      }
   
   }
}