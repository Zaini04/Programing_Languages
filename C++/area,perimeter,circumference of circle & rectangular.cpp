#include <iostream>
using namespace std;
int main()
{
	int l,b,r;
	float area1,area2,p,c;
	cout<<"length of rectangular=";
	cin>>l;
	cout<<"bredth of rectangular=";
	cin>>b;
	cout<<"radius of circle=";
	cin>>r;
	area1=l*b;
	cout<<"Area of rectangular="<<area1;
	p=2*(l+b);
	cout<<"\nPerimeter of rectangular="<<p;
	area2=(3.14)*(r*r);
	cout<<"\nArea of circle="<<area2;
	c=2*(3.14)*r;
	cout<<"\nCircumference of circle="<<c;
	return 0;
}
