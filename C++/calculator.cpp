#include <iostream>
using namespace std;
int main() {
  double num1, num2;
  char calculater;

  cout << "Enter the first number: ";
  cin >> num1;
  cout << "Enter the second number: ";
  cin >> num2;
  cout << "Enter the operation (+, -, *, /): ";
  cin >> calculater;

  switch (calculater) {
    case '+':
      cout << num1 + num2 << endl;
      break;
    case '-':
      cout << num1 - num2 << endl;
      break;
    case '*':
      cout << num1 * num2 << endl;
      break;
    case '/':
      if (num2 == 0) {
        cout << "Error: division by zero" << endl;
      } else {
        cout << num1 / num2 <<endl;
      }
      break;
    default:
    cout << "Error: invalid operation" << endl;
  }
  return 0;
}
