import java.util.Scanner;

public class Example1 {
	static void ex1(int x, int y){
		System.out.println("정수를 입력하시오 : " + x);
		System.out.println("정수를 입력하시오 : " + y);
		
		if(x%y==0)
			System.out.println("약수입니다.");
		else
			System.out.println("약수가 아닙니다.");
		
	}
	
	static void ex2(int x, int y){
		System.out.println("키를 입력하시오(cm) : " + x);
		System.out.println("나이를 입력하시오 : " + y);
		
		if(x >= 140 && y >=10)
			System.out.println("타도 좋습니다.");
		else
			System.out.println("죄송합니다.");
		
	}
	
	static void ex3(int x, int y){
		System.out.println("체중과 키를 입력하시오(키, 체중) : "+ x + " " + y);
		if(((x-100)*0.9) < y)
			System.out.println("과체중");
		else if(((x-100)*0.9) > y)
			System.out.println("저체중");
		else
			System.out.println("정상체중");
	}
	
	static void ex4(int x, int y){
		System.out.println("5시(17시) 이전-> 어른 34000, 소인(3~12세, 65이상) 25000");
		System.out.println("5시(17시) 이후 10000");
		System.out.println("현재 시간과 나이를 입력하시오 : "+ x + " " + y);
		
		if(x < 17 && (y > 12 && 65 > y))
			System.out.println("요금은 34000원입니다.");
		else if(x < 17)
			System.out.println("요금은 25000원입니다.");
		else
			System.out.println("요금은 10000원입니다.");
	}
	
	static void ex5(int x){
		int a;
		if(x>0)
			a = x / x;
		else if(x < 0)
			a = x / -x;
		else
			a = x;
		System.out.println("x의 값을 입력하시오  : " + x);
		switch(a){
		case 1 :
			System.out.println("f(x)의 값은 " + ((7.0 * x) + 2));
			break;
		case 0 : case -1:
			System.out.println("f(x)의 값은 " + ((x*x*x) - (9*x) + 2.0));
			break;
			default : 		
		}
	}
	static void ex6(int x, int y){
		//System.out.println("좌표(x, y)" + x + " " + y);
		
		if(x > 0 && y > 0)
			System.out.println("1사분면");
		else if(x < 0 && y > 0)
			System.out.println("2사분면");
		else if(x < 0 && y < 0)
			System.out.println("3사분면");
		else
			System.out.println("4사분면");
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//ex1(10,5);
		//ex1(10,3);
		//ex2(145, 11);
		//ex2(139, 10);
		//ex3(180, 80);
		//ex3(180, 60);
		//ex3(180, 72);
		//ex4(22, 20);
		//ex4(12, 20);
		//ex4(12, 12);
		//ex5(0);
		//ex5(1);
		
		System.out.print("좌표(x, y) : ");
		ex6(sc.nextInt(), sc.nextInt());
		
	}
}
