class Solution {
    public int strStr(String haystack, String needle) {
        //if empty string
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        // two pointer
        for (int x = 0; x < haystack.length(); x++){
            if (x + needle.length() > haystack.length())break;
            for (int y = 0;  y< needle.length(); y++){
                if (haystack.charAt(x+y) != needle.charAt(y)) break;
                if (y == needle.length() -1)return x;
            }
        }
        return -1; 
    }
}
