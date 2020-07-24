package com.xiaomi.dubbo.service;

import com.xiaomi.dubbo.api.StudentService;
import com.xiaomi.dubbo.entity.Student;
import com.xiaomi.dubbo.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public ResultVO<Student> getStudentByName(String name) {
        Student student = new Student(name,"man",24);
        ResultVO<Student> studentResultVO = new ResultVO<>(student,"success","1");
        return studentResultVO;
    }
}
