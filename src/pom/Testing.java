package pom;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    static List<String> partion(String str)
    {   List<String> listString = new ArrayList<>();

        int n = str.length();

        int[] Cut = new int[n];
        boolean[][] Pal = new boolean[n][n];

        int i, j, k, L;

        for (i = 0; i < n; i++) {
            Pal[i][i] = true;
        }

        for (L = 2; L <= n; L++) {
            for (i = 0; i < n - L + 1; i++) {
                j = i + L - 1;
                if (L == 2)
                    Pal[i][j] = (str.charAt(i) == str.charAt(j));
                else {
                    Pal[i][j] = (str.charAt(i) == str.charAt(j)) && Pal[i + 1][j - 1];
//                        if (P[i][j])
//                        listString.add(str.substring(i, j+1));
                }
            }
        }

        for (i = 0; i < n; i++) {
            if (Pal[0][i] == true)
                Cut[i] = 0;
            else {
                Cut[i] = Integer.MAX_VALUE;
                for (j = 0; j < i; j++) {
                    if (Pal[j + 1][i] == true && 1 + Cut[j] < Cut[i]) {
                        if (i == n-1) {
                            if (Cut[j] == 1) {
                                for (int  t=1;t<j+1; t++) {

                                    if (Cut[t] == 0 && Cut[t+1] == 0) {
                                        continue;
                                    }
                                    if (Cut[t] == 0) {
                                        listString.add(str.substring(0, t + 1));
                                        listString.add(str.substring(t + 1, j + 1));
                                        listString.add(str.substring(j + 1, n));
                                    }
                                }
                            }
                        }
                        Cut[i] = 1 + Cut[j];
                    }
                }
            }
        }

        if (listString.size() > 0)
            return listString;
        else  {
            listString.add("Impossible");
            return listString;
        }

    }



    public static void main (String[] args) {
        System.out.println(partion("kayakracecartenet"));
        List<String>  s = partion("yyyyyyyyyyyyyyyyyyyyyyyyybdrvszyzidvufewrggqcgtdtjljgtkkptokrgnmsktoiyywxwaecvqxiovthrscjpecvlizhnyfnjteftjltpzlepsjgsnopocyfycoponsgjspelzptljtfetjnfynhzilvcepjcsrhtvoixqvceawxwyyiotksmngrkotpkktgjljtdtgcqggrwefuvdizyzsvrdbh");

        System.out.println(s.get(0));
    }
}
