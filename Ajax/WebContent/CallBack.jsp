<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script>
function sum(num1,num2) {
	return num1+num2;
	
}
document.write(sum(1,2)); //3

function greeting(name) {
	alert('�ݰ����ϴ�.'+name);
}
function processUserInput(callback) {
	var name = prompt('�̸��� �Է��� �ּ���');
	callback(name);
}
processUserInput(greeting);


</script>
</body>
</html>