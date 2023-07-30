#include<bits/stdc++.h>
#include <stdio.h>
#include "string.h"
using namespace std;
#define ll long long
#define double long double
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
        freopen("input1.txt","r",stdin);
        freopen("creout.txt","w",stdout);
    #endif

    ifstream  fin;
    fin.open("input2.txt"); // cre

    map<int,double> m;
    map<int,int> recod;

    ll mx = 0;
    for(int i=0; i<1942; ++i)
    {
        ll x; fin>>x;
        ll y; fin>>y;
        m[x] = y;
        recod[x]++;
        mx = max(mx,y);
    }

    for(auto &x:m)
    {
        x.ss = 100000*(x.ss/(1.0*mx));
        // cout<<x.ff<<" "<<x.ss<<endl;
   
    }  



    map<ll,double> degin,degout;
    map<ll,vector<ll>> v;
   
    for(int i=0; i<639564; ++i)
    {
        ll x,y; cin>>x>>y;
        // cout<<x<<" "<<y<<endl;
        degin[x]++;
        degin[y]++;
        degout[y]++;
        degout[x]++;
        v[x].push_back(y);
        v[y].push_back(x);
    }

    // int com = 1000;
    while(1)
    {
        map<int,double> newvlue;

        for(auto x:v)
        {
            double val = x.ff;
            vector<ll> &tem = x.ss;
            double ne = 0;

            for(int j=0; j<tem.size(); ++j)
            {
                int nebor = tem[j];
                ne+=m[nebor]/(1.0*degout[nebor]);
                // cout<<m[nebor]<<"----"<<degout[nebor]<<" ";
            }

            newvlue[x.ff] = ne;
            // cout<<ne<<endl;
            // break;

        }

        int ff = 0;
        double d;
        for(auto x:m)
        {
            d = min(x.ss-m[x.ff],d);
        }

        if(d<1/1e4)
            break;
        m = newvlue;    
    }

    for(auto x:m)
    {
        if(recod.count(x.ff))
            cout<<x.ff<<" "<<x.ss<<endl;
    }
   
    return 0;
}
