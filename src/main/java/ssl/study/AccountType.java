package test;

/**
 * 答案：C
 *  枚举类有三个实例，故调用三次构造方法，打印三次It is a account type
 */
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
    class EnumOne
    {
        public static void main(String[]args)
        {
            System.out.println(AccountType.FIXED);
        }
    }
