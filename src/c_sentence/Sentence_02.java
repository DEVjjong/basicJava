package c_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문 (for, while, do-while)
			- 어떤 작업을 반복적으로 수행하도록 할때 사용된다.
			- 반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행한다.
			- for문은 주로 반복횟수를 알고 있을때, while문은 주로 반복횟수를 모를때 사용된다.
			
		2. for문
			- 기본구조
			for(초기화;조건식;증감식){
				수행될문장.
			}
		
			초기화 -> 조건식 -> 수행 -> 증감식
				  -> 조건식 -> 수행 -> 증감식
		*/
		
//		1. 0부터 10까지 출력해주세요.
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
		
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//		}
		
		
		
//		1~10까지의 합을 구해주세요.
		
//		int add = 0;
		
//		add += 1;
//		add += 2;
//		add += 3;
//		add += 4;
//		add += 5;
//		add += 6;
//		add += 7;
//		add += 8;
//		add += 9;
//		add += 10;
		
//		for(int i=1; i<11; i++){
//			add += i;
//		}
		
//		합이 짝수일때만 하세요.
//		for(int i=1; i<11; i++){
//			if(i%2==0){
//				add += i;
//			}
//		}
//		
//		System.out.println(add);
		
		
		
		
		
		
//		7~30까지의 곱을 구해주세요.
		
//		long a1 = 1;
		
//		a1 *= 7;
//		a1 *= 8;
//		a1 *= 9;
//			.
//			.
//			.
//		a1 *= 29;
//		a1 *= 30;
		
//		for(int i = 7; i < 31; i++){
//			a1 *= i;
//		}
//		System.out.println(a1);
		
		
		
//		2 * 1 = 2
		
