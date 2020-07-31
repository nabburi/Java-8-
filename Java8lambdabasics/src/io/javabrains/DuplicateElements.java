package io.javabrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] duplicates =  {1,2,3,1,5,2,1,6,4,3,6,2,7,5,7,8,9};
		/*with collections
		 * Set<Integer> duplicatesSet = new HashSet<Integer>();
		 * duplicatesSet.addAll(Arrays.asList(duplicates));
		 */
		//without collections
		List<Integer> list = new ArrayList<Integer>();
		Arrays.stream(duplicates);
		boolean elementexists = true;
		int[] noduplicates = new int[duplicates.length];
		System.out.println(noduplicates.length);
 		for(int i=0; i<duplicates.length; i++) {
				for(int j =0; j<noduplicates.length; j++) {
					if(noduplicates[j] != duplicates[i]) {
						elementexists = false;
				}else {
					elementexists = true;
					break;
				}
			}
				if(!elementexists) {
					noduplicates[i] = duplicates[i];
				}
		}
 		for (int i = 0; i < noduplicates.length; i++) {
 			System.out.println(noduplicates[i]);			
		}

	}

}
