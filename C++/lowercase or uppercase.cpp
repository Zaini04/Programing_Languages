#include <iostream>//preprocessor directive
#include <ctype.h>//preprocessor directive
using namespace std;//header file
int main()//main function 
{//opening braces
    char letter;//this declares value
    cout << "Enter a letter: ";//this prints value
    cin >> letter;//value given by the user at the end
    int result = islower(letter);//this declare value
    cout << "Result: " << result << endl;//this print the value
    return 0;
}//closing braces
