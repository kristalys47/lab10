
public class StringsVOwels {
	static int longestSubsequence(String s) {
		char[] order={'a', 'e', 'i', 'o', 'u', 'u'};
		int indexOrder=0;
		int holita=0;
		int max=0;
		int[] holita2= new int[s.length()];
		if (s.length() != 0){
			for(int i=0; i<s.length();i++){
				for(int j=i; j<s.length(); j++){
					if(order[indexOrder] == s.charAt(j)){
						holita2[i]++;
					}
					else if (indexOrder+1 < 5 && order[indexOrder+1] == s.charAt(j)){
						holita2[i]++;
						indexOrder++;
					} 
				}
				if (!(indexOrder==4)){
					holita2[i]=0;
				}
				indexOrder=0;
			}
			for (int f=0; f<holita2.length; f++){
				if(f==0){
					max=holita2[0];
				}
				if (holita2[f]>max){
					max=holita2[f];
				}
			}
			if(max != 0){
			return max+1;
			}
			else
				return 0;
		}
		return 0;
	}

}
