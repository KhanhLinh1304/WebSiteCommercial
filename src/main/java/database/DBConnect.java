package database;

import java.sql.*;

public class DBConnect {
	private String url = "jdbc:mysql://localhost:3306/websitecommercial";
    private String user = "root";
    private String pass = "0385170019";
    Connection connection;
     private  static DBConnect install;

    private  DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnect getInstall() {
        if (install == null)
            install = new DBConnect();
        return install;
    }

    public Statement get() {
        try {
            if(connection == null)
                return null;
            return connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        // Tạo đối tượng DBConnect sử dụng Singleton Pattern
        DBConnect dbConnect1 = DBConnect.getInstall();
        DBConnect dbConnect2 = DBConnect.getInstall();

        // Kiểm tra xem cả hai đối tượng có trỏ đến cùng một thể hiện không
        if (dbConnect1 == dbConnect2) {
            System.out.println("dbConnect1 và dbConnect2 trỏ đến cùng một thể hiện.");
        } else {
            System.out.println("Lỗi: dbConnect1 và dbConnect2 không trỏ đến cùng một thể hiện.");
        }

        try {
            // Sử dụng đối tượng dbConnect1 để thực hiện truy vấn
            Statement statement1 = dbConnect1.get();
            if (statement1 != null) {
                System.out.println("Truy vấn từ dbConnect1 thành công.");
                statement1.close();
            }

            // Sử dụng đối tượng dbConnect2 để thực hiện truy vấn
            Statement statement2 = dbConnect2.get();
            if (statement2 != null) {
                System.out.println("Truy vấn từ dbConnect2 thành công.");
                statement2.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
