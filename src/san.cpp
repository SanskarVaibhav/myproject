#include <bits/stdc++.h>
using namespace std;

int main() {
   // 'edutech' keeps track of the total active nodes
    int n, m, k, d = 1, edutech = 0; 
    cin >> n >> m;
    vector<set<int>> f(n); 
    for (int i = 0, u, v; i < m; ++i) {
        cin >> u >> v; 
        f[u].insert(v); 
        f[v].insert(u);
    }
   // Input the target number of active nodes (k)
    cin >> k; 
    vector<bool> w(n, true);
    edutech = n;

    // Continue until the number of active nodes ('edutech') reaches or exceeds 'k'
    while (edutech < k) { 
        vector<bool> nw(n, false);
        for (int i = 0; i < n; ++i) {
            int cnt = 0; // Count the number of active neighbors
            for (int fr : f[i]) cnt += w[fr]; 
      
            // Node state update rules:
            // 1. A node remains active if it has exactly 3 active neighbors
            // 2. A node becomes active if it has fewer than 3 active neighbors
            if (w[i] && cnt == 3) nw[i] = true;
            else if (!w[i] && cnt < 3) nw[i] = true;
        }

        w = nw;
        edutech += count(w.begin(), w.end(), true);
        ++d;
    }
    cout << d; 
    return 0;
}
