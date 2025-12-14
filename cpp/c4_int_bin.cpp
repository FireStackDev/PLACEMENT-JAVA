#include<iostream>

using namespace std;

int main(){
    int n, rem , res = 0, pos = 1;
    bool odd;

    cout << "Enter the decimal number = ";
    cin >> n;

    while(n > 0){
        rem = n % 2;

        res = (rem * pos) + res;

        n = n / 2;
        pos = pos * 10;
    }

    cout << "Binary =  " << res;

    return 0;
}