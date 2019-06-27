class Solution {
    public int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        int lastOne = -1;
        int maxGap = 0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                if(lastOne == -1){
                    lastOne = i;
                } else {
                    int gap = i-lastOne;
                    lastOne = i;
                    if(gap > maxGap){
                        maxGap = gap;
                    }
                }
            }
        }

        return maxGap;
    }
}
