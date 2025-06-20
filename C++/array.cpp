#include<iostream>
using namespace std;
int main()
{
	int n;
	int ar[n];
	cout<<"n=";
	cin>>n;
	for(int j=0;j<n;j++){
		cout<<"ar ["<<j<<"] = ";
	cin>>ar[j];
}
for(int k=0;k<n;k++){
	cout<<"square of  "<<ar[k]<<" = "<<ar[k]*ar[k]<<endl;
	if(ar[k]*ar[k]%2==0)
	cout<<"even no"<<endl;
	else
	cout<<"odd no"<<endl;
	int n,a,b,c;
	cout<<"Enter a num to show palindrone or not=";
	cin>>n;
	a=n/100;
	b=n%100;
	c=b%10;
	b=b/10;
	cout<<(c*100)+(b*10)+a<<endl;
if((c*100)+(b*10)+a==n)
cout<<"Number is palindrom"<<endl;
else
cout<<"Number is not palindrom"<<endl;
}
return 0;
}
