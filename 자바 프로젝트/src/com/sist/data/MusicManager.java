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

               vo.setTitle(st.nextToken()); // 제목
               vo.setCover(st.nextToken()); // 앨범커버
                              
               vo.setArtist(st.nextToken()); // 아티스트
               vo.setGenre(st.nextToken()); //  장르
         
               vo.setRelease(st.nextToken()); // 발매일
               
               vo.setKinds(st.nextToken()); // 종류
               vo.setCompany(st.nextToken()); // 기획사
               vo.setDistributor(st.nextToken()); // 유통사
            
               // 재생시간 
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

   // 상세보기
   public MusicVO musicDetailData(int mno) {
      return list.get(mno - 1);
   }

   // 영화 전체 읽기
   public ArrayList<MusicVO> MusicAllData(int cno) {
      ArrayList<MusicVO> music = new ArrayList<MusicVO>();
      for (MusicVO vo : list) {
         if (vo.getCno() == cno) {
            music.add(vo);
         }
      }
      return music;
   }
   // 검색
   public ArrayList<MusicVO> musicFindData(String ss)
   {
      ArrayList<MusicVO> movies=new ArrayList<MusicVO>(); // 가변배열
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
      System.out.println("페이지 : ");
      int page = scan.nextInt();
      MusicManager m = new MusicManager();
      System.out.println(page + "page /" + m.movieTotalPage() + " pages");

      // 데이터 읽기

      ArrayList<MusicVO> list = m.musicListData(page);

      for (MusicVO vo : list) {
   
         
         System.out.println("제   목:"+vo.getTitle());//(st.nextToken()); // 제목
         System.out.println("앨범커버:"+vo.getCover());//("https:" + st.nextToken()); // 앨범커버
         System.out.println("아티스트:"+vo.getArtist());
         System.out.println("장      르:"+vo.getGenre()); //  장르
         System.out.println("발 매 일:"+vo.getRelease()); // 발매일
         System.out.println("종     류:"+vo.getKinds()); // 종류
         System.out.println("기 획 사:"+vo.getCompany()); // 기획사
         System.out.println("유 통 사:"+vo.getDistributor()); // 유통사
         System.out.println("재 생 시 간:"+vo.getTime()); // 시간
         
      }
   
   }
}