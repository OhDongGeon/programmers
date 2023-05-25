import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] word = new String[N];
        
        for (int i = 0; i < N; i++) {
            word[i] = sc.next();
        }
        
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        System.out.println(word[0]);
        for (int i = 1; i < N; i++) {
            if (!word[i].equals(word[i - 1])) {
                System.out.println(word[i]);
            }
        }
    }
}