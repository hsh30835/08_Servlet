<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>GET을 이용한 데이터 전송 방식</h1>
    <form action="query-string" method="get">
        <label>이름 : </label> <input type="text" name="name"/>
        <!--label input type의 이름 input type= "text"는 문자열 입력할 수 있는 기능-->
        <label>나이 : </label> <input type="number" name="age"/>
        <!--숫자 입력하는 기능 문자열 입력시 숫자 입력하라고 알려줌-->
        <label>생일 : </label> <input type="date" name="birthday"/>
        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie"/><label for="movie">영화</label>
        <input type="checkbox" name="hobbies" id="music" value="music"/><label for="music">음악</label>
        <input type="checkbox" name="hobbies" id="sleep" value="sleep"/><label for="sleep">수면</label>
        <button type="submit">전송하기</button>
        <!--submit은 checkbox에서 선택한거 전송해줌-->
    </form>
    <br>
    <h1>post을 이용한 데이터 전송 방식</h1>
    <form action="post-request" method="post">
        <label>이름 : </label> <input type="text" name="name"/>
        <label>나이 : </label> <input type="number" name="age"/>
        <label>생일 : </label> <input type="date" name="birthday"/>
        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie2" value="movie"/><label for="movie">영화</label>
        <input type="checkbox" name="hobbies" id="music2" value="music"/><label for="music">음악</label>
        <input type="checkbox" name="hobbies" id="sleep2" value="sleep"/><label for="sleep">수면</label>
        <button type="submit">전송하기</button>
    </form>
</body>
</html>