import java.util.HashMap;

class Solution {
    public static int longestkSubstr(String s, int k) {

        HashMap<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int right = 0;
        int maxLen = -1;

        while(right < s.length()) {



            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right),0) +1);

            if(freq.size() > k) {

                while(freq.size() > k) {

                    freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
                    if(freq.get(s.charAt(left)) == 0) {
                        freq.remove(s.charAt(left));
                    }
                    left++;
                }
                maxLen = Math.max(maxLen,right-left+1);
            }

            if (freq.size() == k) {
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestkSubstr("aaaa",2));
    }
}