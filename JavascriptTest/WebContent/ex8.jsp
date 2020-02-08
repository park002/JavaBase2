<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Loop & Array</h1>
	<script>
		var coworkers = [ 'egoing', 'leezche', 'duru', 'taeho','gg' ];
	</script>
	<h2>Coworkers</h2>
	<ul>
		<script>
			var i = 0;
			while (i < coworkers.length) {
				document.write('<li><a href="http://www.naver.com/'+coworkers[i]+' ">'+coworkers[i]+'</a></li>');
				i = i + 1;
			}	
		</script>

	</ul>
</body>
</html>