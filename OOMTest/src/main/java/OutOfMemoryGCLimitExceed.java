import scala.util.Random;

import java.util.HashMap;
import java.util.Map;

public class OutOfMemoryGCLimitExceed {
    public static void main(String[]args){
        addRandomDataToMap();
    }
    public static void addRandomDataToMap() {
        Map<Integer, String> dataMap = new HashMap<>();
        Random r = new Random();
        while (true) {
            dataMap.put(r.nextInt(), String.valueOf(r.nextInt()));
        }
    }
}