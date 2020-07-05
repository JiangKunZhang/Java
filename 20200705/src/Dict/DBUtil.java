package Dict;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/5 13:21
 */
public class DBUtil {

    public static volatile DataSource dataSource = null;

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {
                    dataSource = initDatasource();
                }
            }
        }
        return dataSource.getConnection();
    }

    public static DataSource initDatasource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://localhost:3306/hjb2_0705?useSSL=false&characterEncoding=utf8");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("0331");

        return mysqlDataSource;
    }
}
