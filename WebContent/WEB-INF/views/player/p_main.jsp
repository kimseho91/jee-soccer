<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플레이어 메인 !!</title>
</head>
<body>
<h2>2.포지션 종류보기</h2>
<h2><input id="position" type="button" value="포지션 종류보기"/></h2>
	<input type="hidden" name="action" value="move" />
	<input type="hidden" name="page" value="2_positions" />
<h2>4.팀아이디와 해당 포지션별 선수 검색 기능</h2>
<form id="info" action="${ctx}/player.do">
	아이디 : <input type="text" name="teamId" /> <br/>
	포지션 : <input type="text" name="position" /> <br/>
	<input type="hidden" name="action" value="findinfo"/>
	<input type="hidden" name="page" value="4_find_by_teamid_position"/>
	<input type="submit" id='text' value="정보 검색"/>
</form>
<h2>5.팀아이디,성씨,키 로 인한 검색 기능</h2>
<form action="heightname" action="${ctx}/player.do">
	소속팀 <input type="text" name="teamId"/> <br/>
	성씨    <input type="text" name="playername"/><br/>
	키       <input type="text" name="height"/><br/>
	<input type="hidden" name="action" value="findinfo2"/>
	<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
	<input type="submit" value="정보검색"/>
</form>
</body>
</html>