class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int i=0,j=0,max=1;
        StringBuilder sb = new StringBuilder(s.substring(0,1));
        for(i=0;i<=n-max;i++){
            for(j=i+max;j<n;j++){
                if(help(s.substring(i,j+1))){
                    sb.setLength(0);
                    sb.append(s.substring(i,j+1));
                    max = sb.length();
                }
            }
        }
        return sb.toString();
    }
    public static boolean help(String str){
        int n = str.length();
        int i=0,j=n-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}