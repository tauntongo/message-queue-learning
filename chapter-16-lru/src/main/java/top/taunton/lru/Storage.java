package top.taunton.lru;

/**
 * <p>存储抽象</p>
 *
 * @author <a href="mailto:tangdong@supermonkey.com.cn">tangdong</a>
 * @version 1.0
 * @date Created in 2020-12-27 16:59
 * @since 1.0
 */
public interface Storage<K, V> {

    /**
     * 根据键获取值
     *
     * @param key 键
     * @return 值
     */
    V get(K key);
}
