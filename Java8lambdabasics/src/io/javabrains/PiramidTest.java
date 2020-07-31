package io.javabrains;
import java.util.*;
import java.util.Map.Entry;
public class PiramidTest {
	// Click on "HELP" above to see examples of handling input/debug/output 
	// Format the output as specified in the problem statement and write the result to stdout 
	// IMPORTANT: Remove all debug statements for your final submission
	
	    
	    public static void solve(String[] inputArray){
	    // Write your code here
	        
	        HashMap<String,Integer> map = new HashMap();
	        for(int i =0; i < inputArray.length; i++){
	            // System.out.println(inputArray[i]);
	            String array = inputArray[i].substring(3,inputArray[i].length());
	           // System.out.println(array);
	            if(!array.equals("-1")){
	                int count = 0;
	                if(map.containsKey(array)){
	                    count = map.get(array) + 1;
	                    map.put(array,count);
	                }
	                else{
	                    map.put(array,1);
	                }
	            }
	        }
	        TreeMap<String,Integer> tMap = new TreeMap(map);
	        Set<Entry<String,Integer>> entries = tMap.entrySet();
	        for(Entry<String, Integer> entry : entries){
	            
	            System.out.println(entry.getKey()+"," +entry.getValue());
	        }
	        
	    }

	    public static void main(String[] args) { 
//	       Scanner scanner = new Scanner(System.in); 
//	       String str = "";
//	       while(scanner.hasNextLine()){
//	           str += scanner.nextLine()+",";
//	       }
//	       str = str.substring(0,str.length() - 1);
	       String array[] = {"0  China", "1  India", "2  -1", "3  China", "4  -1", "5  India", "6  China", "7  Russia"};

	       solve(array);
	    } 
	    
	    
	}
