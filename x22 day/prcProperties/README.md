# Propertise类、属性文件
- Properties 类是 Hashtable 类的一个子类
- 用来配置应用程序的一些信息（较少）
- 由键值对构成，且键值对都是字符串
- 读和写：https://blog.csdn.net/zzq58157383/article/details/6763659
- 方法：  
1. String getProperty(String key)  
 用指定的键在此属性列表中搜索属性。
2. String getProperty(String key, String defaultProperty)  
用指定的键在属性列表中搜索属性。
3. void list(PrintStream streamOut)  
 将属性列表输出到指定的输出流。
4. void list(PrintWriter streamOut)  
将属性列表输出到指定的输出流。
5. void load(InputStream streamIn) throws IOException  
 从输入流中读取属性列表（键和元素对）。
6. Enumeration propertyNames( )  
按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
7. Object setProperty(String key, String value)  
 调用 Hashtable 的方法 put。
8. void store(OutputStream streamOut, String description)  
 以适合使用  load(InputStream)方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。