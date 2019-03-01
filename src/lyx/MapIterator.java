package lyx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		//map遍历的四种方法
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "12345");
        
		//1  通过键找值遍历，这种方式的效率比较低，因为本身从键取值是耗时的操作；
		for ( String a : map.keySet() ) {
			System.out.println("第一种:key:"+a+",val:"+map.get(a));
		}
		//2
		for ( Map.Entry<String, String> enrty :  map.entrySet() ) {
			System.out.println("第2种:key:"+enrty.getKey()+",val:"+enrty.getValue());
		}
		//3 在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用，在性能上比使用entrySet较好；
		for ( String a : map.keySet() ) {
			System.out.println("第3种:key:"+a);
		}
		for ( String val : map.values() ) {
			System.out.println("第3种:val:"+val);
		}
		//4 ：推荐，尤其是容量大时
		Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
		while( iterator.hasNext() ){
			Map.Entry<String,String> enrty = iterator.next();
			System.out.println("第4种:key:"+enrty.getKey()+",val:"+enrty.getValue());
		}
	}

}
