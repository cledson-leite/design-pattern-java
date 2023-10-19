import after.ConnectionSingleton;
import after.ConnectionSingletonPool;
import before.Connection;
import before.ConnectionPool;

public class App {
    public static void main(String[] args) throws Exception {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println("### Connection 1 without pattern ###");
        if (conn != null) {
            conn.query("SELECT * FROM A1");
        }
        pool = new ConnectionPool();
        Connection conn2 = pool.getConnection();
        System.out.println("### Connection 2 without pattern ###");
        if (conn2 != null) {
            conn2.query("SELECT * FROM A2");
        }
        pool = new ConnectionPool();
        Connection conn3 = pool.getConnection();
        System.out.println("### Connection 3 without pattern ###");
        if (conn3 != null) {
            conn3.query("SELECT * FROM A3");
        }
        ConnectionSingletonPool poolSingleton = ConnectionSingletonPool.getInstance();
        ConnectionSingleton connSingleton = poolSingleton.getConnection();
        System.out.println("### Connection 1 with pattern ###");
        if (connSingleton != null) {
            connSingleton.query("SELECT * FROM A1");
        }
        ConnectionSingleton connSingleton2 = poolSingleton.getConnection();
        System.out.println("### Connection 2 with pattern ###");
        if (connSingleton2 != null) {
            connSingleton2.query("SELECT * FROM A2");
        }
        ConnectionSingleton connSingleton3 = poolSingleton.getConnection();
        System.out.println("### Connection 3 with pattern ###");
        if (connSingleton3 != null) {
            connSingleton3.query("SELECT * FROM A3");
        }
    }
}
