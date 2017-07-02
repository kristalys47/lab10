
public class Maxes {
	static int[] counts(int[] nums, int[] maxes) {
		int results[]= new int[maxes.length];

		for(int i=0; i<results.length; i++){
			results[i]=0;
		}
		if (maxes.length==0 || nums.length==0){
			for (int j=0; j< maxes.length;j++){
				int c=j;
				for(int k=0; k< nums.length; k++){
					if (maxes[j]>=nums[k]){
						results[c]++;
					}	
				}
			}
		}
		return results;
	}

}
