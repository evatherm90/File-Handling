<%-- 
    Document   : ListOfFiles
    Created on : Sep 24, 2019, 1:58:18 AM
    Author     : antonis
--%>

<%@page import="dao.MyFileDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelPackage.MyFile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of files Page</title>
    </head>
    
    <% 
        ArrayList<MyFile> files = new MyFileDao().getAll(); 
    
    %>
     
    <body>
        <h1>List of Uploaded Files!</h1>
        <table>
            <thead>
                <tr>
                    <th>file id</th>
                    <th>file name</th>
                    <th>download</th>
                    <th>delete</th>
                </tr>
            </thead>

            <% for (MyFile file : files) {%>

            <tr>
                <td><%= file.getId()%></td>
                <td><%= file.getFilename()%></td>
                <td><a href="DownloadServlet?id=<%= file.getId()%>">download</a></td>
                <td><a href="DeleteServlet?id=<%= file.getId()%>">delete</a></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
