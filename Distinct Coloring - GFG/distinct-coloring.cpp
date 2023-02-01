//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Solution{
private:
    long long dp[50002][3];
    long long solve(int i,int n,int r[],int g[],int b[],int col){
        if(i == n) return 0;
        if(dp[i][col] != -1) return dp[i][col];
        
        long long int ans;
        
        if(col == 0){
            long long int cg = g[i] + solve(i+1,n,r,g,b,1);
            long long int cb = b[i] + solve(i+1,n,r,g,b,2);
            ans = min(cg,cb);
        }else if(col == 2){
            long long int cg = g[i] + solve(i+1,n,r,g,b,1);
            long long int cr = r[i] + solve(i+1,n,r,g,b,0);
            ans = min(cr,cg);
        }else{
            long long int cb = b[i] + solve(i+1,n,r,g,b,2);
            long long int cr = r[i] + solve(i+1,n,r,g,b,0);
            ans = min(cr,cb);
        }
        
        return dp[i][col] = ans;
    }
public:
    long long int distinctColoring(int N, int r[], int g[], int b[]){
        memset(dp,-1,sizeof dp);
        long long int op1 = r[0] + solve(1,N,r,g,b,0);
        long long int op2 = g[0] + solve(1,N,r,g,b,1);
        long long int op3 = b[0] + solve(1,N,r,g,b,2);
        return min({op1,op2,op3});
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        int r[N],g[N],b[N];
        for(int i = 0; i < N; i++)
            cin >> r[i];
        for(int i = 0; i < N; i++)
            cin >> g[i];
        for(int i = 0; i < N; i++)
            cin >> b[i];
        
        Solution ob;
        cout << ob.distinctColoring(N, r, g, b) << endl;
    }
    return 0; 
}
// } Driver Code Ends