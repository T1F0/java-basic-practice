package test;

/**
 *  合法标识符：三不能
 * 1.不能以数字开头
 * 2.不能是关键字
 * 3.不能包含除了$和_以外的其他字符
 */
public class Identifier {

//    1.不能以数字开头
//    int 1name = 0;

//    2.不能是关键字
//    int while = 0;

//    3.不能包含除了$和_以外的其他字符
//    int @name = 0;
//    int !name = 0;

    //合法的标识符
    int name = 0;
    int $name = 1;
    int _name = 1;
}
