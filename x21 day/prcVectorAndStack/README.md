# Vector 和 Stack
## Vector
- 和 ArrayList 很相似，但是其 __线程__ 同步。即，当一个Iterator被创建而且正在被使用，另一个线程改变了Vector的状态（例如，添加或删除了一些元素），这时调用Iterator的方法时将抛出ConcurrentModificationException，因此必须捕获该异常。
- 同步、额外的方法调用和重新分配空间的操作 会影响效率。在执行效率要求高，且不需要以上操作的情况下，建议使用一个简单的数组(Array) 来代替 Vector 和 ArrayList


## Stack
- Stack类 继承自Vector，实现一个后进先出的堆栈。
- Stack提供5个额外的方法使得Vector得以被当作堆栈使用。基本的push和pop方法；还有peek方法得到栈顶的元素；empty方法测试堆栈是否为空；search方法检测一个元素在堆栈中的位置。
- Stack刚创建后是空栈。
