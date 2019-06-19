#include<stdio.h>
void main()
{char a[10],b[10],c[100],d[100];
 scanf("%s %s %s",&a,&b,&c);
 int i;
 for(i=0;i<strlen(a);i++)
 {if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
   a[i]='$';
 }
 for(i=0;i<strlen(b);i++)
 {if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')
   b[i]=b[i];
  else
    b[i]='#';
 }
 for(i=0;i<strlen(c);i++)
   c[i]=toupper(c[i]);
 printf("%s%s%s",a,b,c);
}