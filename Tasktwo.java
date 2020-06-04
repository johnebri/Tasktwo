
public class Tasktwo {
	
	public static void main(String[] args) {
		System.out.println("testing");
		
		int noOfWashes = 2;
		int[] cleanPile = {1,2,4,6};
		int[] dirtyPile = {2,5,4,6};
		
		int res = maxNoOfSocks(noOfWashes, cleanPile, dirtyPile);
		System.out.println("the maximum number of pair of socks that Anna can take on the trip is : " + res);
	}
	
	
	public static int maxNoOfSocks(int noOfWashes, int[] cleanPile, int[] dirtyPile) {
		
		int maxNo = 0;
		
		// loop through the arrays, cleanPile, dirtyPile
		for(int x=0; x<cleanPile.length; x++) {
			
			for(int y=0; y<dirtyPile.length; y++) {
				
				if(cleanPile[x] == dirtyPile[y]) {
					
					maxNo++;
				}
			}
			
			// limit maximum number of socks to noOfWashes
			if (maxNo >= noOfWashes)
				break;
			
		}
		
		return maxNo;
	}

}
