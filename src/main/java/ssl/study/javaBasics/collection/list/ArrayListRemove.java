package ssl.study.javaBasics.collection.list;

import java.util.*;

/**
 * list是一个ArrayList的对象，要求在if中实现在Iterator遍历的过程中正确并安全地删除一个list中保存的对象。
 */
    public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Iterator it = list.iterator();
        int index = 0;
        while (it.hasNext()) {
            if (true) {
                //正确并安全地删除一个list中保存的对象?
//                list.remove();
            }
        }
    }
}
