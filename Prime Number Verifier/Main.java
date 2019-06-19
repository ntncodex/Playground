// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{ int n,f=0;
  scanf("%d",&n);
  if(n==0||n==1)
   {printf("neither");exit(0);}
  for(int i=1;i<=n;i++)
  {if(n%i==0)
    f++;
  }
 if(f==2)
   printf("prime");
 else 
   printf("composite");
  
  
   return 0;
}