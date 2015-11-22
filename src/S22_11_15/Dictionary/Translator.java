package S22_11_15.Dictionary;

/**
 * Created by roma on 22.11.15.
 */
public interface Translator<K, V> {
    void putInEnglish(K k,V v);
    void putInUkraine(K k,V v);
    void removeFromEnglish(K k);
    void removeFromUkraine(K k);
    void translateFromEnglish(K k);
    void translateFromUkraine(K k);
}
