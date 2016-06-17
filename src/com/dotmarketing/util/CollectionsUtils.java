package com.dotmarketing.util;

import com.dotcms.repackage.edu.emory.mathcs.backport.java.util.Arrays;

import java.io.Serializable;
import java.util.*;

/**
 * Just encapsulates collection utils methods
 * @author jsanca
 */
public class CollectionsUtils implements Serializable {

    /**
     * Get a new empty list
     * @param <T>
     * @return List
     */
    public static <T> List<T> getNewList() { // this method is keep for compatibility

        return list();
    } // getNewList

    /**
     * Get a new empty list
     *
     * Example:
     * final List<String> list1 = list();
     *
     * @param <T>
     * @return List
     */
    public static <T> List<T> list() {

        return new ArrayList<T>();
    } // list


    /**
     * Get a new list with the elements
     *
     * Example:
     * final List<Integer> list2 = list(1, 2, 3, 4, 5);
     *
     *
     * @param elements T
     * @param <T>
     * @return List
     */
    public static <T> List<T> list(final T... elements) {

        return list(Arrays.asList(elements));
    } // list

    /**
     * Get a new list based on a collection
     * @param tCollection {@link Collection}
     * @param <T>
     * @return List
     */
    public static <T> List<T> list(final Collection<T> tCollection) {

        return new ArrayList<T>(tCollection);
    } // list

    /**
     * Get a new set
     * @param <T>
     * @return Set
     */
    public static <T> Set<T> set () {

        return new HashSet<T>();
    } // set

    /**
     * Get a new set with the elements
     * @param elements T
     * @param <T>
     * @return Set
     */
    public static <T> Set<T> set (final T... elements) {

        return set(Arrays.asList(elements));
    } // set

    /**
     * Get a new set
     * @param tCollection {@link Collection}
     * @param <T>
     * @return Set
     */
    public static <T> Set<T> set (final Collection<T> tCollection) {

        return new HashSet<T>(tCollection);
    } // set

    /**
     * Get a new map
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map() {

        return new HashMap<K, V>();
    } // map.

    /**
     * Get a new map based on a key and value
     * @param key K
     * @param value V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key, final V value) {

        return mapEntries(entry(key, value));
    } // map.

    /**
     * Get a new map based on a pair of key/value.
     * @param key1 K
     * @param value1 V
     * @param key2 K
     * @param value2 V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key1, final V value1, final K key2, final V value2) {

        return mapEntries(entry(key1, value1), entry(key2, value2));
    } // map.

    /**
     * Get a new map based on a list of key/value.
     * @param key1 K
     * @param value1 V
     * @param key2 K
     * @param value2 V
     * @param key3 K
     * @param value3 V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key1, final V value1, final K key2, final V value2
            , final K key3, final V value3) {

        return mapEntries(entry(key1, value1), entry(key2, value2),
                entry(key3, value3));
    } // map.

    /**
     * Get a new map based on a list of key/value.
     * @param key1 K
     * @param value1 V
     * @param key2 K
     * @param value2 V
     * @param key3 K
     * @param value3 V
     * @param key4 K
     * @param value4 V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key1, final V value1, final K key2, final V value2
            , final K key3, final V value3, final K key4, final V value4) {

        return mapEntries(entry(key1, value1), entry(key2, value2),
                entry(key3, value3), entry(key4, value4));
    } // map.

    /**
     * Get a new map based on a list of key/value.
     * @param key1 K
     * @param value1 V
     * @param key2 K
     * @param value2 V
     * @param key3 K
     * @param value3 V
     * @param key4 K
     * @param value4 V
     * @param key5 K
     * @param value5 V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key1, final V value1, final K key2, final V value2
            , final K key3, final V value3, final K key4, final V value4, final K key5, final V value5) {

        return mapEntries(entry(key1, value1), entry(key2, value2),
                entry(key3, value3), entry(key4, value4), entry(key5, value5));
    } // map.

    /**
     * Get a new map based on a list of key/value.
     * @param key1 K
     * @param value1 V
     * @param key2 K
     * @param value2 V
     * @param key3 K
     * @param value3 V
     * @param key4 K
     * @param value4 V
     * @param key5 K
     * @param value5 V
     * @param key6 K
     * @param value6 V
     * @param key7 K
     * @param value7 V
     * @param key8 K
     * @param value8 V
     * @param key9 K
     * @param value9 V
     * @param key10 K
     * @param value10 V
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> map(final K key1, final V value1, final K key2, final V value2
            , final K key3, final V value3, final K key4, final V value4, final K key5, final V value5
            , final K key6, final V value6, final K key7, final V value7, final K key8, final V value8
            , final K key9, final V value9, final K key10, final V value10) {

        return mapEntries(entry(key1, value1), entry(key2, value2),
                entry(key3, value3), entry(key4, value4), entry(key5, value5),
                entry(key6, value6), entry(key7, value7), entry(key8, value8),
                entry(key9, value9), entry(key10, value10));
    } // map.



    /**
     * Get a new map based on a collections of entries
     * @param entries Entry
     * @param <K>
     * @param <V>
     * @return Map
     */
    public static <K,V> Map<K,V> mapEntries(final Map.Entry<K, V>... entries) {

        final HashMap hashMap = new HashMap<K, V>();

        for (Map.Entry<K, V> entry : entries) {

            hashMap.put(entry.getKey(), entry.getValue());
        }

        return hashMap;
    } // map.

    /**
     * Get an entry base on a key and value
     * @param key K
     * @param value V
     * @param <K>
     * @param <V>
     * @return Map.Entry
     */
    public static <K,V> Map.Entry<K, V> entry(final K key, final V value) {

        return new AbstractMap.SimpleEntry<K, V>(key, value);
    } // entry



} // E:O:F:CollectionsUtils.
