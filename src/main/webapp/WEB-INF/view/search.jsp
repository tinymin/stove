<%--
  Created by IntelliJ IDEA.
  User: tinymin
  Date: 16. 4. 1.
  Time: 오후 5:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>스토브</title>
    <!-- JQuery CDN -->
    <script src="https://code.jquery.com/jquery-2.2.2.min.js" charset="UTF-8" integrity="sha256-36cp2Co+/62rEAAYHLmRCPIych47CvdM+uTBJwSzWjI=" charset="utf-8" crossorigin="anonymous"></script>

    <!-- BootStrap CDN -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- AJAX 처리 -->
    <script language="text/javascript">

    </script>
</head>
<body>
<div class="container bs-docs-container">
    <div class="jumbotron">
        <h2>Stove</h2>
    </div>

    <div class="form-group" style="width:90%;">
        <form:form action="search" method="POST" commandName="searchRequest">
            <input type="text" name="searchVal" id="searchVal" value="${searchRequest.searchStores}" class="form-control" placeholder="예) 구지, 디파니, 누이빈통, 록시땡" style="width:85%;">
            <input type="submit" class="btn btn-danger" value="Search" />
        </form:form>
    </div>

    <div width="80%">
        <table border="1" with="100%">
            <tr>
                <th>매장명</th>
                <th>층</th>
                <th>전화번호</th>
                <th>백화점</th>
                <th>지점</th>
                <th>영업시간</th>
                <th>주소</th>
                <th>홈페이지</th>
            </tr>
            <c:forEach items="${searchResponse}" var="store" varStatus="status">
                <tr>
                    <td>${store.storeName}</td>
                    <td>${store.storeFloor}</td>
                    <td>${store.storeTel}</td>
                    <td>${store.depStoreName}</td>
                    <td>${store.depStoreBranch}</td>
                    <td>${store.depStoreBusinessHour}</td>
                    <td>${store.depStoreAddress}</td>
                    <td><a href="${store.depStoreSiteURL}">연결</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>