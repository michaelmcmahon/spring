package com.example.demo.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.beans.Student;
import com.example.demo.beans.StudentRegistration;

public class StudentRetrieveController {
	
	 @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	  @ResponseBody
	  public List<Student> getAllStudents() {
	  return StudentRegistration.getInstance().getStudentRecords();
	  }

}
