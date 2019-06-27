class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList();
        int counter = 1;
        while (counter <= n) {
            if (counter % 3 == 0 && counter % 5 == 0)  {
                result.add("FizzBuzz");
            }else if (counter % 3 ==0 )  {
                result.add("Fizz");
            } else if (counter % 5 ==0 ){
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(counter));
            }
            counter++;
        }
        return result;
    }
}
