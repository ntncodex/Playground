#include <stdio.h>
int main() {
	int a;
    scanf("%d",&a);
    int c=a%10;
    int k;
    while(a>0)
    {if(a/10==0)
       k=a;
     a/=10;
    }
  printf("%d",c+k);
	return 0;
}