/* < 조건문 제작하는 방법  >
 *	if(조건문) : 조건문은 무조건 결과값 ==> true/false
 *		==> 필요한 경우(조건 : true) 에만 문장을 수행
 * 			false일 경우에는 건너뛴다 (문장을 수행하지 못한다)** 
 */
public class 자바단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); // a값이 짝수일 경우에 출력
		 * if(a%2==0) // 내가 필요한 위치에 넣고 제어할 수 있음 System.out.println("3"); // 얘는 출력이 안됨
		 * 
		 * System.out.println("4"); System.out.println("5");
		 */
		
		// 알파벳을 저장 => 대문자, 소문자
		// 범위가 저장되면 && 사용 , 저장 안되면 || 사용
		char alpha='K';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는(은) 대문자입니다");
		if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"는(은) 소문자입니다");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"는(은) 숫자입니다");
		if(alpha>='가' && alpha<='힣')
			System.out.println(alpha+"는(은) 한글입니다");
		// 특수문자
		if(alpha=='\t' || alpha=='\n')
			System.out.println(alpha+"특수문자 입니다");
		
	}

}
