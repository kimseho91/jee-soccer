<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 5. 수원팀(ID: K02)키가 170 이상 선수,이면서 성이 고씨인 선수-->
<h2>5.팀아이디,성씨,키 로 인한 검색 기능</h2>
<form action="heightname" action="${ctx}/player.do">
	소속팀 <input type="text" name="teamId"/> <br/>
	성씨    <input type="text" name="playername"/><br/>
	키       <input type="text" name="height"/><br/>
	<input type="hidden" name="action" value="findinfo2"/>
	<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
	<input type="submit" value="정보검색"/>
</form>
<!-- 결과  -->
입력받은 팀ID ${teamId} 와 입력받은 키  ${height} 이상 입력받은 성 ${playerName}에 <br />
해당하는 선수는 ${player}
