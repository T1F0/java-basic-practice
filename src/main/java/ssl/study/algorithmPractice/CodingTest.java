package ssl.study.algorithmPractice;public class CodingTest {
    public static void main(String[] args) {
        String[] array = {"a","b","c","d"};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    for (int k = 0; k < array.length; k++) {
                        if (k != i & k != j) {
                            for (int l = 0; l < array.length; l++) {
                                if (l != i & l != j & l != k) {
                                    System.out.println(array[i] + array[j] + array[k] + array[l]);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
