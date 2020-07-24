package com.xiaomi.dubbo.controller;

import com.xiaomi.dubbo.api.StudentService;
import com.xiaomi.dubbo.entity.Student;
import com.xiaomi.dubbo.vo.ResultVO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@Controller
public class StudentController{
    Logger logger = Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;
    @ResponseBody
    @RequestMapping(path = "/getData",produces={"application/json"})
    public ResultVO<Student> getData(String name){
        ResultVO<Student> studentByName = studentService.getStudentByName(name);
        logger.info(studentByName.toString());
        return studentByName;
    }
}
