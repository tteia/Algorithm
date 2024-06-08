#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){ ios_base::sync_with_stdio(false); cin.tie(NULL);
    
    int N;
    cin >> N;
    cin.ignore();
    string sen;
    
    for(int i = 1; i <= N; i++){
        getline(cin, sen);
        cout << i << ". " << sen << "\n";
    }
}