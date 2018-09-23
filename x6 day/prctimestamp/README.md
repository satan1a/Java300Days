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
## 2. Date
// TODO