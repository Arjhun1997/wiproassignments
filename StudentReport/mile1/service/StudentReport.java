package com.mile1.service;

import java.util.jar.Attributes.Name;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {
	public String findGrade(Student studentObject)
	{
		if(studentObject.getMarks()[0]<35||studentObject.getMarks()[1]<35||studentObject.getMarks()[2]<35) {
			return "F";		
	   }
		else {
			float f=studentObject.getMarks()[0]+studentObject.getMarks()[1]+studentObject.getMarks()[2];
			if (f<=150) {
				return "D";	
			}
		else if(f>150&&f<=200) {
		  return "C";
		}
		else if(f>200&&f<=250) {
	       return "B";
		}
		else if (f>250&&f<=300) {
		 return "A";
		}
		}
		return null;
	}
	public String validate	(Student studentObject)throws NullStudentException,NullNameException,NullMarksArrayException
	{
		if(studentObject==null) {
			throw new NullStudentException();
		}
		else {
			if(studentObject.getName()==null) {
				throw new NullNameException();
			}
			if(studentObject.getMarks()==null) {
				throw new NullMarksArrayException();
			}
			return findGrade(studentObject);
		}
		
	}
}

