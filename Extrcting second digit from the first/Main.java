#include <stdio.h>
int main() {
	int a;
    scanf("%d",&a);
    while(a>0)
    {if(a/100==0)
     {printf("%d",a%10); break;}
     a/=10;
     
    }
	return 0;
}