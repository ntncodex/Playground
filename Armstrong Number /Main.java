#include <stdio.h>
#include <math.h>
int main() {
	int n,f=0,sum=0;
    scanf("%d",&n);
    int temp=n;
    while(n>0)
    {sum+=pow(n%10,3);
     n/=10;
    }
    if(temp==sum)
      printf("Armstrong Number");
    else
      printf("Not an Armstrong Number");
	return 0;
}