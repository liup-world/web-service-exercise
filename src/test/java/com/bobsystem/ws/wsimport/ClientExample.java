package com.bobsystem.ws.wsimport;

import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Arrays;

public class ClientExample {

    // 服务开发人员测试用
    @Test
    public void test4Developer() {

        try {
            URL url = new URL("http://localhost:8080/service/ws-test?wsdl");
            QName qname = new QName("http://webservice.ws.bobsystem.com/",
                "WsExampleService");
            Service service = Service.create(url, qname);
            IWsExample client = service.getPort(IWsExample.class);

            System.out.println(client.getPrimitiveTypes());
            System.out.println(client.getWrappingTypes());
            System.out.println(client.getString());
            System.out.println(Arrays.toString(client.getArray("liup").toArray()));
            System.out.println(Arrays.toString(client.getList().toArray()));
            System.out.println(client.getCompsiteType().getName());

            Student student = new Student();
            student.setName("liup");
            student.setAge(20);

            client.passCompsiteType(student);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 客户端的使用方式，通过使用 wsimport 生成的客户端代码
    // wsimport 命令：
    // wsimport -s ~/src -p com.package.name http://localhost:8080/ws-test?wsdl
    @Test
    public void test4Client() {

        WsExampleService service = new WsExampleService();
        IWsExample client = service.getWsExamplePort();

        System.out.println(client.getPrimitiveTypes());
        System.out.println(client.getWrappingTypes());
        System.out.println(client.getString());
        System.out.println(Arrays.toString(client.getArray("liup").toArray()));
        System.out.println(Arrays.toString(client.getList().toArray()));
        System.out.println(client.getCompsiteType().getName());

        Student student = new Student();
        student.setName("liup");
        student.setAge(20);

        client.passCompsiteType(student);
    }
}
