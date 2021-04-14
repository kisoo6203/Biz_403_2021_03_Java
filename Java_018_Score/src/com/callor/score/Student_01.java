package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/Student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		System.out.println("=".repeat(100));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				String[] scores = reader.split(":");
				
				
				System.out.printf(" %s\t  %s\n",
						scores[1],scores[5]);
								
			}
			buffer.close();
			System.out.println("=".repeat(100));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
