package net.expantra.aisles;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: josh
 * Date: 28/11/2013
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Database {
    RecordIdentifier insertRecord(String recordSet, List<Map<String, DBValue>>contents);

}
