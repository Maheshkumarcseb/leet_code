#include<stdio.h>
int main()
{
    int i,n,a[20],sum=0,sum1=0;
    printf("enter the no of element");
    scanf("%d",&n);
    printf("enter the element of array");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }


    for(int i=0;i<n;i++)
    {
        sum=sum+a[i];
    }


    int low=0;
    int high=sum;  // it contains sum of element of array
    for(int i=0;i<n;i++)
    {
        high=high-a[i];
        if(high==low)
        {
            printf("partition index is %d ",i);
            return 0;
        }
        low=low+a[i];
    }
    if(low!=high)   // if pivot index is not found
    {
        printf("-1");
    }

   
   
    return 0;
}