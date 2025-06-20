#include <iostream>
using namespace std;
int main()
{
	int n,a,b,c;
	cout<<"n=";
	cin>>n;
	a=n/100;
	b=n%100;
	c=b%10;
	b=b/10;
	cout<<(c*100)+(b*10)+a<<endl;
if((c*100)+(b*10)+a==n)
cout<<"Number is palindrom";
else
cout<<"Number is not palindrom";
return 0;
}
