class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0; j<t.length(); j++)
        {
            char ch2=t.charAt(j);
            if(map.containsKey(ch2))
            {

                if(map.get(ch2)==1)
                {
                    map.remove(ch2);
                }
                else
                map.put(ch2,map.get(ch2)-1);

            }

            else
            return false;
        }
        return map.isEmpty();


    }
}

