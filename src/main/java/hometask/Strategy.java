package hometask;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Strategy {
    public  static Map<Integer, Integer> strateg(Map<Integer, String> door, int count, String str){
        Map<Integer, Integer> strategy = new HashMap<>();
        int n=count;
        while (count>0) {
            int chance = new Random().nextInt(3) + 1;
            Set<Integer> key1 = door.keySet();
            for (Integer item : key1) {
                if(item == chance){
                    if(door.get(item).equals(str)){
                        strategy.put(n-count, 1);
                    }
                    else {
                        strategy.put(n-count, 0);
                    }
                }
            }
            count--;
        }
        return strategy;
    }
}
