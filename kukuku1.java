
public class kukuku1 {
//a는 전체 문자, b는 나눌 문자로 해서 스트링 배열에 저장하여 그 값을 반환하는 함수
	public static String[] split(String a, String b){
		String[] temp = null;
		int start = 0, box = 0, cont =0, i = 0;
		
		while(i <= a.length()){
			if(b.length() + i <= a.length() && a.substring(i, b.length() + i).equals(b)){
				if(start != i)
					box++;
				i += b.length();
				start = i;
				continue;
			}
			if(i == a.length() && !a.substring(i - b.length(), i).equals(b))
				box++;
			
			i++;
		}

		temp = new String[box];
		start = 0;
		i = 0;
		while(i <= a.length()){
			if(b.length() + i <= a.length() && a.substring(i, b.length() + i).equals(b)){
				if(start != i)
					temp[cont++] = a.substring(start, i);
				i += b.length();
				start = i;
				continue;
			}
			if(i == a.length() && !a.substring(i - b.length(), i).equals(b))
				temp[cont] = a.substring(start, i);
			i++;
		}		
		
		return temp;		
	}
	//a와 b가 같은지 알아보는 함수
	public static boolean equals(String a, String b){
		int i;
		
		if(a.length() != b.length())
			return false;

		char[] temp1 = a.toCharArray();
		char[] temp2 = b.toCharArray();
		
		for(i = 0; a.length() != i && temp1[i] == temp2[i];i++);
		
		if(a.length() == i)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "AbCD", b = "ABCD";
		String c = "c aABCDc aEFGc ac ac aHIJc aKNMc ac ac a";
		String d = "c aABCDc aEFGc ac ac aHIJc aKNM";
		String[] abc = kukuku1.split(c, "c a");
		System.out.println(equals(a, b));
		System.out.println(equals("ABCD", b));
		System.out.println("========================");
		System.out.printf("%s에서 %s를 기준으로 잘라 배열로 저장\n", c, "c a");
		for(int i = 0; abc.length > i; i++)
			System.out.println(abc[i]);
		
	}

}
