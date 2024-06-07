#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){ ios_base::sync_with_stdio(false); cin.tie(NULL);
    
    int A, B, C, D;
    cin >> A >> B >> C >> D;
    int first, second;
    first = A + D;
    second = C + B;
    if(first > second){
        cout << second;
    }
    else{
        cout << first;
    }
}