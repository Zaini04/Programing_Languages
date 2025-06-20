#include<iostream>
using namespace std;
int main()
{
	float d,m,f,i,c;
	cout<<"distance between Multan and lahore in kilometers:";
	cin>>d;
	m=d*1000.0;
	cout<<"distance between Multan and lahore in meters:"<<m<<endl;
	f=m*3.28;
	cout<<"distance between Multan and lahore in feets:"<<f<<endl;
	i=f*12.0;
	cout<<"distance between Multan and lahore in inches:"<<i<<endl;
	c=i*2.54;
	cout<<"distance between Multan and lahore in centimeters:"<<c<<endl;
	return 0;
}
