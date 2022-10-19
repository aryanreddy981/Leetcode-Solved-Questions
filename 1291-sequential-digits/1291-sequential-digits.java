//jis for loop mein n length nahi hoti vo order of 1 hoti h
//this question time complexity is order of 1 and space complexity is order(n)
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result=new ArrayList<>();
        String digits="123456789";
     
        for(int length=1;length<=9;length++){
            for(int i=0;i+length <= digits.length();i++){
                String substring1=digits.substring(i,i + length);
                int value = Integer.parseInt(substring1);
                if(value>=low && value<=high){
                    result.add(value);
                }
            }
        }
            return result;
        
        }
        
    }
