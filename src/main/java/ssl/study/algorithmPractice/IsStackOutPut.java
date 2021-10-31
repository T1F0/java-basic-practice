package com.supconit.study.algorithmPractice;
import java.util.Enumeration;
import java.util.Stack;

/**
 * 学习inputStack的用法
 * 实现功能：
 * 输入栈的输入数组，输出栈的可能输出的所有情况。
 *
 * java中inputStack的使用方法,堆栈是一种"后进先出"(LIFO)的数据结构,只能在一端进行插入(称为"压栈")或删除(称为"出栈")数据的操作.
 * Java中,使用java.util.inputStack类的构造方法创建对象
 * public class inputStack extends vector
 * 构造方法:public inputStack()创建一个空inputStack
 * 1.public push(item)把item压入栈顶.其作用与addElement(item)相同
 * 2.public pop移除栈顶对象,并作为函数的值返回该对象
 * 3.public peek()查看栈顶对象而不移除它
 * 4.public boolean empty()测试堆栈是否为空
 * 5.public int search(Object object)返回对象在堆栈中的位置
 */
public class IsStackOutPut {
    //创建堆栈对象
    public static Stack inputStack = new Stack();
    public static Stack outputStack = new Stack();
    public static void main(String[] args) {

        System.out.println("5个元素入栈");
        //向栈中压入字符或者字符串
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);
        printStack(inputStack);
        while (!inputStack.empty())
        inAndOut(inputStack);
//        没有就显示-1，栈顶（最右边一个）是1，依次往左递增
//        System.out.println("元素1在堆栈的位置"+inputStack.search(1));
        printStack(inputStack);
        printStack(outputStack);

    }
    //入栈出栈事务
    static Stack inAndOut(Stack stack) {
        outputStack.push(stack.pop());
        return outputStack;

    }
    private static void printStack(Stack stack)
    {
        if(stack.empty()) {
            System.out.println("堆栈是空的,没有元素");
        }
        else {
            System.out.print("堆栈中的元素:");
            //得到inputStack中的枚举对象
            Enumeration items= stack.elements();
            //显示枚举(inputStack)中的所有元素
            while(items.hasMoreElements()) {
                System.out.print(items.nextElement()+"");
            }
        }
        System.out.println();//换行
    }
}




