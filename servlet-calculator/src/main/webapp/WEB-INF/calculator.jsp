<%--
  Created by IntelliJ IDEA.
  User: hanweigang
  Date: 2024/10/26
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<% String path = request.getContextPath();%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
<form method="post" action="<%=path%>/calculator">
    <table>
        <tr>
            <td colspan="2"
                style="font-size: 25px; color: black">计算器
            </td>
        </tr>

        <tr>
            <td align="right" style="font-size: 20px; color: black">第一个参数:</td>
            <td align="left">
                <input type="text" name="num1" id="num1"
                       style="font-size: 20px; color: black">
            </td>
        </tr>

        <tr>
            <td align="right" style="font-size: 20px; color: black">运算符选择:</td>
            <td align="left">
                <select name="op" style="font-size: 20px; color: black">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            </td>
        </tr>

        <tr>
            <td align="right" style="font-size: 20px; color: black">第二个参数:</td>
            <td align="left"><input type="text" name="num2" id="num2"
                                    style="font-size: 20px; color: black">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button
                        style="display: block; margin: 0 auto; font-size: 20px;"
                        type="submit" name="calculate">计 算
                </button>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td colspan="2" height="100px" style="font-size: 25px">
                ${result}
            </td>
        </tr>

    </table>
</form>
</body>
</html>
