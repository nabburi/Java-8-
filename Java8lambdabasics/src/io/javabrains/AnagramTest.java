package io.javabrains;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramTest {
	
	private static String sameGroup = null;
	private static boolean anagram = false;

	public static void main(String[] args) throws IOException {
		
		/*
		 * try { Scanner s = new Scanner(new File("/home/nava/anagramtest.txt"));
		 * ArrayList<String> testList = new ArrayList<String>(); while(s.hasNext()) {
		 * testList.add(s.nextLine()); } s.close(); System.out.print(testList); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		List<String> list = Files.readAllLines(new File("/home/nava/anagramtest.txt").toPath(), Charset.defaultCharset());
		for(int i =0; i < list.size(); i++) {
			sameGroup = list.get(i);
			for(int j =0; j< list.size(); j++) {
				if(!list.get(i).equals(list.get(j))) {
					if(list.get(i).length() == list.get(j).length()) {
						for(int k =0; k < list.get(i).length(); k++) {
							
						}
					}
				}
			}
		}
		 
	}

}
