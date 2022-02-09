package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		 
        map.put("Bhavik", 3);
        map.put("Wadiya", 17);
        map.put("Sadhana", 10);
        map.put("Rajnikant", 1);
        map.put("Demo", 69);
        
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.get("Bhavik"));
	}

}
