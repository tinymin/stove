# 개인 공부용 프로젝트


개발배경

오늘 백화점에 가서 특정 브랜드 3군데를 방문하려고 한다. 그런데 가고 싶은 브랜드가 어느 백화점에 모두 있는지 찾아보려고 하니 쉽지가 않다. 그래서 개발을 하게 되었다.
원하는 브랜드를 모두 입력하면 그 브랜드가 모두 있는 백화점을 검색하는 서비스이다.








주의 : DB 설정을 해야함. 방법은 2가지 중 하나를 선택

1. 아래 경로에 [dbinfo.properties] 파일을 만들어 jdbc 정보를 입력해야함.
/stove/src/main/resources/dbinfo.properties

2. 1번이 싫다면 [ member-context.xml ]파일에서 dataSource 빈에 직접 JDBC 정보를 입력한다.

