package designpattern.single;

public enum DatabaseConnection {
    CONNECTION;
    private String url = "jdbc:mysql://localhost:3306/mydb";

    private DatabaseConnection(){
        System.out.println("数据库已连接");
    }

    public void connect(){
        System.out.println("正在连接到:"+url);
    }
}
