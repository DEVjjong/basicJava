package d_array;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(Array)
			- 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
			- 5과목의 점수
				int kor  = 80;
				int eng  = 70;
				int math = 50;
				int soc  = 80;
				int sci  = 70;
				
		2. 배열의 선언
			- 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 [] 를 붙이면 된다
			
			ex) 변수타입[] 변수명;		int[] a;
				변수타입 변수명[];		int a[];
				
		3. 배열의 생성
			- 배열을 선언한 다음에는 배열을 생성해야 한다.
			- 배열을 생성할때는 'new' 와 함께 배열의 타입과 크기를 지정해 주어야 한다.
				Scanner sc = new Scanner();
				int[] a = new int[3];
		*/
		
//		int[] score = new int[5];	// {0, 0, 0, 0, 0} 5개의 방을 만든다. int의 기본값은 0이기 때문에 0이 들어간다.
//		System.out.println(score.length);
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
		
		
//		2. score의 0번방 0점, 
//		score[0] = 0;
////		1번방 10점, 
//		score[1] = 10;
////		2번방 20점,
//		score[2] = 20;
////		3번방 30점,
//		score[3] = 30;
////		4번방 40점
//		score[4] = 40;
		
//		for(int i = 0; i < score.length; i++){
//			score[i] = i * 10; 
//		}
//		for(int i = 0; i < score.length; i++){
//			System.out.println(score[i]);
//		}
//		
//		1. 정수값 6개를 저장할수 있는 변수를 선언 및 생성해주세요 변수명은 random
		int[] random = new int[6];
//		
//		2. random의 각방의 값을 0~100점사이의 랜덤한 정수값으로 초기화해주세요.
		
//		random[0] = (int)(Math.random()*101);
//		random[1] = (int)(Math.random()*101);
//		random[2] = (int)(Math.random()*101);
//		random[3] = (int)(Math.random()*101);
//		random[4] = (int)(Math.random()*101);
//		random[5] = (int)(Math.random()*101);
		
		
		
		for(int i = 0; i < 6; i++){
			int random2 = (int)(Math.random()*101);
			random[i] = random2;
		}
		
//		3. random각방의 값을 출력해주세요.
		for(int i = 0; i < 5; i++){
			int random2 = (int)(Math.random()*101);
			random[i] = random2;
			System.out.println(random[i]);
		}
		
//		4. random각방의 합계를 구해주세요.
		
//		5. 평균을 구해주세요.
//		(단, 소숫점 셋째자리에서 반올림하여 두번재 자리까지 표현해주세요)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
