<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loop</title>
</head>
<body>
	<h1>Loop</h1>
	<ul>
		<script>
			document.write('<li>1</li>');
			var i = 0;
			while (i < 3) { // 0<3   2 3  1<3 2 3  2<3 2 3 
				document.write('<li>2</li>');
				document.write('<li>3</li>');
				i = i + 1;
			}
			document.write('<li>4</li>');
		</script>
	</ul>
</body>
</html>