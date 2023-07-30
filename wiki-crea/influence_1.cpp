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
int edge = 639565;


int32_t main()
{


    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  
    cout<<setprecision(10)<<fixed;


     #ifndef ONLINE_JUDGE
        freopen("inputfulltimedata.txt","r",stdin);
        freopen("new.txt","w",stdout);
    #endif

   
    map<int,vector<pi>> time;

    for(int j=0; j<edge; ++j)
    {
        vector<int> tem;
        for(int i=0; i<7; ++i)
        {
            int x; cin>>x;
            tem.push_back(x);
        }

        time[tem[0]].pb({tem.back(),tem[1]});
    }
   
    map<int,int> node;


    for(auto &x:time)
    {
        vector<pi> &tt = x.ss;
        sort(tt.begin(),tt.end());
       
        int r = 0;
        for(int i=0; i<tt.size(); ++i)
        {

            r = i;
           
            while(r<tt.size() && 500+tt[i].ff>=tt[r].ff)
            {
                r++;
            }

            node[tt[i].ss] += r-i;
            i = r-1;
        }

    }

    for(auto x:node){
        cout << x.ff << " " << x.ss << endl;
    }


    return 0;
}


