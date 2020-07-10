/*	<연산자 복습>
 * 	연산자 => 큰타입
 * 		1) 같은 타입으로 변환 => 연산처리
 * 			int + long 
 * 			===
 * 			long
 * 
 * 			double + int
 * 					 ===
 * 					 double ===> 자동형변환
 * 			모든 연산처리 ==> 큰타입으로 변환 후에 사용
 * 		2) 작은타입으로 변경한 다음에 처리 ==> 강제 형변환
 * 		3) int이하 연산자 (byte,short,char) ==> 자동으로 int로 변환
 * 		4) / => 0으로 나눌 수 없다 , 정수/정수=정수(소수점을 지운다)
 * 		5) % => 부호(음수 - , 양수 +)가 왼쪽부호를 따라간다
 * 
 * 		==> 단항연산자
 * 			++ , -- : 전위형, 후위형
 * 					  ++a   a++
 * 					  ====  ====
 * 					   먼저 증가 => 다른 문장 수행
 * 					  ==> 반드시 정수에서만 사용
 * 					  	  ============
 * 						  byte, short, int, long, char
 * 						  char a='A'
 *    					  a++; ==> 'B'
 *    					  ** char는 모든 연산을 수행시에 int변경		
 * 			!	:	부정 연산자 ==> boolean만 사용이 가능
 * 					 true=>false, false=>true
 * 					 ==>  턴
 * 			(type) : 강제로 데이터형을 변경
 * 					 10.5 => (int)10.5 => 10
 * 					 65   => (char)65 => 'A'
 * 					 10   => (double)10 => 10.0
 * 					 =>  변경불가 : boolean
 * 		==> 이항연산자 
 * 			= 산술연산자 (+.-.*,/,&)
 * 				==> 통계, 급여 계산, 인사고과, 금융입출금
 * 			  * 산술변환 ==> 92page
 * 				byte+byte => int
 * 				byte b1=10;
 * 				byte b2=20;
 * 				byte b3=b1+b2; ==> error
 * 						-----
 * 						int
 * 				char + char = int
 * 				========== 조건문, 반복문
 * 			=========
 * 			= 비교연산자 ( ==, !=, <, >, <=, >=)
 * 						==
 * 						오라클 => =
 * 						ES6.0(JavaScript) : React => ===
 * 						필수조건
 * 						=> Java,C#,C/C++ 이 중 1개는 필수
 * 						=> 데이터베이스(오라클,MySQL,MongDB)
 * 						=> JSP,Spring
 * 						우대조건
 * 						=> React,Redux (프론트)
 * 						=> Vue (프론트)
 * 						=> 장고 => 파이썬 (데이터 분석) => AI
 * 			= 논리연산자 ( && , || ) : checkIN,chackOut,
 * 								       예매,예약,경매
 * 								   BETWEEN ~ AND
 * 								   && => AND
 * 								   == 입력값을 받는 경우
 * 								   || => OR
 * 								   == "ab"+8 ==> ab7
 * 									
 * 			  && : 범위,기간이 포함,특정부분을 제외
 * 			  || : 범위나 기간을 벗어난 경우
 * 			========= 결과값은 항상 boolean (true/false)
 * 			= 대입연산자 ( +=, =, -= )
 * 			  int a=10;
 * 			  a+=2; =====> a=a+2;
 * 
 * 			  5개 증가
 * 			  =====
 * 			  a++;
 * 			  a++;
 * 			  a++;
 * 			  a++;
 * 			  a++;
 * 			  ==========> a+=100 ==> a=a+5
 * 
 */
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
