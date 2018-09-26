# Iterator接口
## 方法说明
方法 | 方法说明
--- | ---
void add(Object object) | 将 obj 插入列表的一个与元素前，该元素在下一次调用 next() 方法时被返回
boolean hasNext() | 如果存在下一个元素，则返回 true ， 否则为 false
boolean hasPrevious() | 如果存在前一个元素，则返回 true ， 否则为 false
Object next() | 返回下一个元素(对象)，如果不存在，引发一个 NoSuchElementException 异常
int nextIndex() | 返回下一个元素的下标，如果不存在，则返回列表的大小
Object previous() | 返回前一个元素(对象)，如果不存在，引发一个 NoSuchElementException 异常
void remove() | 从列表中删除当前元素
void set(Object obj) | 将 obj 赋给当前元素，即上一次调用 next()方法或previous()方法后返回的元素

---
## 使用 迭代 的方法
```flow
s=start:开始
e=end:结束
o1=operation:(1) 通过调用类集的 iterator() 方法获得对类集的迭代方法
o2=operation:(2) 建立一个调用 hasNext() 方法的循环，只要 hasNext() 方法返回为 true， 就循环迭代
o3=operation:(3) 在循环内部，通过调用 next() 方法来得到每一个元素。当然，视具体情况而定。
s-o1-o2-o3-e
```
- 举个栗子：<br />
```
        for(Iterator<Integer> iterator = arrayList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
```