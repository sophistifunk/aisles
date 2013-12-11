package net.expantra.aisles;

/**
 * Created by josh on 11/12/2013.
 */
public final class DBTypes {

    public static final DBType voidType = new DBType() {
        @Override
        public boolean isSubTypeOf(DBType superType) {
            return true;
        }

        @Override
        public boolean isSuperOf(DBType subType) {
            return false;
        }

        @Override
        public boolean isSatisfiedBy(DBValue value) {
            return false;
        }
    };

    public static final DBType anyType = new DBType() {
        @Override
        public boolean isSubTypeOf(DBType superType) {
            return superType == this;
        }

        @Override
        public boolean isSuperOf(DBType subType) {
            return true;
        }

        @Override
        public boolean isSatisfiedBy(DBValue value) {
            return !(value.isNotPresent());
        }
    };
}