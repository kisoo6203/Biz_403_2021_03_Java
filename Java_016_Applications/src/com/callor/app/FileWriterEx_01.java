package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/app/data.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		Random rnd = new Random();
		int intNum1 = rnd.nextInt(101);
		int intNum2 = rnd.nextInt(101);
		
			try {
				fileWriter = new FileWriter(fileName);
				out = new PrintWriter(fileWriter);
				
				out.println("=".repeat(50));
				out.printf("%d + %d = %d\n",intNum1,intNum2,intNum1+intNum2);
				if(intNum1 > intNum2) {
				out.printf("%d - %d = %d\n",intNum1,intNum2,intNum1-intNum2);
				} else {
					out.printf("%d - %d = %d\n",intNum2,intNum1, intNum2-intNum1);
				}
				out.printf("%d * %d = %d\n",intNum1,intNum2,intNum1*intNum2);
				if(intNum1 > intNum2) {
				out.printf("%d / %d = %d\n",intNum1,intNum2,intNum1/intNum2);
				} else {
					out.printf("%d / %d = %d\n",intNum2,intNum1,intNum2/intNum1);
				}
				
				out.println("-".repeat(50));
				out.flush();
				out.close();
			} catch (IOException e) {
				
				
			}

	}
}
