#include <iostream>
using namespace std;
int main() {
    int n=7, flag=0;
    for(int i=2;i<n;i++){
        if(n%i==0){
            flag = 1;
            cout <<"j";
        }
    }
    if (n == 1 || n == 0){
        cout<<"Not a Prime number";
    }
    else if(flag==0){
        cout<<"Prime number";
    } else{
        cout<<"Not a Prime number";
    }
    return 0;
}

output:
  input : 2
  output : Yes
