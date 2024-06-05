#include<stdio.h>
int main()
{
    int arr[20],n,key,loc=-1;
    printf("enter the no of element:\n");
    scanf("%d",&n);
    printf("enter the element of the array:\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("enter the key element:\n");
    scanf("%d",&key);
    int low=0;
    int high=n-1;
    while(low<=high)
    {
    int mid=(low+high)/2;
    if(key==arr[mid])
    {
        loc=mid;
        break;
    }
    else
    {
    if(key>arr[mid])
        low=mid+1;
    else
        high=mid-1;

    }
    }
    if(loc>=0)
    {
        printf("element %d found at %d index",key,loc);
    }
    else
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]>key)
            {
                printf(" index of element to be found is :%d",i);
                break;
            }
        }


    }
   
   
    return 0;
}