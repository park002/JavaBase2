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
	<p>�ȳ� ����� ���� ������ ������� �ñ��. �״� �������� ������ ���� ���� ó���ϴ� ����� ã�Ƴ���.�� ���ڷ�������
		���� ���� �ƴϴ�. ���� ���� ��� ����� Ŀ�Ǽ󿡼� �ӹ� �ð��� ����. ���ͷ� ���ؾ� �Ѵ�.�� ���ڽ��� �� �����͵� ������
		����... �ڱ� �ڽ��� ����ϴ� �ൿ�̴�.�� �ȳ� ���迡 F�� ���� ���� �� �� �ִ�. �� ģ���� ��� ������ ����ߴ�. �״�
		���� ����ũ�μ���Ʈ���� �����Ͼ�� ���ϰ� �ִ�. �� ����ũ�μ���Ʈ �����̴�.�� ������ ��ǰ�� ���� �� ���ٸ� ��� ����
		��ǰó�� ���̰� ������ �Ѵ�.�� �ȺҸ��� ���� ���� �����κ��� ��� �� ���� ����.�� �Ȱ����ϰ� �¾ �� �� �����
		�߸��� �ƴ�����, �����ϰ� �״� �� �� ����� �߸��̴�.�� �ȼ����� ������� �������̴�. �ȶ��� ������� ������ �� ���ٴ�
		������ ��Ʈ����.�� ���λ��� �������� �ʴ�. �� ��ǿ� ���� �ͼ������� �� ��å�̴١� �ȼ����� �ٽ� ��Ҵ� �γ����̴�.��</p>
		
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