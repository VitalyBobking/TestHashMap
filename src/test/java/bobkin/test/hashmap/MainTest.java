package bobkin.test.hashmap;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    private int mapKey = 10;
    private long mapValue = 20L;
    private HashMap map;

    public MainTest() {
        int mapSize = 10;
        this.map = new HashMap(mapSize);
    }

    @Test
    public void checkMapNotNull() {
        Assert.assertNotNull(map);
    }

    @Test
    public void isCheckKey() {
        map.put(mapKey, mapValue);
        Assert.assertTrue(map.containsKey(mapKey));
    }

    @Test
    public void getValueByKey() {
        map.put(mapKey, mapValue);
        long actualValue = 20L;
        Assert.assertEquals(map.get(mapKey), actualValue);
    }
}
