package com.bobsystem.ws.service;

import com.bobsystem.ws.wsimport.IWsExample;
import com.bobsystem.ws.wsimport.Student;

import javax.servlet.jsp.JspWriter;
import java.util.Arrays;

public class StudentService {

    private IWsExample wsExample;

    public StudentService() {
    }

    public StudentService(IWsExample wsExample) {

        this.wsExample = wsExample;
    }

    public void process(JspWriter writer) {

        try {
            writer.println(this.wsExample.getPrimitiveTypes());
            writer.println(this.wsExample.getWrappingTypes());
            writer.println(this.wsExample.getString());

            writer.println(Arrays.toString(this.wsExample.getArray("liup").toArray()));
            writer.println(Arrays.toString(this.wsExample.getList().toArray()));

            writer.println(this.wsExample.getCompsiteType().getName());

            Student student = new Student();
            student.setName("liup");
            student.setAge(20);
            this.wsExample.passCompsiteType(student);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public IWsExample getWsExample() {
        return wsExample;
    }

    public void setWsExample(IWsExample wsExample) {
        this.wsExample = wsExample;
    }
}
