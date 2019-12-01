package lk;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ${ lknny@163.com } on 2018/4/26.
 */
public class LRUCache extends LinkedHashMap<Integer,Integer> {

	private int cacheSize;

	public LRUCache(int cacheSize) {
		//初始容量，load factor，进入排序
		super(cacheSize, 0.75f, true);
		this.cacheSize = cacheSize;
	}

	//大于，而不是大于等于
	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
		return size() > cacheSize;
	}


	public int get(int key) {
		return this.getOrDefault(key,-1);
	}
	//put方法不需要重写

}

