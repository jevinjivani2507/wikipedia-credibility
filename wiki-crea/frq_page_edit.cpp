#include<bits/stdc++.h>
#include <stdio.h>
#include "string.h"
using namespace std;
#define int long long
#define double long double
#define ll long long
#define endl '\n'
#define pb push_back
#define all(x) x.begin(),x.end()
#define con(s1,s2) strstr(s1.c_str(),s2.c_str())
#define foreach(x,y) for(auto &x:y)
#define allr(x) x.rbegin(),x.rend()
#define sum(v) accumulate(all(v),(int)0)
#define ff first
#define ss second
#define pi pair<int,int>
const int M = 1e9+7;

int32_t main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  
    cout<<setprecision(10)<<fixed;

     #ifndef ONLINE_JUDGE
        freopen("inputfulltimedata.txt","r",stdin);
        freopen("new.txt","w",stdout);
    #endif


    srand(time(0));

    int t = 639565;
    for (int i = 0; i < 7; ++i)
    {
        string s; cin>>s;
        // if(i<2)
            // cout<<s<<" ";
    }

    map<int,vector<pi>> m;

    while(t--)
    {
        vector<int> tem;
        for(int i=0; i<7; ++i)
        {
            int x; cin>>x;
            tem.pb(x);
        }

        m[tem[0]].pb({tem.back(),tem[1]});

    }
   
    map<int,double> mp;

    for(auto &x:m)
    {
        vector<pi> &tt = x.ss;

        sort(all(tt));

        double ans = 0;

        for(int i=0; i+1<tt.size(); ++i)
        {
            ans+=tt[i+1].ff-tt[i].ff;
        }

        if(tt.size()==1)
            ans = tt[0].ff;

        ans /= 1.0*(tt.size());
        mp[x.ff] = ans;
    }

    for(auto x:mp){
        cout<<x.ff<<" "<<x.ss<<endl;
    }

    return 0;
}
