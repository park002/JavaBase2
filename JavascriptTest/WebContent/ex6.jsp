<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Array</h1>
	<h2>Syntax</h2>
	<script>
		var coworkers = [ "egoing", "leezche" ];
	</script>
	<h2>get</h2>
	<script>
		document.write(coworkers[0]);
		document.write(coworkers[1]);
	</script>
	
	<h2>add </h2>
	<script>
	coworkers.push("duru");
	coworkers.push("taeho");
	document.write(coworkers[2]);
	</script>
	
	<h2>Count</h2>
	<script>
	document.write(coworkers.length);
	</script>
</body>
</html>