<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IF</title>
</head>
<body>
	<h1>Conditional statments</h1>
	<h2>Program</h2>
	<script>
		document.write('1<br>');
		document.write('2<br>');
		document.write('3<br>');
		document.write('4<br>');
	</script>
	<h2>IF true</h2>
	<script>
		document.write('1<br>');
		if (true) {
			document.write('2<br>');
		} else {
			document.write('3<br>');
		}
		document.write('4<br>');
	</script>
	
	<h2>IF false</h2>
	<script>
		document.write('1<br>');
		if (false) {
			document.write('2<br>');
		} else {
			document.write('3<br>');
		}
		document.write('4<br>');
	</script>
	
</body>
</html>