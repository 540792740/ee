package Test3;

import java.util.Map;

public class TestHashMap {
    public static void main(String[] args){
        Map<String,Double> map = new java.util.HashMap<>();
        map.put("AAPL", 140.5);
        map.put("IBM", 128.13);
        map.put("MASFT", 67.89);
        double x = map.get("AAPL") +1;
        map.put("AAPL", x);
        for (Map.Entry<String, Double> e : map.entrySet()){
            System.out.println(e.getKey() + "," + e.getValue());
        }
    }
}
