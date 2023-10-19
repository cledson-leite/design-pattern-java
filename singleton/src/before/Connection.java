package before;

public class Connection {
    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public Object query(String sql) {
        System.out.println("Running '" + sql + "' in connection " + this);
        return null;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean value) {
        inUse = value;
    }
}
