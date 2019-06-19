#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int temp=a;
  int b=(temp/100)%10;
  int c=a%10;
  printf("%d",b+c);
  return 0;
}