<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hash</title>
</head>
<body>
<a href="#three"> three </a>
	<p>″난 어려운 일을 게으른 사람에게 맡긴다. 그는 게으르기 때문에 일을 쉽게 처리하는 방법을 찾아낸다.” ″텔레비전은
		실제 삶이 아니다. 실제 삶을 사는 사람은 커피숍에서 머물 시간이 없다. 일터로 향해야 한다.” ″자신을 그 누구와도 비교하지
		마라... 자기 자신을 모욕하는 행동이다.” ″난 시험에 F를 맞은 적이 몇 번 있다. 내 친구는 모든 시험을 통과했다. 그는
		지금 마이크로소프트에서 엔지니어로 일하고 있다. 난 마이크로소프트 주인이다.” ″좋은 제품을 만들 수 없다면 적어도 좋은
		제품처럼 보이게 만들어야 한다.” ″불만이 가장 많은 고객으로부터 배울 게 가장 많다.” ″가난하게 태어난 건 그 사람의
		잘못이 아니지만, 가난하게 죽는 건 그 사람의 잘못이다.” ″성공은 형편없는 선생님이다. 똑똑한 사람들을 실패할 수 없다는
		착각에 빠트린다.” ″인생은 공평하지 않다. 그 사실에 빨리 익숙해지는 게 상책이다” ″성공의 핵심 요소는 인내심이다.”</p>
		
	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
		eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
		minim veniam, quis nostrud exercitation ullamco laboris nisi ut
		aliquip ex ea commodo consequat. Duis aute irure dolor in
		reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
		pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
		culpa qui officia deserunt mollit anim id est laborum.</p>
		
	<p id="three">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
		eiusmod tempor inci didunt ut labore et dolore magna aliqua. Ut enim
		ad minim veniam, quis nostrud exerci tation ullamco laboris nisi ut
		aliquip ex ea commodo consequat. Duis aute irure dolor in re
		prehenderit in voluptate velit esse cillum dolore eu fugiat nulla
		pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
		culpa qui officia deserunt mollit anim id est laborum.</p>
		
		<script>
		if(location.hash) {
			console.log(location.hash.substr(1));
		}
		</script>
</body>
</html>