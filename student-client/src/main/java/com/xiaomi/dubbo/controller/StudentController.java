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
    @RequestMapping("/getData")
    public ResultVO<Student> getData(String name){
        ResultVO<Student> studentByName = studentService.getStudentByName(name);
        Student student = studentByName.getData();
        logger.info("+++++++++返回码是："+studentByName.getStatus()+" name:"+student.getName()+" resultSet:"+student.getSex());

        return studentByName;
    }
}
