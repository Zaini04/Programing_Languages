#include<iostream>
using namespace std;
int main()
{
	int c,d;
	cout<<"c:";
	cin>>c;
	cout<<"d:";
	cin>>d;
	cout<<"interchanging the contents of C and D"<<endl;
	c=c+d;
	d=c-d;
	c=c-d;
	cout<<"c="<<c<<endl;
	cout<<"d="<<d;
	return 0;
}
