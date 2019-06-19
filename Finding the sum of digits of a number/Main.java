#include <stdio.h>
int main() {
	int a;
    scanf("%d",&a);
    int sum=0;
    int temp=a;
    while(temp>0)
    {sum+=temp%10;
     temp/=10;
    }
    printf("%d",sum);
	return 0;
}