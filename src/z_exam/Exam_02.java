package z_exam;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Exam_02 {
	public static void main(String[] args){
		
		
//		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
//		크 기
//		종 류
//		1 byte 2 byte 4 byte 8 byte
//		논리형
//		문자형
//		정수형
//		실수형
		
		
		
//		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
//		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
//		초기화 하는 한 줄의 코드를 적으시오.
		
		
		
//		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
//				int i = 100;
//				long l = 100L;
//				final float PI = 3.14f;
		
//				- 리터럴 : 100, 100L, 3.14f 
//				- 변수 : i, l, PI
//				- 키워드 : int, long, final, float
//				- 상수 : final float "PI" = 3.14f;
		
		
//		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
//				a. int			: int는 기본형이다.
//				b. Byte			: byte는 기본형이다.
//				c. double		: double은 기본형이다.
//				d. boolean		: boolean은 참조형이다. 객체의 주소를 저장한다. 기본형함수는 다음8가지와 같다 (boolean, char, byte, short, int, long, float, double)
		
		
//		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
//				류’라고 적으시오.
//				System.out.println("1" + "2") → ( 12 )			: 문자열1과 2를 더해서 12로 출력된다.
//				System.out.println(true + "") → ( true )		: true + 0(값이없음)은 true이므로, 결과값은 true가 나온다.
//				System.out.println('A' + 'B') → ( 131 )			: 유니코드로 변환하면 A=65, B=66이므로 그 둘의 덧셈(65+66)은 131이라는 값이 나온다.
//				System.out.println('1' + 2) → ( 51 )			: 1은 아스키코드로 49이므로 아스키코드 1과 상수2를 더하면 49+2 이므로 값은 51이 나온다.
//				System.out.println('1' + '2') → ( 99 )			: 유니코드로 변환하면 1=49, 2=50이므로 그 둘의 덧셈(49+50)은 99라는 값이 나온다.
//				System.out.println('J' + "ava") → ( Java )		: char형 J와 string형 ava를 더하면 
//				System.out.println(true + null) → ( 오류 )		: 
		
		
//		System.out.println("1" + "2");
//		System.out.println(true + "");
//		System.out.println('A' + 'B');
//		System.out.println('1' + 2);
//		System.out.println('1' + '2');
//		System.out.println('J' + "ava");
//		System.out.println(true + null) ;

		
//		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
//				a. if			: if는 키워드이다.
//				b. True			: 키워드가 아니다. 
//				c. NULL			: NULL은 키워드이다. 보통 NULL은 값이 없을때 쓰는 단어이다.
//				d. Class		: 키워드가 아니다. 
//				e. System		: System은 키워드이다. 
//		if
//		True
//		NULL
//		Class
//		System
		
//		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)		,g
//				a. $ystem			: 사용가능한 특수문자 이므로 사용 가능하다.
//				b. channel#5		: 사용할 수 있는 특수문자는 _, $이다.
//				c. 7eleven			: 변수의 이름으로 첫글자는 숫자로 표시할 수 없다.
//				d. If				: 사용은 가능하나, 원래 변수의 이름은 모두 소문자로 해야하는 규칙이 있고, 소문자 if의 경우 예약어 이기 때문에 소문자로는 사용이 불가능하다. 
//				e. 자바				: 변수명은 한글이름을 사용하지 않기때문에 사용할 수 없다.
//				f. new				: 키워드이기 때문에 사용불가능하다. 
//				g. $MAX_NUM			: 상수의 이름은 모두 대문자로 작성하므로 해당 변수는 사용할 수 있다.
//				h. hello@com		: 사용할 수 있는 특수문자는 _, $이다.
		
		
//		[2-8] 참조형 변수(reference type, 4바이트)와 같은 크기의 기본형(primitive type)은? (모두 고			a, d
//				르시오)
//				a. int		: int는 4바이트 이므로 해당한다.
//				b. long		: long은 8바이트 이므로 해당하지 않는다.
//				c. short	: short은 2바이트 이므로 해당하지 않는다.
//				d. float	: float은 4바이트 이므로 해당한다.
//				e. double	: double은 8바이트 이므로 해당하지 않는다.
		
		System.out.println();
		
		
//		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)		d,e
//				byte b = 10;
//				char ch = 'A';
//				int i = 100;
//				long l = 1000L;
		
//				a. b = (byte)i;				: 형변환을 생략할 수 없다. 이유는 i가 가지고있는 int변수는 byte보다 크기때문에 반드시 써야한다.
//				b. ch = (char)b;			: 형변환을 생략할 수 없다. 이유는 b가 가지고있는 byte변수는 char에 포함되어 있지 않기 때문에 반드시 써야한다.
//				c. short s = (short)ch;		: 형변환을 생략할 수 없다. 이유는 ch가 가지고있는 char변수는 short보다 크기때문에 반드시 써야한다. 
//				d. float f = (float)l;		: 형변환을 생략할 수 있다. 이유는 l이 가지고있는 long변수는 float에 포함되어 있기 때문이다.
//				e. i = (int)ch;				: 형변환을 생략할 수 있다. 이유는 ch가 가지고있는 char변수는 int에 포함되어 있기 때문이다.
		
		
//		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
//				정수값의 범위는 0~2(16)-1 의 값을 가지며, 10진수로 변환을 하면 65535이다.
		
		
		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
//				a. byte b = 256;			: byte변수는 -128 ~ 127까지 이므로 256의 값은 byte변수타입의 구간을 초과하므로 오버플로우가 된다.
//				b. char c = '';				: char변수는 문자 하나만 입력이 가능한데, 현재 입력값은 아무것도 없으므로 오류가 나온다.
//				c. char answer = 'no';		: char변수는 문자 하나만 입력이 가능한데, 현재 입력값은 no라는 두문자를 입력했으므로 오류가 된다. 
//				d. float f = 3.14			: 문장이 끝날때는 ;(세미콜론)이 있어야 하는데, 없다. 그리고 실수형은 기본형이 double이라 구분하기위해 뒤에 F를 붙여야한다. 
//				e. double d = 1.4e3f;		: double이 float보다 큰 변수이고, float을 구분하기 위해 뒤에f가 붙었습니다. 
		
//		byte b = 256;
//		char c = '';
//		char answer = 'no';
//		float f = 3.14
//		double d = 1.4e3f;
//		System.out.println(d);
		
		
//		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) b,c
//				a. boolean - false		: boolean타입은 true, false값만 입력받을 수 있다.
//				b. char - '\u0000'		: \ u는 특수문자 기호이다. \u0000은 NULL값이다. char변수는 단 하나의 문자만 입력가능하므로 잘못 연결되어있다.
//				c. float - 0.0			: 부동소수점을 float타입에 초기화시킬경우 뒤에 반드시 f를 붙여야한다. 0.0f
//				d. int - 0				: int는 -2/31 ~ 2/31 -1 의 범위를 가지고 있으므로 해당값은 사용 가능하다.
//				e. long - 0				: long은 -2/63 ~ 2/63 -1 의 범위를 가지고 있으므로 해당값은 사용 가능하다.
//				f. String - ""			: String타입은 문자열이고, ""로 변수값을 입력받는다.
	}
}
