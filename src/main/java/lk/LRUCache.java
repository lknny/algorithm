package lk;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ${ lknny@163.com } on 2018/4/26.
 */
public class LRUCache<K,V>  extends LinkedHashMap<K,V> {

	private int cacheSize;

	public LRUCache(int cacheSize) {
		//初始容量，load factor，进入排序
		super(100, 0.75f, true);
		this.cacheSize = cacheSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() >= cacheSize;
	}

}

