package b_Operation;

public class Operation_02 {
	public static void main(String[] args) {
		
		/*
		1. 증감연산자(++, --)
			- 증가연산자 (++) : 피연산자의 값을 1증가시킨다.
			- 감소연산자 (--) : 피연산자의 값을 1감소시킨다.
		
		*/
		
//		int형 변수 i에 3의 값을 저장해주세요.
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		int j = ++i +3; // i = 6, j = 8		// ++가 앞에 붙어있으면 먼저 증가시키고 대입을하고, ++가 뒤에있으면 대입을 하고 증가시킴 
		System.out.println(i);
		System.out.println(j);
		
		int k = 50;
		int t = 20;
		
		int result = k++ + ++t + 10 + ++k;
		
		char c3 = 'A';
		c3++;
		
		/*
		2. 부호연산자 (+, -)
			- 부호연산자는 피연산자의 부호를 변경하는데 사용된다.
			- char, boolean자료형에는 사용할 수 없다.
		
		*/
		int i2 = -10;
		i2 = -i2;
		
		
		/*
		3. 비트전환 연산자(~)
			- 정수형과 char에만 사용가능하다.
			
			10		: 00001010  =>  10
			~10		: 11110101  => -11  (1의보수)
			~10+1	: 11110110  => -10  (2의보수)
		*/
		
//		~ 연산의 경우 byte, short, char의 경우 int형으로 변환 후 연산한다.
		byte b3 = 10;
		
		int b4 = ~b3; //1의보수 -11
		System.out.println(b4);
		
		
		/*
		4. 논리부정연산자 (!)
			- boolean형에만 사용 가능하다.
			- true => false, false => true
		
		*/
		boolean power = false;
//		power의 값을 부정하여 power변수에 저장해주세요.
		power = !power;
		
		/*
		5. 산술연산자
			- 사칙연산자(+, -, *, /), 나머지 연산자(%), 쉬프트연산자(<<, >>, >>>)
			두개의 피연산자를 취하는 이항연산자 이다.
			
		6. 사칙연산자(+, -, *, /)
			- int형보다 작은 자료형간의 연산은 int형으로 형변환 후 연산을 수행한다.
			: byte + short => int + int = int
			
			- 두개의 피연산자중 하나이상 4byte형보다 큰경우에는 큰쪽의 자료형에 맞춰서 형변환 후 연산을 수행한다.
			: char + float => float + float = float
			
			- 정수형 간의 나눗셈에서 0으로 나누는 것은 금지되어 있다.
		
		*/
		byte aa = 1;
		short bb = 129;
		
//		aa와 bb의 합을 변수 cc에 저장해주세요.
		int cc = aa + bb;
		
//		aa와 bb의 합을 byte형변수 dd에 저장해주세요.
		byte dd = (byte)(aa + bb);
		System.out.println(dd);
		
		
		/*
		7. 나머지 연산자(%)
			- 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려주는 연산자
			- boolean형을 제외한 모든 기본자료형에 사용가능하다.
		*/
		int firstNum = 10;
		int secoundNum = 3;
//		firstNum을 secoundNum으로 나눈 결과를 share라는 변수에 저장해주세요.
		
		int share = firstNum / secoundNum;  //몫
		System.out.println(share);
		
//		firstNum을 secoundNum으로 나눈 나머지를 remain라는 변수에 저장해주세요.
		int remain = firstNum % secoundNum;
		System.out.println(remain);
		
//		10을 3으로 나눈 몫은 3이고 나머지는 1이다.
		System.out.println(firstNum + "을 " + secoundNum + "으로 나눈 몫은 " + share + "이고 " + remain + "이다.");
		
		/*
		8. 쉬프트 연산자(<<, >>, >>>)
			- 정수형에만 사용 가능하다.
			- 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
			- 연산속도가 매우 뛰어남으로 사용한다.
			- << : x<<n  x*2^n의 결과와 같다.
			- >> : x>>n  x/2^n의 결과를 가진다.
		*/
		byte bbb = 10;
		int result2 =  bbb << 32;
		System.out.println(result2);
		
		/*
		9. 비교연산자
			- 두개의 변수 또는 리터럴을 비교하는데 사용된다.
			- 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true, false이다.
			
		10.  대소비교연산자( <, >, <=, >= )
			- boolean형을 제외한 기본형변수에 사용가능하다.
			
		11. 등가비교연산자( ==, != )
			- 모든자료형에 사용가능하다.
			
			
			수식			|            연산결과
			x>y			| x가 y보다 클때만 true, 그 외에는 false
			x<y			| x가 y보다 작을때만 true, 그 외에는 false
			x>=y		| x가 y보다 크거나 같을때만 true, 그 외에는 false
			x<=y		| x가 y보다 작거나 같을때만 true, 그 외에는 false
			x==y		| x가 y보다 같을때만 true, 그 외에는 false
			x!=y		| x가 y보다 다를때만 true, 그 외에는 false
			
			
		*/
		System.out.println(5<10);
		
		
		int a = 50;
		int b = 35;
		System.out.println(a>b);
		
		
		System.out.println('0'==0);
		
		
		
		float ff = 0.5F;
		double dd2 = 0.5;	// 2^n으로 표현가능
		System.out.println(ff == dd2);
		
		/*
		12. 비트연산자 (&, |, ^)
			- 이진비트연산을 수행한다.
			- 실수형인 float과 double을 제외한 모든 기본형에 사용 가능하다.
			
			& (AND연산) - 피연산자 양쪽의 값이 1이면 1의 결과를 얻는다.
			| (OR연산)  - 피연산자 중 한쪽의 값이 1이면 1의 결과를 얻는다.
			^ (XOR연산) - 피연산자의 값이 서로 다르면 1의 결과를 얻는다.
			
			3 	-> 00000011
			7 	-> 00000111
			3^7 -> 00000100 => 4
			3|7 -> 00000111 => 7
			3&7 -> 00000011 => 3
		*/
		
		
		System.out.println(3^7);
		System.out.println(3|7);
		System.out.println(3&7);
		
		System.out.println(true & true);
				
				
		
		/*
		13. 논리연산자 (&&, ||)
			- 피연산자로 boolean형 값 또는 boolean형에 결과를 하는 조건식만 허용
			- 조건식과 반복문에서 조건식 값의 결합에 활용된다.
			- && 연산자가 || 보다 연산우선수위가 높다.
			||(OR결합)	: 피연산자중 어느 한쪽만 true이면 true의 결과를 얻는다.
			&&(AND결합) 	: 피연산자중 양쪽모두 true일때 true의 결과를 얻는다.
		
		*/
		
//		변수 x에 'J'값을 저장해 주세요.
		char x = 'J';
		
//		x의 값이 영어 대문자 이면 true의 결과를 출력하는 조건식을 만들어 주세요.
		
		System.out.println('A'<=x && x<='Z');
		System.out.println('a'<=x && x<='z');
		System.out.println('A'<=x && x<='Z' || 'a'<=x && x<='z');
		System.out.println('0'<=x && x<='9');
		System.out.println('A'<=x && x<='Z' || 'a'<=x && x<='z' || '0'<=x && x<='9');
		
		
		/*
		14. 삼항연산자
			- 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어 졌다.
			- 삼항연산자의 조건식의 결과에 따라 true 또는 false 인 식이 사용된다.
			- 기본구조
				(조건식) ? 식1(true) : 식2(false);
				
				
		*/
		int x2 = -10;
		int result3 = x2 > 0 ? x2 : -x2;	// 절대값 구하는 식
		System.out.println(result3);
		
		
		
//		1. x3에 100의 값을 저장해주세요.
		int x3 = 100;
		
//		2. x3의 값이 양수이면 "양수", 음수이면 "음수", 0이면 "0"의 결과값을 result4에 저장해주세요.
		String result4;
		result4 = x3 > 0 ? "양수" : x3==0 ? "0" : "음수";
		
//		3. result4의 값을 출력해주세요.
		System.out.println(result4);
		
		
		/*
		15. 대입연산자(=, op=)
			- 변수에 값 또는 수식의 연산결과를 저장하는데 사용된다.
			- 연산우선순위가 가장 낮다.
		
		*/
		
//		1. int형 변수 i5에 5의 값을 저장해주세요
		int i5 = 5;
		
//		2. i5에 10을 더하여 i5에 저장해주세요.
		i5 = i5 + 10;
//		i5 += 10;	(위와 같은 공식이고, 함축된 코드, 자신의 타입을 유지한다)
		
		
		
//		random
//		1. 주사위 1~6
		int dice = (int)(Math.random()*6+1);
		System.out.println(dice);
		
		
//		2. 로또 45번까지
		int lotto = (int)(Math.random()*45+1);
		System.out.println(lotto);
		
		
//		3. 47(미포함) ~ 537(포함)
		int random = (int)(Math.random()*490+48);
		
//		반올림
//		1. float타입의 변수 f4에 3.141592를 저장해주세요
		float f4 = 3.141592F;
		
		
//		2. 
		System.out.println((int)(f4 + 0.5));
		float result8 = (int)(f4 * 1000 + 0.5) / 1000F;
		System.out.println(result8);
		
		
//		2. 158.5987 (세번째자리에서 반올림해서 두번째자리까지만 보고싶다)
		float f5 = 158.5987F;
		float result9 = (int)(f5 * 100 + 0.5) / 100F;
		System.out.println(result9);
		
		
		
		
	}

}
