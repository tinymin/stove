<%--
  Created by IntelliJ IDEA.
  User: tinymin
  Date: 16. 3. 29.
  Time: 오후 1:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <label for="searchVal"></label>
                <input type="text" name="searchVal" id="searchVal" class="form-control" placeholder="예) 구지, 디파니, 누이빈통, 록시땡" style="width:90%;">
                <button type="submit" class="btn btn-danger">Search</button>
            </form:form>
        </div>
    </div>
</body>
</html>