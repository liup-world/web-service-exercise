package com.bobsystem.ws.webservice;

import com.bobsystem.ws.bean.Student;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.bobsystem.ws.webservice.IWsExample")
public class WsExample
    implements IWsExample {

    private static final String PUBLISH_ADDRESS = "http://localhost:8080/service/ws-test";

    //region publish
    // 在这里发布时，不能找到 CFX 相关的 jar，会报错
    public static void main(String[] args) {

        WsExample service = new WsExample();
        Endpoint.publish(PUBLISH_ADDRESS, service);
    }
    //endregion

    // 原生类型
    public double getPrimitiveTypes() {

        return Math.PI;
    }

    // 包装类型
    public Double getWrappingTypes() {

        return Math.PI;
    }

    // 基本类型
    public String getString() {

        return "hello, hello, hello";
    }

    // 数组
    public String[] getArray(String name) {

        return new String[] { "hello", "hello", name };
    }

    // 列表
    public List getList() {

        List<String> result = new ArrayList<String>();
        result.add("aa");
        result.add("bb");
        result.add("cc");

        return result;
    }

    // 复合类型
    public Student getCompsiteType() {

        return new Student("liup", 20);
    }

    public void passCompsiteType(Student student) {

        if (student != null) {

            System.out.print(student.getName());
            System.out.println(student.getAge());
        }
    }
}
