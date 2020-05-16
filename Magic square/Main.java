#include <iostream>
 

using namespace std;

bool isMagicSquare(int mat[5][5],int n)
{  

    int sum = 0,sum2=0;  
    for (int i = 0; i < n; i++)
        sum = sum + mat[i][i];
 
    for (int i = 0; i < n; i++)
        sum2 = sum2 + mat[i][n-1-i];
 
    if(sum!=sum2)  
        return false;
 
 
    for (int i = 0; i < n; i++) {
         
        int rowSum = 0;      
        for (int j = 0; j < n; j++)
            rowSum += mat[i][j];

        if (rowSum != sum)
            return false;
    }
 
    for (int i = 0; i < n; i++) {
         
        int colSum = 0;      
        for (int j = 0; j < n; j++)
            colSum += mat[j][i];

        if (sum != colSum)  
        return false;
    }
 
    return true;
}
int main()
{
    int mat[5][5];
  int n;
  cin>>n;
   for(int i=0;i<n;i++)
     for(int j=0;j<n;j++)
       cin>>mat[i][j];
     
    if (isMagicSquare(mat,n))
        cout << "Yes";
    else
        cout << "No";
     
    return 0;
}