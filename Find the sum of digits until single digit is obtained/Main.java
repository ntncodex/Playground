#include <stdio.h>
void main(){
  int a,sum=0;
  scanf("%d",&a);
  while(a>0)
  {sum+=a%10;
   a/=10;
  }
  int sum1=0;
  while(sum>0)
  {sum1+=sum%10;
   sum/=10;
  }
  printf("%d",sum1);
}