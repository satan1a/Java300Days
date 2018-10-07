# HashSet 和 HashMap
## HashSet
- 实现了 Set 接口，不允许集合中出现重复的元素
- 额外：使用散列表进行储存， 散列表通过 散列法 的机制来存储信息。在散列中，一个关键字的信息内容被用来确定唯一的一个值，称之为散列码。散列码被用来当作与关键字相连的数据的存储下标。
- 特别注意，散列集合不能确定元素的排列顺序。与之相对，TreeMap 保存了对象的排列顺序。
- 当我们提到HashSet时，第一件事就是在将对象存储在
  HashSet之前，要确保<strong><a href="http://www.importnew.com/25783.html">重写 hashCode（）方法 和 equals（）方法</strong></a>，这样才能比较对象的值是否相等，确保集合中没有
  储存相同的对象。如果不重写上述两个方法，那么将使用下面方法默认实现：<br />
  public boolean add(Object obj)方法用在Set添加元素时，如果元素值重复时返回 "false"，如果添加成功则返回"true"
- HashSet 相对 HashMap 较慢；HashSet 相对 ArrayList 添加和删除元素较快

## HashMap
- <pre>
  HashMap：

  　　HashMap实现了Map接口，Map接口对键值对进行映射。Map中不允许出现重复的键（Key）。Map接口有两个基本的实现
  
  TreeMap和HashMap。TreeMap保存了对象的排列次序，而HashMap不能。HashMap可以有空的键值对（Key（null）-Value（null））
  
  HashMap是非线程安全的（非Synchronize），要想实现线程安全，那么需要调用collections类的静态方法synchronizeMap（）实现。
  
  public Object put(Object Key,Object value)方法用来将元素添加到map中。  
  
  </pre>
  
## 遍历
详见代码内的注释