<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% Object name=request.getParameter("name"); %>
<%=name %>
<body><h1> <b>Login Successfully</b></h1>

<a href="./insert"></a>
<label> Insert Data :</label><input type="text" name="insert data">  <input type="submit" value="submit"><br><br>
<a href="update"></a>
<label> Update data :</label><input type="text" name="update data"> <input type="submit" value="submit"><br><br>
<a href="delete"></a>
<label> delete data :</label><input type="text" name="delete data"> <input type="submit" value="submit"><br><br>
<a href="read"></a>
<label> read data :</label><input type="text" name="read data"><input type="submit" value="submit"><br><br>





</form>

</body>
</html>