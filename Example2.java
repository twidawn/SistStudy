
public class Example2 {
	static void printStar(int i){
		int j = i - 1;
		
		System.out.println("입력받은 줄의 수 : " + i);
		for(int f = 0 ;f<i; f++ ){
			for(int k = 0 ; k < j ; k++)
				System.out.print(" ");
			for(int z = 0; z <= f ; z++ )
				System.out.print("*");
			j--;
			System.out.println();
		}
	}
	
	static void primeNumber(int i){
		System.out.println("입력한 값 : " + i);
		for(int j = 2; j<=i; j++){
			boolean a = true;
			for(int k = 2 ; k < j ; k++){
				if(j%k==0)
					a = false;
			}
			if(a)
				System.out.print(j + " ");	
		}	
	}
	
	static void fibonacci(int i){
		int a = 0;
		int b = 1;
		int c;
		System.out.println("출력할 피보나치 수열의 개수 : " + i);
		for(int j = 0; j < i ; j++){
			if(j == 0)
				System.out.print(a + " ");
			else if(j == 1)
				System.out.print(b + " ");
			else{
				c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
	}
	
	static void permutation(int n, int r){
		System.out.println("n의 값 : " + n);
		System.out.println("r의 값 : " + r);
		int sum = 1;
		for(int i = n; i >= (n-r-1); i--)
			sum *= i;
		System.out.println("순열의 값은 " + sum + "입니다.");
	}
	
	static void reverseNumber(int i){
		int temp = i;
		int reverse = 0;
		System.out.println("정수를 입력하시오 : " + i);
		while(temp!=0){
			reverse *= 10;
			reverse += temp%10;
			temp /=10;
		}
		System.out.println(reverse);
	}
	
	static void piCalculate(int i){
		double sum = 3.0;
		int a = 2, b = 3, c = 4;
		double divident = 4.0;
		double divisor;
		System.out.println("입력한 숫자 : " + i);
		while(i>0){
			sum = sum + divident / (a*b*c);
			divident = -1.0 * divident;
			a = c;
			b = c+1;
			c = c+2;
			i--;
		}
		
		
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		//printStar(7);
		//primeNumber(50);
		//fibonacci(10);
		//permutation(10, 3);
		//reverseNumber(1206);
		piCalculate(100);
	}
}
