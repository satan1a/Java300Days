# 多线程篇 - 创建多线程
- 多线程概念：一个程序同时运行多个程序块，比如同时运行 选择语句、循环语句，和其它语句。
- 创建多线程有 3 种方法：  
    - 继承 Thread 类 (extends Thread) 
    - 实现 Runnable 接口(implements Runnable)
    - 实现 Callable、Future 接口
- 今日练习中，使用 new Thread 新建线程性能差 且 缺乏统一管理和更多的功能，应使用 Java线程池，明日补齐 线程池
内容 https://blog.csdn.net/u011974987/article/details/51027795
 
 
 
 
 - 参考： 
    - https://blog.csdn.net/evankaka/article/details/44153709#t0
    - http://www.runoob.com/java/java-multithreading.html