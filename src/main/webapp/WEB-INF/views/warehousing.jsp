<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/warehousing.js"></script>
    <title>상품입고</title>
</head>

<body>
    <h1>상품입고</h1>
    <select class="select">
        <option value="" selected>- 선택 -</option>
        <c:forEach items='${cate}' var="list">
            <option value="${list.seq}">${list.category}</option>
        </c:forEach>
    </select>
    <input type="text" id="goods" placeholder="입고 품명"/>
    <input type="number" id="amount" placeholder="입고 수량" />
    <input type="text" id="price" placeholder="물품 단가" />
    <input type="date" id="date" />
    <button class="save">저장</button>
</body>

</html>