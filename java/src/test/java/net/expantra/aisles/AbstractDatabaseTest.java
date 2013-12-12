package net.expantra.aisles;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by josh on 11/12/2013.
 */
public abstract class AbstractDatabaseTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AbstractDatabaseTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AbstractDatabaseTest.class );
    }

    /**
     * Instantiate whatever concrete implementation we're testing
     * @return
     */
    public abstract Database createDatabase();

    public void testBasicInsert() {
        Database db = createDatabase();

        Map<String,DBValue> record = new HashMap<String, DBValue>();

    }
}
