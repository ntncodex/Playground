#include <stdio.h>
int main() {
	int n,count=0;
    scanf("%d",&n);
    for(int i=1;count<n;i=i+2)
    {
      printf("%d\n",i);
      count++;
    }
	return 0;
}