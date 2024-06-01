#include <iostream>

using namespace std;

int main(){ ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    
    int N, M;
    cin >> N >> M;
    int card[N], sum = 0, max = 0;
    for(int i = 0; i < N; i++){
        cin >> card[i];
    }
    for(int i = 0; i < N; i++){
        for(int j = i + 1; j < N; j++){
            for(int k = j + 1; k < N; k++){
                sum = card[i] + card[j] + card[k];
                if(sum <= M && sum > max){
                    max = sum;
                }
            }
        }
    }
    cout << max;
}