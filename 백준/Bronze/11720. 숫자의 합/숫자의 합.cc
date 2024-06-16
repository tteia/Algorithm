#include <iostream>

using namespace std;

int main(){
ios_base::sync_with_stdio(false); cin.tie(NULL);
    
    int n;
    cin >> n;

    char arr[101];
    cin >> arr;

    int sum = 0;

    for(int i = 0; i < n; i++){
        sum += arr[i] - '0';
    }
    cout << sum;
}