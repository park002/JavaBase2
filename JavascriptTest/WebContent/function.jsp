<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Function</h1>
	<h2>Basic</h2>
	<ul>
		<script>
			function two() {
				document.write('<li>2-1</li>');
				document.write('<li>2-2</li>');
			}
			document.write('<li>1</li>');
			two();
			document.write('<li>3</li>');
			two();
		</script>


	</ul>
	<h2>Parameter & Argument</h2>
	<h2>Return</h2>

</body>
</html>