class Solution {
	public String reverseWords(String s) {
		char[] arr = s.toCharArray();
		int start = 0;
		for(int i = 0; i < s.length(); i++) {
            if(arr[i] ==' '){
				reverse(arr,start,i-1);
				start = i + 1;
			}
        }

    reverse(arr,start,arr.length-1);
    return new String(arr);
}

public void reverse(char[] arr, int start, int end){
    while(start < end){
        char c = arr[start];
        arr[start] = arr[end];
        arr[end] = c;
        start++;
        end--;
    }
}
}
