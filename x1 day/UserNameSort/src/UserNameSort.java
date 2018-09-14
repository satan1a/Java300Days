import java.util.TreeSet;

public class UserNameSort {
    public static void main(String[] args) {

        System.out.println("排序后的用户名顺序为");
        TreeSet treeSet = new TreeSet();

        // 插入 UserName 对象时，会自动调用 compareTO() 方法
        treeSet.add(new UserName("David"));
        treeSet.add(new UserName("Bob"));
        treeSet.add(new UserName("Satania"));
        treeSet.add(new UserName("Alan"));

        System.out.println(treeSet);
    }

}

class UserName implements Comparable {
     public String sName;
     public UserName(String sName) {
         this.sName = sName;

     }

    @Override
    public int compareTo(Object o) {
        UserName tempUsername = (UserName)o;
        String temp = tempUsername.sName;   // 按字符串 sName 的顺序排列 UserName
        return this.sName.compareTo(temp);

    }

    public String toString() {
         return this.sName;

    }
}

