<%@ page isELIgnored="false"%>

<h1 style="cyan;">Student Details</h1>

<h5>Student ID: ${id}</h5>
<h5>Student Name: ${name} </h5>
<h5>Student Course: ${course}</h5>
<h5>Student College: ${college}</h5>
<h5> Student Subject Marks</h5>
<table border="1">
<tr>
<th>Math </th><th>Hindi </th><th>English </th><th> Science</th><th> Physics</th>
</tr>
<tr> 
<td> ${m0}</td><td> ${m1}</td><td> ${m2}</td><td> ${m3}</td><td> ${m4}</td>
</tr>
</table>

<h5>Average: ${average} </h5>
<h5>Student Grade: ${grade} </h5>