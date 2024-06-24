#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    char str1[20],str2[20];
    scanf("%s %s",str1,str2);
    int i=0,j=0;
    int len1=strlen(str1);
    int len2=strlen(str2);
    // printf("%s %s",str1,str2);
    while(str1[i]!='\0' && str2[j]!='\0')
    {
        if(str1[i]==str2[j])
        {
            i++;
            j++;
        }
        if(str1[i]!=str2[j])
        {
            i++;
        }

    }
    if(j==len2)
    {
        printf("found");
    }
    else
    printf("not found");
    return 0;
}