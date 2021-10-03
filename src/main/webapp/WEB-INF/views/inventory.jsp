<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/inventory.js"></script>
    <title>Document</title>
</head>

<body>
    <h1>재고 현황</h1>
    <div class="top">
        <p>재고 검색</p>
        <input type="text" id="item">
        <button id="search">검색</button>
    </div>
    <div class="head">
        <thead>
            <tr>
                <td>분류</td>
                <td>상품명</td>
                <td>재고 수량</td>
                <td>입고일</td>
                <td>금액</td>
                <td>출고</td>
            </tr>
            <button id = "release">출고</button>
        </thead>
    </div>
    <div class="body">
    </div>
    
</body>

</html>