////		System.out.println(2 + " * " + 1 + " = " + 2*1 );
////		System.out.println(2 + " * " + 2 + " = " + 2*2 );
////		System.out.println(2 + " * " + 3 + " = " + 2*3 );
////		System.out.println(2 + " * " + 4 + " = " + 2*4 );
////		System.out.println(2 + " * " + 5 + " = " + 2*5 );
////		System.out.println(2 + " * " + 6 + " = " + 2*6 );
////		System.out.println(2 + " * " + 7 + " = " + 2*7 );
////		System.out.println(2 + " * " + 8 + " = " + 2*8 );
////		System.out.println(2 + " * " + 9 + " = " + 2*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(2 + " * " + i + " = " + 2*i);
//		}
//		
//		
//		
////		System.out.println(3 + " * " + 1 + " = " + 3*1 );
////		System.out.println(3 + " * " + 2 + " = " + 3*2 );
////		System.out.println(3 + " * " + 3 + " = " + 3*3 );
////		System.out.println(3 + " * " + 4 + " = " + 3*4 );
////		System.out.println(3 + " * " + 5 + " = " + 3*5 );
////		System.out.println(3 + " * " + 6 + " = " + 3*6 );
////		System.out.println(3 + " * " + 7 + " = " + 3*7 );
////		System.out.println(3 + " * " + 8 + " = " + 3*8 );
////		System.out.println(3 + " * " + 9 + " = " + 3*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(3 + " * " + i + " = " + 3*i);
//		}
//		
////		System.out.println(4 + " * " + 1 + " = " + 4*1 );
////		System.out.println(4 + " * " + 2 + " = " + 4*2 );
////		System.out.println(4 + " * " + 3 + " = " + 4*3 );
////		System.out.println(4 + " * " + 4 + " = " + 4*4 );
////		System.out.println(4 + " * " + 5 + " = " + 4*5 );
////		System.out.println(4 + " * " + 6 + " = " + 4*6 );
////		System.out.println(4 + " * " + 7 + " = " + 4*7 );
////		System.out.println(4 + " * " + 8 + " = " + 4*8 );
////		System.out.println(4 + " * " + 9 + " = " + 4*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(4 + " * " + i + " = " + 4*i);
//		}
//		
////		System.out.println(5 + " * " + 1 + " = " + 5*1 );
////		System.out.println(5 + " * " + 2 + " = " + 5*2 );
////		System.out.println(5 + " * " + 3 + " = " + 5*3 );
////		System.out.println(5 + " * " + 4 + " = " + 5*4 );
////		System.out.println(5 + " * " + 5 + " = " + 5*5 );
////		System.out.println(5 + " * " + 6 + " = " + 5*6 );
////		System.out.println(5 + " * " + 7 + " = " + 5*7 );
////		System.out.println(5 + " * " + 8 + " = " + 5*8 );
////		System.out.println(5 + " * " + 9 + " = " + 5*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(5 + " * " + i + " = " + 5*i);
//		}
//		
////		System.out.println(6 + " * " + 1 + " = " + 6*1 );
////		System.out.println(6 + " * " + 2 + " = " + 6*2 );
////		System.out.println(6 + " * " + 3 + " = " + 6*3 );
////		System.out.println(6 + " * " + 4 + " = " + 6*4 );
////		System.out.println(6 + " * " + 5 + " = " + 6*5 );
////		System.out.println(6 + " * " + 6 + " = " + 6*6 );
////		System.out.println(6 + " * " + 7 + " = " + 6*7 );
////		System.out.println(6 + " * " + 8 + " = " + 6*8 );
////		System.out.println(6 + " * " + 9 + " = " + 6*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(6 + " * " + i + " = " + 6*i);
//		}
//		
////		System.out.println(7 + " * " + 1 + " = " + 7*1 );
////		System.out.println(7 + " * " + 2 + " = " + 7*2 );
////		System.out.println(7 + " * " + 3 + " = " + 7*3 );
////		System.out.println(7 + " * " + 4 + " = " + 7*4 );
////		System.out.println(7 + " * " + 5 + " = " + 7*5 );
////		System.out.println(7 + " * " + 6 + " = " + 7*6 );
////		System.out.println(7 + " * " + 7 + " = " + 7*7 );
////		System.out.println(7 + " * " + 8 + " = " + 7*8 );
////		System.out.println(7 + " * " + 9 + " = " + 7*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(7 + " * " + i + " = " + 7*i);
//		}
//		
////		System.out.println(8 + " * " + 1 + " = " + 8*1 );
////		System.out.println(8 + " * " + 2 + " = " + 8*2 );
////		System.out.println(8 + " * " + 3 + " = " + 8*3 );
////		System.out.println(8 + " * " + 4 + " = " + 8*4 );
////		System.out.println(8 + " * " + 5 + " = " + 8*5 );
////		System.out.println(8 + " * " + 6 + " = " + 8*6 );
////		System.out.println(8 + " * " + 7 + " = " + 8*7 );
////		System.out.println(8 + " * " + 8 + " = " + 8*8 );
////		System.out.println(8 + " * " + 9 + " = " + 8*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(8 + " * " + i + " = " + 8*i);
//		}
//		
////		System.out.println(9 + " * " + 1 + " = " + 9*1 );
////		System.out.println(9 + " * " + 2 + " = " + 9*2 );
////		System.out.println(9 + " * " + 3 + " = " + 9*3 );
////		System.out.println(9 + " * " + 4 + " = " + 9*4 );
////		System.out.println(9 + " * " + 5 + " = " + 9*5 );
////		System.out.println(9 + " * " + 6 + " = " + 9*6 );
////		System.out.println(9 + " * " + 7 + " = " + 9*7 );
////		System.out.println(9 + " * " + 8 + " = " + 9*8 );
////		System.out.println(9 + " * " + 9 + " = " + 9*9 );
//		for(int i = 1; i < 10; i++){
//			System.out.println(9 + " * " + i + " = " + 9*i);
//		}
//		
//		
//		System.out.println("\n");
		
		
//		for(int i = 2; i < 10; i++){
//			for(int j = 1; j < 10; j++){
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
//		
//		System.out.println("\n");
		
		
//		1. 짝수단만 출력해주세요
//		for(int i = 2; i < 10; i++){
//			if(i%2==0){
//				for(int j = 1; j < 10; j++){
//						System.out.println(i + " * " + j + " = " + i * j);	
//				}
//			}
//		}
//		
//		
//		
//		System.out.println("\n");
		
