

public class Elections {
	
	static String electionWinner(String[] votes) {
		int[] countvotes= new int[votes.length];
		for(int i=0; i<votes.length; i++){
			countvotes[i]=1;
		}

		for(int i=1; i<votes.length; i++){
			if(!votes[i].equals(" ")){
				for(int t=i+1; t<votes.length; t++){

					if(votes[i].equals(votes[t]))
					{
						countvotes[i]++;
						votes[t]= " ";
					}


				}

			}

		}
		int max = countvotes[0];
		int max2 = 0;
		int savei =0;
		int save2i=0;
		for(int i=1; i<votes.length; i++)
		{
			if(i == 0)
			{
				max =countvotes[i];
			}
			else if(countvotes[i]>max){
				max =countvotes[i];
				savei =i;
			}
			else if (countvotes[i]==max){
				if(votes[savei].compareTo(votes[i])> 0){
					//nothing
				}
					
				else{
					max =countvotes[i];
					savei =i;
				}
				
			}
		}
		if (max == max2){
			if(votes[savei].compareTo(votes[save2i])> 0){
				return votes[savei];
			}
			else
				return votes[save2i];
		}
		return votes[savei];
	}
}