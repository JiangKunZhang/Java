import java.sql.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/5 19:08
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/huojianban2_0601?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "0331";
        Connection conn = DriverManager.getConnection(url,user,password);

        updateDemo(conn);

        conn.close();
    }

    private static void updateDemo(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "insert into student_0604 (sn, name, sex) values ('12345', 'zjk', '男')";
        int affectRows = statement.executeUpdate(sql);
        System.out.println(affectRows);
    }

    private static void queryDemo(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "select * from student_0604";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {//一开始游标指向无效行
            System.out.print(rs.getString(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.println(rs.getString(4));
        }
        rs.close();
        stmt.close();
    }

}
