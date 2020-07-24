package com.xiaomi.dubbo.api;

import com.xiaomi.dubbo.entity.Student;
import com.xiaomi.dubbo.vo.ResultVO;

public interface StudentService{
    ResultVO<Student> getStudentByName(String name);
}
