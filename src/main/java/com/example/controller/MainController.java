package com.example.controller;

/**
 * @ClassName MainController
 * @Description: TODO
 * @Author wangjie
 * @Date 2022/2/28
 * @Version V1.0
 **/

import com.example.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		return "第一个SpringBoot项目!";
	}

	@RequestMapping("/student")
	@ResponseBody
	public Student student() {
		Student student = new Student();
		student.setAge(22);
		student.setId(1);
		student.setName("jason");
		student.setSex("man");
		return student;
	}

}
