package com.kavita;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		int marks = Integer.parseInt(req.getParameter("marks"));
//		System.out.println(name + " " + age + " " + marks);
		PrintWriter pw = res.getWriter();
		pw.print("<h1>");
		pw.print("<body bgcolor = 'pink'>");
		pw.print("<h1> Hello.Login Successful</h1>");
		pw.print("</h1>");
		pw.println("Name : "+name);
		pw.print("</h1>");
		pw.println("Age : "+age);
		pw.print("</h1>");
		pw.println("Marks : "+marks);
		pw.println("</body>");
		
	}
}





