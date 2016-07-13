
public class Example3 {

	static void sieve(){
		int[] arr = new int[101];
		
		for(int i = 2 ; i < arr.length; i++){
			if(arr[i]==0){
				for(int j = i ; j<arr.length; j=j+i){
					if(j!=i)
						arr[j]++;
				}
					
			}
			if(arr[i]==0)
				System.out.print(i + " ");
		}
	
	}
	
	static void binaryChange(int i){
		int[] arr = new int[32];
		int temp=i;
		int count=0;
		while(temp != 0){
			temp/=2;
			count++;
		}
		System.out.println(i+ "를 2진수로 변환");
		
		if(count>32)
			System.exit(0);
		temp = i;
		for(int j = 0; j < count;j++){
			arr[j] = temp % 2;
			temp/=2;			
		}
		
		for(int j = count - 1; j >= 0; j--)
			System.out.print(arr[j]);
		
	}
	
	static void rndCount() {

		int[] arr = new int[10];

		for (int i = 1; i <= 100; i++) {
			arr[(int) (Math.random() * 10)]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+ "이(가) 나온 횟수"+arr[i] + " ");
		}
	}
	
	static void transpose(){
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[3][3];
		
		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr1[0].length; j++)
				arr2[i][j] = arr1[j][i];
			
		}
		printArr(arr1);
		System.out.println("변경");
		printArr(arr2);
	}
	
	static void printArr(int [][]arr){
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	static void matrixMult(){
		int[][] arr1 = {{3,4},{1,0}};
		int[][] arr2 = {{2,1},{0,2}};
		int[][] arr3 = new int[2][2];

		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr2[0].length; j++){
				for(int k = 0; k < arr1[0].length; k++){
					arr3[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		printArr(arr1);
		System.out.println("*");
		printArr(arr2);
		System.out.println("=");
		printArr(arr3);
	}

	static int[] arr1(int i, int rnd) {
		int[] arr = new int[i];

		for (int j = 0; j < arr.length; j++)
			arr[i] = (int) (Math.random() * rnd);
		return arr;
	}

	static int[][] arr2(int i, int j, int rnd) {
		int[][] arr = new int[i][j];

		for (int k = 0; k < arr.length; k++) {
			for (int z = 0; z < arr[0].length; z++)
				arr[k][z] = (int) (Math.random() * rnd);
		}
		return arr;
	}

	public static void main(String[] args) {
		//rndCount();
		//matrixMult();
		//transpose();
		//binaryChange(155);
		sieve();
	}
}
