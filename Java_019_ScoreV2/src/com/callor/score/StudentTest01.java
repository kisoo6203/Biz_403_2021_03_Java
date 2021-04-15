package com.callor.score;

import com.callor.score.impl.StudentServiceImplV1;
import com.callor.score.service.StudentService;

public class StudentTest01 {
	
	public static void main(String[] args) {
		StudentService sv = new StudentServiceImplV1();
		sv.loadStudent();
	}
	

}
