05월 22일 : 11시50분

1) 분할 (MainPanel.java을 SeatAllPanel.java와 SeatPanel.java를 추가생성하여 분할)
--MainPanel	:다른 클래스객체 생성및 이벤트 관리
--SeatAllPanel	:전체 좌석화면
--SeatPanel	:선택한 좌석화면

------------------------------

05월 22일 : 00시14분

1) MysqlConnector폴더추가
--내부에 있는 mysql-connector-java-5.1.46-bin.jar파일을
  자신의 자바 jdk가 깔린위치 (프로그램파일\java)
  에서 java\jdk(버전)\jre\lib\ext 와 java\jre\lib\ext 에다 첨부

2) 이클립스 => Data Source Explorer -> Database Connections [우클릭]
   -> New -> MySQL -> (자동으로 연결안되면) JAR List에서 mysql-connector-java-5.1.46-bin.jar 추가
   -> Database, URL, User name, Password 입력창이 나온다면
      Database: 이름 상관없음 // url: jdbc:mysql://localhost:3306/ossw
      User name: root // Password: db패스워드(서로 맞춰야함)
   -> 이후 확인하면 DB연결 설정완료 질의문 사용가능

3) workspace\Pos\src 에 DataInfo.java추가 
(여기서 DB연동 및 필요한 상수값 정의 예정)

------------------------------

05월 21일 : 21시13분

1) 기존 C#으로 작성한 GUI, 자바로 변경
좌석배치도<-->좌석선택창 전환까지 완료
(DB연결 후 좌석번호, 메뉴버튼[+이벤트], 
확인&결제&취소 이벤트, 좌석이동버튼[+이벤트] 구현예정)

2) 파일용량상 workspace (이클립스 작업폴더)만 첨부
(workspace\Pos\src 안에 Exe.java와 MainPanel.java 존재)