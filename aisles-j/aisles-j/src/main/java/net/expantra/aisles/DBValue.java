package net.expantra.aisles;

/**
 * Represents the available values for a specific field in a given record.
 *
 * Notes:
 *
 * 1. Individual records within a set may not contain the same fields. A present field with a null value is not the same as a not-present field
 * 2. Need to think more about the type of null and not-present fields. Maybe void, maybe optional, don't know
 */
public abstract class DBValue {

    protected final DBType type;

    protected DBValue() {
        this(DBTypes.voidType);
    }

    public abstract boolean isNull();
    public abstract boolean isNotPresent();
    public abstract boolean hasUsefulValue();

    public DBType getType() {
        return this.type;
    }

    protected DBValue(DBType valueType) {
        super();
        type = valueType;
    }
}
