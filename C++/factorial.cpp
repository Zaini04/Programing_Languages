#include <iostream>
using namespace std;
int main()
{
	int n,i;
	cout<<"Enter a num:";
	cin>>n;
	for(i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			break;
		}
	}
	if(n==i)
	{
		cout<<"Num is prime";
	}
	else
	cout<<"Num is not prime";
	return 0;
}
