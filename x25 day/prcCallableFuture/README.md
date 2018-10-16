# Callable 和 Future 创建多线程
## Callable 
- 使用 call() 方法作为线程执行体，并且有返回值
- 使用 FutureTask 类来<strong>包装</strong> Callable 对象(创建子线程)，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值
- 使用 FutureTask 对象作为 Thread线程 对象的 target，创建并启动新线程
- 调用 FutureTask 对象的 get() 方法获取子线程执行结束后的返回值