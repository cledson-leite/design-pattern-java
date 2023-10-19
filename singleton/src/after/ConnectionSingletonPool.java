package after;

import java.util.ArrayList;
import java.util.List;

public class ConnectionSingletonPool {
    private final static ConnectionSingletonPool instance = new ConnectionSingletonPool();
    private final static int POOL_SIZE = 2;
    private List<ConnectionSingleton> connectionsPool = new ArrayList<>();
    
    public static ConnectionSingletonPool getInstance() {
        return instance;
    }

    private ConnectionSingletonPool() {
        System.out.println("Creating Connection Pool");
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new ConnectionSingleton());
        }
    }

    public ConnectionSingleton getConnection() {
        ConnectionSingleton available = null;
        for (ConnectionSingleton conn : connectionsPool) {
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

    public void leaveConnection(ConnectionSingleton conn) {
        conn.setInUse(false);
    }
    
}
