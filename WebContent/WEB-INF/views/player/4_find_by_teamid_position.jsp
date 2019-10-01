<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 4.팀아이디와 해당 포지션별 선수 검색기능 예) 수원팀 ID:K02,골키퍼 -->	
<h2>4.팀아이디와 해당 포지션별 선수 검색 기능</h2>
<form id="info" action="${ctx}/player.do">
	아이디 : <input type="text" name="teamId" /> <br/>
	포지션 : <input type="text" name="position" /> <br/>
	<input type="hidden" name="action" value="findinfo"/>
	<input type="hidden" name="page" value="4_find_by_teamid_position"/>
	<input type="submit" id='text' value="정보 검색"/>
</form>

<!-- 4번 결과  -->
입력받은 팀ID ${teamId} 와 입력받은 포지션 ${position} 과 <br />
일치하는 선수는 ${player}입니다.
</body>
</html>