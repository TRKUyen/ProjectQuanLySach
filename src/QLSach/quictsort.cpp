#include <iostream>
using namespace std;
void sapxep (int &x, int &y)
{
    int t=x;
    x=y;
    y=t;
}
int  vachngan(int a[],int cuoi,int dau)
{
    int chot=a[dau];
    int vt=cuoi-1;
    for(int i=0;i<dau;i++)
    {
        if(a[i]<chot)
        vt++;
        sapxep(a[vt],a[i]);
    }
    vt++;
    sapxep(a[vt],chot);
    return vt;
}
void quicksoft (int a[],int cuoi, int dau)
{
    int vach;
    if(cuoi<dau){
        vach = vachngan(a,cuoi,dau);
        quicksoft(a,cuoi,vach-1);
        quicksoft(a,vach+1,dau);

    }
}
int main ()
{
    int a[]={7,2,3,18,5,4,13,16,21,9,1,17,20,27,45,23,66,55,67,8};
    quicksoft(a,0,20);
    for(int i=0;i<20;i++)
        cout<<a[i];
}