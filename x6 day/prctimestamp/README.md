# 时间戳 TimeStamp 与 Date 日期
## 1. 时间戳
-  定义：表示当前时间到 1970 年 1 月 1 日 00:00:00 UTC 对应的（毫）秒数，是一种*绝对时间*。
- 使用类; TimeStamp
- 日期和时间模式（注意大小写）:
日期和时间模式(注意大小写，代表的含义是不同的)：
<pre>
yyyy：年<br />
MM：月<br />
dd：日<br />
hh：1~12小时制(1-12)<br />
HH：24小时制(0-23)<br />
mm：分<br />
ss：秒<br />
S：毫秒<br />
E：星期几<br />
D：一年中的第几天<br />
F：一月中的第几个星期(会把这个月总共过的天数除以7)<br />
w：一年中的第几个星期<br />
W：一月中的第几星期(会根据实际情况来算)<br />
a：上下午标识<br />
k：和HH差不多，表示一天24小时制(1-24)<br />
K：和hh差不多，表示一天12小时制(0-11)<br />
z：表示时区<br />
</pre>
- 三种时间戳转换成时间：<br />
String sd = sdf.format(Long.parseLong(String.valueOf(timeStamp)));<br />
String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));<br /> 
String sd = sdf.format(timeStamp);<br />

第二种是：先把 long 转换成 string 再转换成 long
## 2. Date
<pre>
类 java.util.Date 表示特定的瞬间，精确到毫秒。提供了很多的方法，但是很多已经过时，不推荐使用，下面仅仅列出没有过时的方法：

方法名	功能描述
Date()	                        构造方法，分配 Date 对象并用当前时间初始化此对象，以表示分配它的时间（精确到毫秒）。
Date(long date)	                构造方法，分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数
boolean after(Date when)	测试此日期是否在指定日期之后。
boolean before(Date when)	测试此日期是否在指定日期之前。
Object clone()	                返回此对象的副本。
int compareTo(Date anotherDate)	比较两个日期的顺序。
boolean equals(Object obj)	比较两个日期是否相等。
long getTime()	                返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
int hashCode()	                返回此对象的哈希码值。
void setTime(long time)	        设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
String toString()	        把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy
</pre>
