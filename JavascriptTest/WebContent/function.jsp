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
	<script>
		function onePluseone() {
			document.write(1 + 1 + '<br>');
		}
		onePluseone();

		function sum(left, right) {
			document.write(left + right + '<br>');
		}
		function sumColorRed(left, right) { //String+int = > String // int+int= int 
			document.write('<div style="color:red">'+(left+right)+'</div><br>');
		}
		sum(2, 3); //5
		sumColorRed(2,3);
		sum(3, 4); //7
	</script>
	
	<h2>Return</h2>
	<script>
	function sum2(left,right) {
	 return 	 left+right;
		
	}
	document.write(sum2(2,3)+'<br>');
	document.write('<div style="color:red">'+sum2(2,3)+'</div>');
	document.write('<div style="font-size:3rem;">'+sum2(2,3)+'</div>');
	
	</script>

</body>
</html>