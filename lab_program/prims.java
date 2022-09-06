import java.util.Scanner;
public class prims {
    public static void main(String[] args) {
        int f[] = new int[10];
        int min, ne, mincost;
        int c[][] = new int[10][10];
        int a, b, i, j;
        ne = 1;
        mincost = 0;
        a = 0;
        b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter n\n");
        int n = in.nextInt();
        System.out.println("enter cost adj. matrix\n");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++) {
                c[i][j] = in.nextInt();
                if (c[i][j] == 0)
                    c[i][j] = 999;
            }
        for (i = 1; i <= n; i++)
            f[i] = 0;
        f[1] = 1;
        while (ne < n) {
            min = 999;
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)
                    if (c[i][j] < min && f[i] == 1)

                    {
                        min = c[i][j];
                        a = i;
                        b = j;
                    }
            if (f[b] == 0) {
                ne++;
                System.out.println("\nedge ->\t" + a + "--" + b +
                        "\t Min cost " + min);
                mincost += min;
                f[b] = 1;
            }
            c[a][b] = c[b][a] = 999;
        }
        System.out.println("\nMINCOST= " + mincost);
    }
}
