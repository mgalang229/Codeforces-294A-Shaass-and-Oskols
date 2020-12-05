#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

vector<ar<int, 2>> v;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	int a[n];
	for(int i=1; i<=n; ++i)
		cin >> a[i];
	int m;
	cin >> m;
	for(int i=1; i<=m; ++i) {
		int x, y;
		cin >> x >> y;
		a[x-1]+=(y-1);
		a[x+1]+=(a[x]-y);
		a[x]=0;
	}
	for(int i=1; i<=n; ++i)
		cout << a[i] << "\n";
}
