05�� 22�� : 00��14��

1) MysqlConnector�����߰�
--���ο� �ִ� mysql-connector-java-5.1.46-bin.jar������
  �ڽ��� �ڹ� jdk�� ����ġ (���α׷�����\java)
  ���� java\jdk(����)\jre\lib\ext �� java\jre\lib\ext ���� ÷��

2) ��Ŭ���� => Data Source Explorer -> Database Connections [��Ŭ��]
   -> New -> MySQL -> (�ڵ����� ����ȵǸ�) JAR List���� mysql-connector-java-5.1.46-bin.jar �߰�
   -> Database, URL, User name, Password �Է�â�� ���´ٸ�
      Database: �̸� ������� // url: jdbc:mysql://localhost:3306/ossw
      User name: root // Password: db�н�����(���� �������)
   -> ���� Ȯ���ϸ� DB���� �����Ϸ� ���ǹ� ��밡��

3) workspace\Pos\src �� DataInfo.java�߰� 
(���⼭ DB���� �� �ʿ��� ����� ���� ����)

------------------------------

05�� 21�� : 21��13��

1) ���� C#���� �ۼ��� GUI, �ڹٷ� ����
�¼���ġ��<-->�¼�����â ��ȯ���� �Ϸ�
(DB���� �� �¼���ȣ, �޴���ư[+�̺�Ʈ], 
Ȯ��&����&��� �̺�Ʈ, �¼��̵���ư[+�̺�Ʈ] ��������)

2) ���Ͽ뷮�� workspace (��Ŭ���� �۾�����)�� ÷��
(workspace\Pos\src �ȿ� Exe.java�� MainPanel.java ����)

