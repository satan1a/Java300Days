# Properties 类
- 是 Hashtable 类的子类，用于处理属性文件（例如Windows操作平台上的ini文件）
- 复习Hashtable：  
<pre>
 与 HashMap类似,不同的是:key和value的值均不允许为null;它支持线程的同步，即任一时刻只有一个线程能写Hashtable,因此也导致了Hashtale在写入时会比较慢。 
</pre>
- Properties类可以把Map对象和属性文件关联起来，从而可以把Map对象中的key-value对写入属性文件，也可以把属性文件中的属性名=属性值加载到Map对象中。由于属性文件里的属性名、属性值只能是字符串类型，所以Properties里的key、value都是字符串类型，该类提供了如下三个方法来修改Properties里的key、value值：  
<pre>
1. <strong>String getProperty(String key):</strong>获取Properties中指定属性名对应的属性值，类似于Map的get(Object key)方法。
2. <strong>String getProperty(String key, String defaultValue):</strong>该方法与前一个方法基本类似。该方法多一个功能，如果Properties中不存在指定key时，该方法返回默认值。
3. <strong>Object geProperty(String key、String value):</strong>设置属性值，类似Hashtable的put方法。
</pre>  
- 提供两个读、写属性文件的方法：  
<pre>
1. <strong>void load(InputStream inStream):</strong>从属性文件（以输入流表示）中加载属性名=属性值，把加载到的属性名=属性值对追加到Properties里（由于Properties是Hashtable)的子类，它不保证key-value对之间的次序）。
2. <strong>void Store(OutputStream out, String comment):</strong>将Properties中的key-valu对写入指定属性文件（以输出流表示）。第一个参数用来指向加载的配置文件，<strong>第二个参数为 String 用来给配置文件添加注释，不影响文件内容。</strong>
</pre>