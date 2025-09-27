class Solution {
    public long kMirror(int k, int n) {
        long sum = 0L;
        int l = 1;

        while (n > 0) {
            int half = (l + 1) / 2;
            int min = (int) Math.pow(10, half - 1);
            int max  = (int) Math.pow(10, half) - 1;
            for (int num = min; num <= max && n > 0; num++) {
                long pal = ischeck(num, l);
                String b = baseK(pal, k);
                if (isPal(b)) {
                    sum += pal;
                    n--;
                }
            }
            l++;
        }
        return sum;
    }

    public long ischeck(int half, int l) {
        String s = String.valueOf(half);
        String r = new StringBuilder(s).reverse().toString();
        if(l%2==0){
            return Long.parseLong(s+r);
        }
        return Long.parseLong(s + r.substring(1));
        
    }

    public String baseK(long n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        return sb.reverse().toString();
    }

    public boolean isPal(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
