# StringBuffer
- 初始化方法：在定义时在（）括号内将输入字符串对象

- 常用方法：
    + append() 追加字符串到末尾
    + insert() - public StringBuffer insert(int offset, boolean b) 在对象的索引值(offset)位置插入内容，形成新的字符串. 注意，如果索引值为0，则是插入到最前面。
    + deleteCharAt() 删除指定下标位置的字符
    + setCharAt() 修改对象指定索引值位置的字符，是替换
    + reverse() 将 StringBuffer 中的对象反转，倒过来
    + <strong>trimToSize()</strong> 将 StringBuffer 对象中的储存空间缩小到和字符串长度一样，减少空间的浪费。
    <strong>注意</strong>：StringBuffer()的初始容量可以容纳16个字符，当该对象的实体存放的字符的长度大于16时，实体容量就自动增加。
    
- 区别和联系：<br />
    String：适用于少量的字符串操作的情况 <br />
    StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况 <- 线程不安全 <br />
    StringBuffer：支持并发，适用多线程下在字符缓冲区进行大量操作的情况 <- 线程安全<br />
    三者在执行速度方面的比较：StringBuilder >  StringBuffer  >  String
