package practice;
import java.util.*;

public class CollectionDemo {
	public static void main(String[] args)
	{
		//List:-Stores duplicate values
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(69);
		list.add(3);
		list.add(50);
		list.add(17);
		System.out.println(list);
		list.remove(3);
		list.remove(0);
		System.out.println(list);
		
		//Set:-Does not store duplicate value
		HashSet<Integer> set = new HashSet<>();
		set.add(3);
		set.add(62);
		set.add(17);
		set.add(3);
		set.add(20);
		set.add(20);
		System.out.println(set);
		set.remove(20);
		set.remove(17);
		System.out.println(set);
		
		//Map:-TreeMap stores values in key, value pair
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		tree_map.put(3, "Bhavik");
		tree_map.put(17, "Wadiya");
		tree_map.put(20, "Welcomes");
		tree_map.put(25, "You");
		tree_map.put(30, "to code");
		System.out.println(tree_map);
	}
}
