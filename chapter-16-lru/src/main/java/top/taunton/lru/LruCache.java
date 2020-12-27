package top.taunton.lru;

/**
 * <p>
 * 采用基本lru缓存淘汰算法的缓存 数据结构：采用哈希表+双向链表； 哈希表负责存储数据，双向链表负责维护数据访问顺序 新增/替换：时间复杂度O(1) 查找：时间复杂度O(1)
 *
 * </p>
 *
 * @author <a href="mailto:tangdong@supermonkey.com.cn">tangdong</a>
 * @version 1.0
 * @date Created in 2020-12-27 17:02
 * @since 1.0
 */
public class LruCache<K, V> implements Storage<K, V> {

    /**
     * 缓存容量
     */
    protected final int capacity;

    /**
     * 低速存储 如：磁盘文件/数据库 当缓存中找不到值时，通过lowSpeedStorage去持久化数据源读取值
     */
    protected final Storage<K, V> lowSpeedStorage;

    public LruCache(int capacity, Storage<K, V> lowSpeedStorage) {
        this.capacity = capacity;
        this.lowSpeedStorage = lowSpeedStorage;
    }

    @Override
    public V get(K key) {
        return null;
    }
}
