package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class JCF {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /*
     * 
     * 接口 (Interfaces)：定义了不同类型集合的核心行为，如List, Set,
     * Map。推崇“面向接口编程”是一个重要的设计原则，它使代码更灵活，允许在不同实现之间轻松切换。
     * 实现 (Implementations)：接口的具体实现类，如ArrayList, HashSet,
     * HashMap。每种实现都有其特定的数据结构和性能特点。
     * 算法 (Algorithms)：定义在Collections工具类中的静态方法，用于对集合进行排序、搜索等操作，如Collections.sort()。
     * 
     * 
     */

    // List 接口：
    // ArrayList
    /*
     * 基于动态数组实现。它的优点是随机访问速度快（通过索引获取元素，时间复杂度为O(1)），但在列表中间插入或删除元素较慢（因为需要移动后续所有元素，
     * 时间复杂度为O(n)）44。是
     * List最常用的实现。
     * 
     * 
     */
    List<Integer> I = new ArrayList<>();

    /*
     * LinkedList：基于双向链表实现。它的优点是在列表的任意位置插入或删除元素速度快（只需修改相邻节点的指针，时间复杂度为O(1)，
     * 前提是已持有该位置的引用），但随机访问速度慢（需要从头或尾开始遍历，时间复杂度为O(n)）44。
     */
    List<Integer> I2 = new LinkedList<>();

    // Set 接口：
    /*
     * 
     * Set 接口：无序的唯一集合
     * Set是一个不包含重复元素的集合。它不保证元素的顺序（某些实现除外），主要用于测试一个元素是否存在于集合中 44。
     * HashSet：基于哈希表（HashMap的实例）实现。它提供最快的添加、删除和查找性能（平均时间复杂度为O(1)），但不保证元素的任何顺序 44。
     * LinkedHashSet：HashSet的子类，同样基于哈希表，但额外使用了一个链表来维护元素的插入顺序 44。性能略低于
     * HashSet，但可以按插入顺序遍历。
     * TreeSet：基于红黑树实现。它保证元素处于排序状态（自然排序或通过Comparator指定）。性能上，添加、删除和查找的时间复杂度是O(logn)，
     * 慢于HashSet，但提供了排序功能 44。
     * 
     */
    Set<Integer> S = new HashSet<>();
    Set<Integer> S2 = new LinkedHashSet<>();
    Set<Integer> S3 = new TreeSet<>();

    /*
     * 
     * Map 接口：键值对集合
     * Map用于存储**键-值（Key-Value）**对。每个键都是唯一的，并且映射到一个值。Map接口不继承自Collection接口，是自成一派的体系
     * 44。
     * HashMap：基于哈希表实现。提供最快的键值对存取性能（平均时间复杂度为O(1)），但键的顺序是无序的 44。
     * LinkedHashMap：HashMap的子类，维护了键值对的插入顺序 44。
     * TreeMap：基于红黑树实现。它根据键的自然顺序或指定的Comparator对键值对进行排序。性能为O(logn) 44。
     */
    Map<Integer, String> M = new HashMap<>();
    Map<Integer, String> M2 = new LinkedHashMap<>();
    Map<Integer, String> M3 = new TreeMap<>();

}
