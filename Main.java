class Main {
  public static void main(String[] args) {
    System.out.println(almostPalindrome("Hello world!"));
    System.out.println(almostPalindrome("raceacar"));
  }

  public static boolean almostPalindrome(String s) {
        for (int left = 0, right = s.length() - 1; left < right; ++left, --right) {
            if (s.charAt(left) == s.charAt(right)) {
               continue;
            } else {
                return helper(s, left + 1, right) || helper(s, left, right - 1);
            }
        }
        
        return true;
    }
    
    public static boolean helper(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        
        return true;
    }
}