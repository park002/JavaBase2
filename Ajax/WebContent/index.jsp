<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>
<html>
<head>
  <title>WEB1 - Welcome</title>
  <meta charset="utf-8">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="colors.js"></script>
</head>
<body>
  <h1><a href="index.html">WEB</a></h1>
  <input id="night_day" type="button" value="night" onclick="
    nightDayHandler(this);
  ">
  <ol>
    <li><a onclick="fetchPage('html')">HTML</a></li>
    <li><a onclick="fetchPage('css')">CSS</a></li>
    <li><a href="3.html" onclick="fetchPage('javascript')">JavaScript</a></li>
  </ol>
<article>


</article>
    <script>
    function fetchPage(name){
   fetch(name).then(function(response){
		response.text().then(function(text){
			alert(text);
			document.querySelector('article').innerHTML=text;
		})
		})
    }

   </script>
</body>
</html>
