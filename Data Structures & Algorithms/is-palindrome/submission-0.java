class Solution 
{
    public boolean isalphaNumeric(char ch)
    {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')
        {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) 
    {
       int n=s.length()-1;
       if(n<0)
       {
        return false;
       }
       s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(!isalphaNumeric(s.charAt(start)))
            { 
                start++;
                continue;
            }
            if(!isalphaNumeric(s.charAt(end)))
            {
                end--;
                continue;
            }
            if(s.charAt(start) !=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }
}
