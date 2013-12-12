package net.expantra.aisles;

/**
 * Created by josh on 11/12/2013.
 */
public interface DBType {
    public boolean isSubTypeOf(DBType superType);
    public boolean isSuperOf(DBType subType);
    public boolean isSatisfiedBy(DBValue value);
}
