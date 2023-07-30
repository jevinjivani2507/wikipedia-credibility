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
int edge = 639565

int32_t main()
{


    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  
    cout<<setprecision(10)<<fixed;


    #ifndef ONLINE_JUDGE
        freopen("inputfulltimedata.txt","r",stdin);
        freopen("output.txt","w",stdout);
    #endif

    int t = edge;
    map<int,vector<pi>> node;

    for(int j=0; j<edge; ++j)
    {
        vector<int> tem;
        for(int i=0; i<7; ++i)
        {
            int x; cin>>x;
            tem.pb(x);
        }

        node[tem[0]].pb({tem[1],tem[5]});
    }
   


    for(auto &x:node)
    {
        vector<pi> &tt = x.ss;
        map<int,pi> textdata;

        for(int i=0; i<tt.size(); ++i)
        {
            if(textdata.count(tt[i].ff)){
                textdata[tt[i].ff].ss++;
                textdata[tt[i].ff].ff+=tt[i].ss;
            }
            else
            {
                textdata[tt[i].ff] = {tt[i].ss,1};
            }
        }

        for(auto xx:textdata)
        {
            cout << xx.ff << " " << (xx.ss.ff)/(xx.ss.ss) << endl;;
        }

    }


    return 0;
}

