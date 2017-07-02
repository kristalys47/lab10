
public class Triangle {
	static String[] triangleOrNot(int[] a, int[] b, int[] c) {
		String[] result= new String[a.length];
		if (a.length==b.length && a.length==c.length){
			for (int i=0; i<a.length;i++){
				if (a[i]+b[i]>c[i] && a[i]+c[i]>b[i] && c[i]+b[i]>a[i]){
					result[i]= "Yes";
				}
				else{
				result[i]= "No";
				}
			}
				
		}

		return result;
    }

}
