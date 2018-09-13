# 第 0 天
## toCharArray 方法
- 将一个字符串转换成一个Character型的字符数组，并且这里面的字符是原封不动的拿进去的，包含一切字符，包括空格。
## System.err.println 
- 标准“错误”输出流
- 只能在屏幕上实现打印，err是运行期异常和错误反馈的输出流的方向
- System.err.println() 能保证你在连System.out.println都因为异常而无法实现的时候实现屏幕打印功能。
- System.err.println() 不缓冲
- System.out.println() 能重定向