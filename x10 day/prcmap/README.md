# Map 接口 (1)
- Map 集合类用于储存键值对，每一个键 映射 一个值
- 类型<br />
    + 通用 Map：<br />
    HashMap、Hashtable、Properties、LinkedHashMap、IdentityHashMap、TreeMap、WeakHashMap、ConcurrentHashMap
     + 专用Map<br />
     不亲自创建
     + 一个帮助我们实现自己的 Map类 的抽象类
<\n>
- 类型区别：<br />
<pre>
     <strong>HashMap</strong>
     最常用的Map,它根据键的HashCode 值存储数据,根据键可以直接获取它的值，具有很快的访问速度。HashMap最多只允许一条记录的键为Null(多条会覆盖);允许多条记录的值为 Null。非同步的。
     
     <strong>TreeMap</strong>
     能够把它保存的记录根据键(key)排序,默认是按升序排序，也可以指定排序的比较器，当用Iterator 遍历TreeMap时，得到的记录是排过序的。TreeMap不允许key的值为null。非同步的。 
     
     <strong>Hashtable</strong>
     与 HashMap类似,不同的是:key和value的值均不允许为null;它支持线程的同步，即任一时刻只有一个线程能写Hashtable,因此也导致了Hashtale在写入时会比较慢。 
    
     <strong>LinkedHashMap</strong>
     保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.在遍历的时候会比HashMap慢。key和value均允许为空，非同步的。  </pre>
 - http://www.cnblogs.com/skywang12345/p/3310835.html
 - 遍历：<br />
    https://www.cnblogs.com/fqfanqi/p/6187085.html