import java.io.*;
import java.util.*;

public class Main {
    static class F {
        private final InputStream in = System.in;
        private final byte[] b = new byte[1 << 16];
        private int p = 0, l = 0;

        private int r() throws IOException {
            if (p >= l) {
                l = in.read(b);
                p = 0;
                if (l <= 0) return -1;
            }
            return b[p++];
        }

        long nl() throws IOException {
            int c;
            do {
                c = r();
            } while (c <= ' ' && c != -1);

            long s = 1;
            if (c == '-') {
                s = -1;
                c = r();
            }

            long x = 0;
            while (c > ' ') {
                x = x * 10 + (c - '0');
                c = r();
            }
            return x * s;
        }

        int ni() throws IOException {
            return (int) nl();
        }
    }

    public static void main(String[] args) throws Exception {
        F f = new F();
        StringBuilder sb = new StringBuilder();
        int t = f.ni();

        while (t-- > 0) {
            long p = f.nl();
            long q = f.nl();

            long e = p + 2L * q;
            long s = 2L * e + 1;
            boolean ok = false;

            for (long i = 1; i <= s / i; i++) {
                if (s % i != 0) continue;

                long x = i;
                long y = s / i;

                if ((x & 1) == 0 || (y & 1) == 0) continue;

                long n = (x - 1) / 2;
                long m = (y - 1) / 2;

                if (n > 0 && m > 0 && Math.abs(n - m) <= p) {
                    sb.append(n).append(' ').append(m).append('\n');
                    ok = true;
                    break;
                }
            }

            if (!ok) sb.append("-1\n");
        }

        System.out.print(sb.toString());
    }
}