
#include <stdio.h>
#include <string.h>
#include <limits.h>

#define MAX_LENGTH 51
#define MAX_SUBSTRINGS 101

int main() {
    int N;
    scanf("%d", &N);
    
    char substrings[MAX_SUBSTRINGS][MAX_LENGTH];
    int costs[MAX_SUBSTRINGS];
    for (int i = 0; i < N; i++) {
        scanf("%s %d", substrings[i], &costs[i]);
    }
    
    char main_string[MAX_LENGTH];
    scanf("%s", main_string);
    int main_len = strlen(main_string);
    
   
    int dp[MAX_LENGTH];
    for (int i = 0; i <= main_len; i++) {
        dp[i] = INT_MAX;
    }
    dp[0] = 0; 
    
    
    for (int i = 0; i < main_len; i++) {
        if (dp[i] == INT_MAX) continue; 
        
        for (int j = 0; j < N; j++) {
            int sub_len = strlen(substrings[j]);
            if (i + sub_len <= main_len && strncmp(main_string + i, substrings[j], sub_len) == 0) {
                dp[i + sub_len] = dp[i + sub_len] < dp[i] + costs[j] ? dp[i + sub_len] : dp[i] + costs[j];
            }
        }
    }
    
   
    if (dp[main_len] == INT_MAX) {
        printf("Impossible\n");
    } else {
        printf("%d\n", dp[main_len]);
    }
    
    return 0;
}