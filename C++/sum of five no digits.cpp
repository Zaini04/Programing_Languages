#include<iostream>
using namespace std;
int main()
{
	int n,f_dig,l_dig,sum;
	cout<<"n=";
	cin>>n;
	f_dig=n/1000;
	l_dig=n%10;
	cout<<"First digit="<<f_dig<<endl;
	cout<<"Last digit="<<l_dig<<endl;
	sum=f_dig+l_dig;
	cout<<"Sum of first & last digit="<<sum;
	return 0;
	
}
