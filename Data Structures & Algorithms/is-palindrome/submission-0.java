class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        
        int i=0, j=sArr.length-1;

        while (j>i) {
            if (sArr[j] != sArr[i]) return false;
            i++;
            j--;
        }

        return true;

    }
}
