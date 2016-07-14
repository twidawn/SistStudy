
public class ku {

	public static int indexOf(String param1, String param2){
		int i = 0;
		
		if(param1.length() < param2.length())
			return -1;
		int k = 0;
		while(k + param2.length() <= param1.length()){
			if(param1.substring(k, k + param2.length()).equals(param2))
				return i;
			else
				i++;	
			k++;
		}

		return -1;
	}
	
	public static String replaceAll(String param1, String param2, String param3){
		String tmp = null;
		
		int k = 0, start = 0;
		while(k + param2.length() <= param1.length()){

			if(param1.subSequence(k, k + param2.length()).equals(param2)){
				if(tmp == null)
					tmp = param1.substring(start, k).concat(param3);
				else
					tmp = tmp.concat(param1.substring(start, k)).concat(param3);
				k += param2.length();
				start = k;
				continue;
			}
			k++;
		}
		if(start == 0)
			tmp = param1;
		else if(start != k)
			tmp = tmp.concat(param1.substring(start, param1.length()));
		
		
		return tmp;
	}
	
	public static void main(String[] args) {
		String a = "ABCDEFGHIJKLMN", b = "BCE";
		
		System.out.println(indexOf(a, b));
		System.out.println(indexOf(a, "CD"));
		System.out.println(replaceAll("ABCDDEFDDGIDDMID", "DD", "生馬馬"));
		System.out.println(replaceAll("ABCDDEFDDGIDDMID", "DDDDD", "生馬馬"));
	}
}
