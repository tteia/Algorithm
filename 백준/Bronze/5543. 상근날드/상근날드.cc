#include <iostream>

using namespace std;

int main(){ ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    
    int price[5];
    int hamb = 2000, drink = 2000;
    
    for(int i = 0; i < 3; i++){
        cin >> price[i];
        if(price[i] < hamb){
            hamb = price[i];
        }
    }
    for(int i = 3; i < 5; i++){
        cin >> price[i];
        if(price[i] < drink){
            drink = price[i];
        }
    }
    
    cout << (hamb + drink) - 50;

}