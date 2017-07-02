
public class MergeStrings {

	static String mergeStrings(String a, String b) {
		char[] achar = a.toCharArray();
		char[] bchar = b.toCharArray();
		char[] result = new char[a.length()+b.length()];
		int limit;
		if(a.length()>=b.length()){
			limit=a.length();
		}
		else 
			limit=b.length();
		int realarray=0;
		for(int i=0; i<limit; i++){
			try {
				result[realarray]= achar[i];
				realarray++;
			} catch (IndexOutOfBoundsException e) {
				
			} 
			try {
				result[realarray]= bchar[i];
				realarray++;
			} catch (IndexOutOfBoundsException e) {
				
			} 
			

		}
		
		String fINAL = String.copyValueOf(result);
		
		return fINAL;

	}


}
