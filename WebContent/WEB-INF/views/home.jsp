<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
<h2><a id="btn2" href="#">2.모든 포지션 보기</a></h2>

<h2>4.팀아이디와 포지션 입력하면 해당 선수 정보 출력</h2>
<form id="btn4" action="<%=request.getContextPath()%>/player.do">
	팀아이디 :<input type="text" name="teamId"/><br />
	포지션 :<input type="text" name="position"/><br />
	<input type="hidden" name="action" value="find4" />
	<input type="hidden" name="page" value="4_find_by_teamid_position"/><br />
	<input type="submit" value="전송" />	
</form>
<h2>5.팀아이디 키 성을 입력하면 해당 선수 정보 출력</h2>
<form id="btn5" action="<%=request.getContextPath()%>/player.do">
	팀아이디 :<input type="text" name="teamId" /><br />
	키 :<input type="text" name="height" /><br />
	성 :<input type="text" name="playerName" /><br />
	<input type="hidden" name="action" value="find5" /><br />
	<input type="hidden" name="page" value="5_find_by_teamid_height_name"/><br />
	<input type="submit" value="전송" />
</form>
</div>
<script>
$('#btn2').click(function () {
		alert('클릭!!');
		location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions');
});

$('#btn4').submit(function () {
		alert('테스트');
});

$('#btn5').submet(function () {
		alert('테스트22');
	
});
</script>
</body>
</html>