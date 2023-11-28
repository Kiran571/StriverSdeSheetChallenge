class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        int ct1=0,ct2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            if(ct1==0 && el2 != nums[i]){
                ct1 =1;
                el1= nums[i];
            }
            else if(ct2==0 && el1 != nums[i]){
                ct2=1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) ct1++;
            else if(el2 == nums[i]) ct2++;
            else{
                ct1--;
                ct2--;
            }

        }

        ct1=0; ct2=0;
        List<Integer> ls = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(el1 == nums[i]) ct1++;
            if(el2 == nums[i]) ct2++;
           
        }

        int mini = (int)(n/3) +1;
        if(ct1 >= mini) ls.add(el1);
        if(ct2 >= mini) ls.add(el2);
        
        return ls;

    }
}
