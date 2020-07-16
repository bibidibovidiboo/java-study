/*	< 추상 클래스  >
 * 	 => 미완성된 클래스
 * 	 => new를 사용해서 메모리 할당이 불가능
 * 	 class A
 * 		=> A a=new A();
 * 	 abstract class B
 * 		=> B b=new B(); ==> ERROR
 * 	 => 항상 상속을 내려서 하위 클래스에서 구현한 다음에 사용
 * 	 => 기본 틀이 존재
 * 	 => 제시만 한다 : 구현하는 내용이 프로그램마다 다를 수도 있다
 * 		예) 
 * 			도형
 * 
 *   예)
 *   	1. 게시판을 만들어라
 *   	2. 게시판에는 글쓰기,내용보기,수정,삭제,찾기
 *   
 *   예) 
 *   	영화관
 *   	=======	
 *   		영화목록
 *   		예매
 *   		영화 상세보기
 *   		이벤트
 *   		극장 설명
 *   	===============
 *   	cgv 메가박스 등등
 *    
 */
package com.sist.abs;
abstract class 도형 {
	public abstract void draw();
	public void color() {
		System.out.println("검정색으로 그림을 그린다");
	}
}
class 삼각형 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	// 정의 변경 => 재정의
	
	// override - color
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("빨간색으로 그림을 그린다");
	}	
	
}
class 원 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 사각형 extends 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
public class MainClass {
	public static void main(String[] args) {
		// 도형 g=new 도형() => X
		// 구현하는 얘의 생성자를 받는다 ★
		도형 g=new 삼각형(); 
			g.color();
			g.draw();

			g=new 사각형();
			g.color();
			g.draw();
			
			g=new 원();
			g.color();
			g.draw();

	}
}
























