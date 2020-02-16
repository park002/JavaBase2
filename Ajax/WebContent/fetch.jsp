<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>

<html>
<body>	
<article>

</article>
<input type="button" value="fetch" onclick="
fetch('html').then(function(response){
	console.log(response.status);
	if(response.status == '404') {
		alert('File Not Found!!');
	}
});
console.log(1);
console.log(2);
">
 

<!-- fetch('html').then(function(response){
	response.text().then(function(text){
		alert(text);
		document.querySelector('article').innerHTML=text;
		
	})
}) -->


</body>
</html>
