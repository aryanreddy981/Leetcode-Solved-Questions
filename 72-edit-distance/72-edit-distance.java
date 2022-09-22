class Solution {
     
    public int minDistance(String word1, String word2) {
//         int m=word1.length();
//         int n=word.length();
//         int temp[][]=new int[m+1][n+1];
//         for(int i=0;i< temp[0].length;i++)
//         {
//             temp[0][i]=i;    
//         }
//         for(int j=0;j<temp.length;j++)
//         {
//             temp[j][0]=j;
//         }
//         for(int i=1;i<m;i++)
//         {
//             for(int )    
            
            
//         }
    
    
    
    
//     }
// }
        
        
        
        
        
        
        
        
        
        
        
        
        
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();
        int dp[][]=new int[str1.length+1][str2.length+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int j=0;j<dp.length;j++){
            dp[j][0]=j;
            
        }
        for(int i=1;i<=str1.length;i++){
            for(int j=1;j<=str2.length;j++){
                    if(str1[i-1] == str2[j-1])
                    {
                           dp[i][j]=dp[i-1][j-1]; 
                    }  
                
                else
                {
                  //  int x=Math.min();   
                    dp[i][j]=1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                
                }
            
        }
        }
        return dp[str1.length][str2.length];
    }

        public static int min(int a,int b,int c)
        {
            int l=Math.min(a,b);
            return Math.min(l,c);
        }
            
        }
        
        