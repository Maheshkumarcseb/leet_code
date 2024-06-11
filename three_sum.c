#include<stdio.h>
int main()
{
    int a[20],n,tar,i;
    printf("enter the no of element in array:\n");
    scanf("%d",&n);

    printf("enter the target value:\n");
    scanf("%d",&tar);

    printf("enter the array element:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(int i=0;i<n-2;i++)
    {
        int low=i+1;
        int high=n-1;
        while(low<high)
        {
            if(a[i]+a[low]+a[high]==tar)
            {
            printf("%d %d %d",a[i],a[low],a[high]);
            break;
            }
        
            else
            {
                if(a[i]+a[low]+a[high]>tar)
                    high--;
                else 
                    low++;
            }
        }
    }
    return 0;
}