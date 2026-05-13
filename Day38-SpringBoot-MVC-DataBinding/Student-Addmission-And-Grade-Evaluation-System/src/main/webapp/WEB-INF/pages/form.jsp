<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Admission Form</title>
</head>
<body>

<h2>Student Admission Form</h2>

<form action="form23" method="post">

    Name:
    <input type="text" name="name" required />
    <br><br>

    Roll No:
    <input type="number" name="rollNo" required />
    <br><br>

    Marks 1:
    <input type="number" name="marks1" required />
    <br><br>

    Marks 2:
    <input type="number" name="marks2" required />
    <br><br>

    Marks 3:
    <input type="number" name="marks3" required />
    <br><br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>