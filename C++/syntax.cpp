
Note:
conditional statement same syntax as java
loops same syntax as java 
data type same syntax as java except string is small case in c++

Getting input from user:

code:
#include <iostream>
#include <math.h>
using namespace std;
int main() {
    // Write C++ code here
    string name;
    cout << "Enter the Name"<<endl;
    cin >> name;
    cout << "The name entered is" <<  name;

    return 0;
}

output: 
Enter the name
Fasid
The name entered is Fasid

-------------------------------------------------------------------------------
Function call:

Function call in c++:
Syntax:

code:
#include <iostream>
#include <math.h>
using namespace std;

void fun(){
    cout <<" hi hello";
}
int main() {
    // Write C++ code here
    string name;
    cout << "Enter the Name"<<endl;
    cin >> name;
    cout << "The name entered is " <<  name << endl;;
    
    fun();
  return 0;

    
}

  
Output:
Enter the Name
fasid
The name entered is fasid
hi hello
