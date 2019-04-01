package com.bobsystem.ws.webservice;

import com.bobsystem.ws.bean.Student;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface IWsExample {

    // 原生类型
    double getPrimitiveTypes();

    // 包装类型
    Double getWrappingTypes();

    // 基本类型
    String getString();

    // 数组
    String[] getArray(String name);

    // 数组
    List getList();

    // 复合类型
    Student getCompsiteType();

    void passCompsiteType(Student student);
}
