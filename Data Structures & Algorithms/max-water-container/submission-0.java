class Solution 
{
    public int maxArea(int[] heights) 
    {
        int start=0;
        int end=heights.length-1;
        int max=0;
        while(start<end)
        {
            
            int width=end-start;
            int height=Math.min(heights[start],heights[end]);
            int result=width*height;
            max=Math.max(max,result);

            if (heights[start] < heights[end]) 
            {
                start++;
            } 
            else 
            {
                end--;
            }
        }
        return max;
    }
}
