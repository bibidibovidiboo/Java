package com.sist.server;
// 입출력 (서버-클라이언트의 데이터 주고받기)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
// 다른 컴퓨터와 연결
import java.net.ServerSocket;
import java.net.Socket;
// network => net => 라이브러리
import java.util.StringTokenizer;
import java.util.Vector;
import com.sist.common.Function;
/*
 * 	일반 서버 (Appplication) => Socket(연결 기계)
 * 	웹서버 => URL
 *	==================== 연결지향적 프로그램 (TCP) 
 *
 */
// Server => 접속만 담당 => 저장
// Client => 실제 통신 담당 => 클라이언트마다 따로 통신 => 쓰레드 이용
public class Server implements Runnable{
	private ServerSocket ss; // 접속을 받는 클래스 => 정보 저장
	private final int PORT=3355; 
	// 클라이언트 접속 시에 저장(IP,PORT)
	private Vector<Client> waitVc=new Vector<Server.Client>();
	
	// 서버 가동 => 접속만 담당
	public Server() {
		try {
			ss=new ServerSocket(PORT);
			/*
			 *  bind() => IP , PORT 묶어주는 역할
			 *  	=> 핸드폰 (개통)
			 *  listen() => 대기상태 (클라이언트가 접속하기 전까지 대기)
			 *  
			 */
			System.out.println("Server Start...");
		}catch (Exception ex) {
		}
	}
	// 클라이언트가 접속을 했을 경우 => 각자 통신이 가능하게 쓰레드와 연결
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				Socket s=ss.accept();
				// accept() : 특수한 메소드 => 클라이언트가 접속 시에만 호출되는 메소드
				Client client=new Client(s);
				client.start(); // 클라이언트와 통신 승인
			}
		}catch(Exception ex) {
		}
	}
	
	// 쓰레드에서 동기화 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서버 가동
		Server server=new Server();
		new Thread(server).start(); 
		// ㄴ ( ) <- 매개변수 , 생성자였다면  this , static은 this가 존재하지 않아서 객체를 생성해서 넣었음
	}
	
	// 내부클래스 => Server가 가지고 있는 데이터 쉽게 공유가 가능하게 만든다
	// 실제 통신 담당 
 	class Client extends Thread{
 		// 클라이언트와 연결
 		Socket s;
 		// 클라이언트로부터 요청을 받는다
 		BufferedReader in;
 		// 요청을 처리 한 다음에 결과를 응답
 		OutputStream out;
 		// 변수 설정
 		String id,name,sex,pos;
		public Client(Socket s) {
			try {
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 클라이언트가 요청한 메소드를 읽어오는 메모리 공간
				out=s.getOutputStream();
			}catch (Exception ex) {}
		
		}
		// 통신? => 기능 (요청처리)
		public void run()
		{
			try
			{
				while(true)
				{
					// 클라이언트가 요청한 내용을 받는다 
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					//  100|id|대화명|성별
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실"; // 사용자의 기본 정보
							
							// 접속한 모든 사용자 => 로그인 한 정보를 보내준다
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							// 접속한 사람의 정보를 저장
							waitVc.add(this);
							// Client client=new Client();
							messageTo(Function.MYLOG+"|"+id);
							// 로그인 창에서 => 대기실 창으로 변경
							for(Client user:waitVc) {
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
							}
							// 입장메세지 출력
							messageAll(Function.WAITCHAT+"|[☞"+name+"님이 입장하셨습니다]");
							// 개설된 방정보 전송
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;
					}
				}
			}catch(Exception ex){}
		}
		/*
		 * 쓰레드는 defualt => 비동기화
		 * synchronized => 동기화
		 * 
		 */
		// 응답처리
		// 개인적으로 전송
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
				// 인코딩 => 디코딩
			}catch (Exception ex) {
			}
		}
		// 전체적으로 전송
		public synchronized void messageAll(String msg) {
			try {
				for(Client user:waitVc) {
					user.messageTo(msg);
				}
			}catch (Exception ex) {}
		}
	}	
}
