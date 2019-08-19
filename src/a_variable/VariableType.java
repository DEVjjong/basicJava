package a_variable;

public class VariableType {
	public static void main(String[] args){
		
		/*
		변수의 타입
		
		1. 기본형(primitive type)
			- boolean, char, byte, short, int, long, float, double
			
		2. 참조형(reference type)
			- 8개의 기본형을 제외한 나머지 타입
			- 객체의 주소를 저장한다.
			
		3. 종류
			- 논리형 : true, false중 하나의 값을 갖으며, 조건식과 논리적 계산에 사용된다.
					ex) boolean
			- 문자형 : 문자 하나를 저장하는데 사용된다.
					ex) char
			- 정수형 : 정수값을 저장하는데 사용된다.
					ex) byte, short, int, long
			- 실수형 : 실수형값을 저장하는데 사용된다.
			 		ex) float, double
			 		
		4. 기본형 변수의 크기 (1byte = 8bit)
		 	- 1byte : boolean, byte
		 	- 2byte : char, short
		 	- 4byte : int, float
		 	- 8byte :  long, double
		 	
		5. 논리형 - boolean(기본값 false)
			- boolean형 변수에는 true, false를 저장할 수 있다.
			- boolean형 변수는 대답(yes, no), 스위치(ON/OFF)
			- 데이터를 저장하는 최소단위가 1byte임으로 1byte의 크기를 가진다.
			
		6. 문자형 - char
			- 문자하나를 저장하기 위해 사용한다.  ex) 'A'
			- 정수형으로 표현이 가능하다. 
			- java는 Unicode 문자체계를 이용한다. => 16진수
			
		7. 정수형 - byte, short, int, long
			- 대표 자료형은 int 이다.
			- byte나 short의 경우 크기가 작아서 범위를 넘어서 잘못된 결과를 얻기 쉽다.
			  => int형을 사용하는 것이 좋다.
			- JVM의 피연산자 스택이 피연산자를 4byte단위로 저장하기 때문에 4byte형보다 작은 녀석들의 연산시에 4byte형태로 변환하여 연산한다.
			 
		8. 실수형 - float, double
			- 대표 자료형은 double이다.
			- 실수형 값을 저장하는데 사용된다.
			- float  : 1+8+23
			  double : 1+11+52
			- 실수형에서는 자료형을 선택할때 값의 범위뿐만 아니라 정밀도 중요한 요소가 된다.
			
		
	
			
		*/
		
		
		
//			변수 ab를 true의 값으로 초기화 해주세요.			
			boolean ab = true;
			
//			변수 ac를 'p' 의 값으로 초기화해 주세요.
			char ac = 'p';
			
//			byte형 변수 ad에 5000의 값을 저장해주세요.
			short ad = 5000;
			
//			변수 power를 fasle의 값으로 초기화해 주세요.
			boolean power = false;
			
//			power의 값을 true로 변경해주세요.
			power = true;
			
			char aa = 'A';
			char ba = 65;
			char ca = '\u0041'; // java에서는 '\' 뒤에 표시되는 문자는 특수문자로 인식한다.
			System.out.println(ca);
			
//			\  = 이 뒤로나오는 문자는 특수문자로 인식
//			\ u = 유니코드
//			\ n = 다음줄로 이동(엔터와 같음)
//			\ t = 스페이스바 4번 누른거와 동일
			
			
			String str = "============\n------------";
			System.out.println(str);
			
			
//			1. byte형 변수에 51을 저장해주세요.
			byte a1 = 51;
			
//			2. short형 변수에 500000을 저장해주세요.
			short a2 = 5000;
			
//			3. int형 변수에 20억을 저장해주세요.
			int a3 = 200000000;
			
//			4. long형 변수에 50억을 저장해주세요.
			long a4 = 5000000000L;  // JVM에서 4바이트 기본형(int) 범위를 넘어서면 오류가 난다. 그래서 뒤에 'L'을 붙여 표시한다.
			
//			1. float타입의 변수에 3.141592456908720394을 저장해주세요
			float a5 = 3.141592456908720394F;
			
//			2. double타입의 변수에 3.141592456908720394을 저장해주세요
			double a6 = 3.141592456908720394;
			
			System.out.println(a5);
			System.out.println(a6);
			
			
			byte bb = 126;
			System.out.println(bb);
			bb++;
			System.out.println(bb);
			bb++;
			System.out.println(bb); // 오버플로우(overflow) : 변수 자신이 저장할 수 있는 범위를 넘었을때 최소값부터 다시 표현하는 현상
			
			
			/*
		9. 형변환(casting)
			- 기본형 변수간에는 형변환이 가능하다.
			
			byte -> short -> int -> long -> float -> double
							  ^
							  |
							 char
			 
			 
			 */
			
			
//			1. short타입의 변수에 600의 값을 저장해주세요.
			short a7 = 600;
			
//			2. int타입의 변수에 50000을 저장해주세요.
			int a8 = 50000;
			
//			3. char타입의 변수에 'T'를 저장해주세요.
			char a9 = 'T';
			
//			4. a7의 값을 byte타입의 변수에 저장해주세요.
			byte a10 = (byte)a7;
			
//			5. a8의 값을 char타입에 저장해주세요.
			char a11 = (char)a8;
			
//			6. a9의 값을 int타입에 저장해주세요.
			int a12 = a9; // 더 큰 범위로 갈때는 앞에 캐스트연산자를 안해도 된다.
			
			
			float ff2 = 3.14F;
			double dd2 = 3.14;
			
			int rr = (int)ff2;
			
			System.out.println(rr);
			System.out.println(3/2);

			
			byte kk = 50;
			byte kk2 = 60;
			char cc = 'A';
			char cc2 = 'C';
			
			int kk3 = kk = kk2; // 원래는 byte + byte 이지만 JVM에서 최소단위가 4바이트 이므로, int + int로 변환된다.
			
			int kk4 = kk + cc; // 원래는 byte + char 이지만 둘다 4바이트보다 작으므로, int + int로 변환된다.
			
//			cc와 cc2의 합을 변수 cc3에 저장해주세요.
			int cc3 = cc + cc2; // 원래는 char + char 이지만 둘다 4바이트보다 작으므로, int + int로 변환된다.
			System.out.println(cc3);
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
	}
}
