package pers.gegeduidui.servlet.calculator.servlet;

import pers.gegeduidui.servlet.calculator.model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 默认直接返回，这里需要跳转到jsp
        // super.doGet(req, resp);

        int num1 = parseInt(req.getParameter("num1"));
        int num2 = parseInt(req.getParameter("num2"));
        String op = req.getParameter("op");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(op);

        Calculator cal = new Calculator();
        String result = cal.operate(op, num1, num2);
        System.out.println("运算结果：" + result);

        //业务逻辑跳转
        req.setAttribute("result", "结果：" + result);
        req.getRequestDispatcher("/WEB-INF/calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
