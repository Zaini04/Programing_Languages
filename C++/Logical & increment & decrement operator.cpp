#include<iostream>//preprocessor directive
using namespace std;//header file 
int main()//main function
{//openig braces
        int a=10,b=20;//declare values of a and b
        a++;//icrement operator
        b--;//decreasing operator
		cout<<(a>5&&b>10);//using And operator
			cout<<(a>b&&b<a);
			cout<<(a<b||b<a);//using OR operator
			cout<<(a>b||b<a);
			cout<<!(a>b&&b<a);//using NOT operator
			return 0;
		
}//closing braces
