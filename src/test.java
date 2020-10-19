public class test {
    public static void main(String[] args) {
        int n = 9;
        int m = 0;

        for (int i=1;i<=n;i++)

            for (int j = 2*i; j<=n; j++)

                m=m+1;


        System.out.println(m);
    }
}