//		2. 홀수곱만 출력해주세요
//		for(int i = 2; i < 10; i++){
//			for(int j = 1; j < 10; j++){
//				if(j%2!=0){
//					System.out.println(i + " * " + j + " = " + i * j);	
//				}
//			}
//		}
//		
//		
//		
//		
//		System.out.println("\n");
		
//		3. 짝수단의 홀수곱만 출력해주세요
//		for(int i = 2; i < 10; i++){
//			if(i%2==0){
//				for(int j = 1; j < 10; j++){
//					if(j%2!=0){
//						System.out.println(i + " * " + j + " = " + i * j);	
//					}
//				}
//			}
//		}
		
		
		
		
		/*
		3. while문
			- 조건식과 수행해야될 블럭{}만으로 구성되어 있다.
			- 기본구조
			while(조건식){
				조건식이 true일때 수행될 문장
			}
		*/
		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		int num = 1;
//		while(num < 10){
//			System.out.println(num);
//			num++;
//		}
//		
//		System.out.println("\n");
		
//		1. 1~10까지의 합을 구해주세요.
//		int hab = 0;
//		int i = 1;
//		while(i < 11){
//			hab += i;
//			i++;
//		}
//		System.out.println(hab);
		
		
		
//		System.out.println("\n");
		
//		2. 1~10까지의 홀수의 합을 구해주세요.
//		int hab2 = 0;
//		int i2 = 1;
//		while(i2 < 11){
//			if(i2%2==1){
//				hab2 += i2;
//			}
//			i2++;
//		}
//		System.out.println(hab2);
		
		
		
		
//		System.out.println("\n");
		
//		3. 구구단을 while문만을 이용해서 만들어주세요 
//		int goo1 = 2;
//		while(goo1 < 10){
//			int goo2 = 1;
//			while(goo2 < 10){
//				System.out.println(goo1 + " * " + goo2 + " = " + (goo1 * goo2));
//				goo2++;	
//			}
//			System.out.println();
//			goo1++;
//		}
//		
//		
//		
//		
//		
//		System.out.println("\n");
		
//		4. 5~? 더하였을때 200이상이 되는가?
		
		
//		[방법1] 
//		int summ = 0;
//		int aa = 4;
//		while(!(summ >= 200)){
//			++aa;
//			summ += aa;
//		}
//		System.out.println(aa);
		
		
//		[방법2] break
//		int summ = 0;
//		int aa = 5;
//		while(true){
//			summ += aa;
//			if(summ >= 200){
//				break;
//			}
//			aa++;
//		}
//		System.out.println(aa);
		
		
//		[방법3] contunue
//		(홀수만 출력하는 문장)
//		for (int i = 0; i < 10; i++) {
//			if (i%2 == 1) {
//				System.out.println(i);
//			}
//		}
		
//		(continue를 사용하여 홀수만 출력하는 문장)
//		for (int i = 0; i < 10; i++) {
//			if (i%2 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		int aa1 = 5;
//		int num2 = 0;
//		while(aa1 >= 5){
//			if(num2 < 201){
//				num2 += aa1;
//			}
//			aa1++;
//		}
		
		
		
//		String
//		String str = "12345";
//		char c = str.charAt(0);
//		System.out.println(c);
//		System.out.println(str.length());
		
		
		
		
		
		/*
		4. do-while
			- while과 유사하나 while이나 for문의 경우 실행횟수가 0회일 수 있다.
			  하지만 do-while의 경우는 무조건 한번 수행해야 한다.
		
		*/
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력해주세요 : ");
//		String str = sc.next(); //next() 문자열을 받는다.
//		int str = sc.nextInt();
//		System.out.println("입력하신 문자는 : " + str*2);
		
//		1. 문자를 입력받아서 출력해주세요
//		(무한으로 가능하게 해주세요) -> "stop"을 입력하면 종료하게 만들어주세요
//		* 문자열을 비교할때는 == 가 아니라 .equals 를 붙여야한다.
		
		String str = "";
		do{
			System.out.println("문자를 입력해주세요");
			str = sc.next();
			System.out.println("입력하신 값은 : " + str);
		}while(!(str.equals("stop")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
