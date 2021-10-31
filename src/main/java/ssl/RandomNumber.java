package ssl;

public class RandomNumber {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 31;i++) {
            if (Math.random() > 0.5) {
                stringBuffer.append("0");
            } else {
                stringBuffer.append("1");
            }
        }
        int result = Integer.parseInt(stringBuffer.toString(),2);
        System.out.println(result);
    }
}
