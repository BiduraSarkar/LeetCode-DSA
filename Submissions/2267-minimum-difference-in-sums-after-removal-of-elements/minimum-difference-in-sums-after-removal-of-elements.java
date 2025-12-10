class Solution {
    public long minimumDifference(int[] nums) {
        int N = nums.length;
        int n = N/3;
        long part1[] = new long[n+1];
        long sum = 0L;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //max heap to accomodate smallest element in first part
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            pq.add(nums[i]);
        }
        part1[0] = sum;
        for(int i=n;i<2*n;i++)
        {
            sum += nums[i];
            pq.add(nums[i]);
            sum -= pq.poll(); //max element is thrown out
            //smallest elements from 0 to i are left back
            part1[i-(n-1)] = sum;
        }
        long part2 = 0L;
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for(int i = 3*n-1; i>=2*n;i--)
        {
            part2 += nums[i];
            pq2.add(nums[i]);
        }
        long ans = part1[n] - part2;

        for(int i=2*n-1;i>=n;i--)
        {
            part2 += nums[i];
            pq2.add(nums[i]);
            part2 -= pq2.poll();//throws out the min element so we have max elements from 3n-1 to i
            ans = Math.min(ans,part1[i-n]-part2);
        }

        return ans;

    }
}