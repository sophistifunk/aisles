package net.expantra.aisles;

/**
 * Created with IntelliJ IDEA.
 * User: josh
 * Date: 3/12/2013
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBValue {

    public static final DBValue NULL = new DBValue() {
        public boolean nullValue() {
            return true;
        }
    };

    public static final DBValue NOT_FOUND = new DBValue() {
        public boolean notFound() {
            return true;
        }
    };

    protected DBValue() {
        super();
    }

    public boolean nullValue() {
        return false;
    }

    public boolean notFound() {
        return false;
    }
}
