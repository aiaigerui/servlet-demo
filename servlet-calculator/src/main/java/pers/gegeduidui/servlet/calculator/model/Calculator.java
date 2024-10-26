package pers.gegeduidui.servlet.calculator.model;

/**
 * @Author Bruce Han
 * @Create 2024/10/26 10:40
 */
public class Calculator {

    public String operate(String op, int num1, int num2) {
        switch (op) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            case "/":
                // 这里可以加一个判断分母是否为0的逻辑，避免除数为0的异常
                if (num2 == 0) {
                    return "错误：除数不能为0";
                }
                return String.valueOf(num1 / (float) num2);
            default:
                return "输入有误，请重新选择需要的运算";
        }
    }

}
