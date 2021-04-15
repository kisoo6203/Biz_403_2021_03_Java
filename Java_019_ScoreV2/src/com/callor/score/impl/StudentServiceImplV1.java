package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	// protected String studentFile;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		// studentFile = "src/com/callor/score/student.txt";
		
		this.loadStudent();
	}
	
	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void loadStudent() {
		
		String fileName = "src/com/callor/score/student.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) break;
				
				String[] str = reader.split(":");
				
				StudentVO vo = new StudentVO(); 
				vo.setNum(str[0]);
				vo.setName(str[1]);
				vo.setGrade(str[2]);
				vo.setDept(str[4]);
				vo.setAddress(str[5]);
				studentList.add(vo);
				System.out.println(vo);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일이 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽을 수 없음");
		}
		
	}
	
	/*
	 * 학생의 학번을 파라메터로 전달하고
	 * studentList에서 해당 학번의 학생을 찾기
	 * 학생정보가 있으면 해당 학번 학생의 VO 정보를 return
	 * 없으면 null return
	 */
	@Override
	public StudentVO getStudent(String num) {
		
		int nSize = studentList.size();
		for(int i = 0 ; i < nSize ; i++){
			StudentVO vo = studentList.get(i);
			if(num.equals(vo.getNum())) {
				return vo;
				
			} else {
				return null;
			}
		}
		
		
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}
	
	

}
