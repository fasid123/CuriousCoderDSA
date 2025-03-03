#include <iostream>
using namespace std;

void gcd (int a, int b) {
    
    int gcdv = 1;
    
    for (int i = 2; i <= a; i++){
        if ((a % i == 0) && (b % i == 0)){
            gcdv = i;
        }
    }
    cout << gcdv;
}
int main() {
    // Write C++ code here
    int a,b;
    cin >> a;
    cin >> b;
    
    if ( a<b){
        gcd(a,b);
    }
    else {
        gcd(b,a);
    }

    return 0;
}

output:
input 1 : 15
input 2: 25
output : 5
