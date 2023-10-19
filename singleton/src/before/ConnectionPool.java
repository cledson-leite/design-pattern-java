package before;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool = new ArrayList<>();
    

    public ConnectionPool() {
        System.out.println("Creating Connection Pool");
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection available = null;
        for (Connection conn : connectionsPool) {
            if (!conn.isInUse()) {
                available = conn;
                break;
            }
        }
        if (available == null) {
            System.out.println("No connection available");
        }
        available.setInUse(true);
        return available;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
    
}
