#include <iostream>
using namespace std;
int main()
{
	float temp;;
	cout<<"temperature in fahrenheit:";
	cin>>temp;
	temp=(temp-32)*5/9;
	cout<<"temperature in centigrade:"<<temp;
	return 0;
}
