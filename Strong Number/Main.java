#include <stdio.h>
int main() {
	int n,fact=1,temp,sum=0,c;
    scanf("%d",&n);
    temp=n;
    while(n>0)
    {c=n%10;
     for(int i=2;i<=c;i++)
     {fact*=i;
     }
     sum+=fact;n/=10;fact=1;
    }
    if(sum==temp)
      printf("Yes");
    else
      printf("No");
	return 0;
}