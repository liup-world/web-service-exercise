
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.net.URL" %>
<%@ page import="javax.xml.namespace.QName" %>
<%@ page import="javax.xml.ws.Service" %>
<%@ page import="com.bobsystem.ws.wsimport.IWsExample" %>
<%@ page import="com.bobsystem.ws.wsimport.WsExampleService" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.bobsystem.ws.wsimport.Student" %>

<html>
<head>
  <title>test service</title>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
开发人员测试用<br />
<%
  // 开发人员测试用
  URL url = new URL("http://localhost:8080/service/ws-test?wsdl");
  QName qname = new QName("http://webservice.ws.bobsystem.com/", "WsExampleService");

  try {
    Service service = Service.create(url, qname);
    IWsExample client = service.getPort(IWsExample.class);

    out.println(client.getPrimitiveTypes());
    out.print("<br />");

    out.println(client.getWrappingTypes());
    out.print("<br />");

    out.println(client.getString());
    out.print("<br />");

    out.println(Arrays.toString(client.getArray("liup").toArray()));
    out.print("<br />");

    out.println(Arrays.toString(client.getList().toArray()));
    out.print("<br />");

    out.println(client.getCompsiteType().getName());

    Student student = new Student();
    student.setName("liup");
    student.setAge(20);

    client.passCompsiteType(student);
  }
  catch (Exception ex) {
    ex.printStackTrace();
  }
%>
<br />
客户端的使用方式，通过使用 wsimport 生成的客户端代码<br />
wsimport 命令：<br />
wsimport -s ~/src -p com.package.name http://localhost:8080/service/ws-test?wsdl<br />
<%
  //WsExampleService ws = new WsExampleService();
  WsExampleService service = new WsExampleService(url, qname);
  IWsExample client = service.getWsExamplePort();
  //org.apache.cxf.transport.http.Headers.

  out.println(client.getPrimitiveTypes());
  out.print("<br />");

  out.println(client.getWrappingTypes());
  out.print("<br />");

  out.println(client.getString());
  out.print("<br />");

  out.println(Arrays.toString(client.getArray("liup").toArray()));
  out.print("<br />");

  out.println(Arrays.toString(client.getList().toArray()));
  out.print("<br />");

  out.println(client.getCompsiteType().getName());

  Student student = new Student();
  student.setName("liup");
  student.setAge(20);

  client.passCompsiteType(student);
%>
以下是通过 Spring 注入得到 WS进行调用<br />
<%
  //ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
  //StudentService studentService = appContext.getBean("studentService", StudentService.class);
  //studentService.process(out);
%>
</body>
</html>
