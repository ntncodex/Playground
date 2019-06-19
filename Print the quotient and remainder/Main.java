#include<stdio.h>
int main()
{
  int a=365,b=4;
  int c=a-(b*(a/b));
  printf("Quotient: %d\nRemainder: %d",a/b,c);
  return 0;
}