#include<bits/stdc++.h>
#include <stdio.h>
#include "string.h"
using namespace std;
#define int long long
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
int edge = 639564;
int inst = 2047;
int instauthor = 71080;


int32_t main()
{


    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  
    cout<<setprecision(10)<<fixed;


    #ifndef ONLINE_JUDGE
        freopen("input1.txt","r",stdin);
        freopen("creout.txt","w",stdout);
    #endif

    ifstream  finauthor,finpage;
    finauthor.open("input2.txt");
    finpage.open("input3.txt");


    map<int,double> node;


    for(int i=0; i<inst; ++i)
    {
        int x; finauthor>>x;
        int y; finauthor>>y;
        node[x] = y;
    }


    map<int,double> page;
    for(int i=0; i<instauthor; ++i)
    {
        int x; finpage>>x;
        int y; finpage>>y;
        node[x] = y;
    }


    map<int,double> degin,degout;
    map<int,vector<pair<int,int>>> edges;
   
    for(int i=0; i<edge; ++i)
    {
        int x,y; cin>>x>>y;
        degin[x]++; degin[y]++;
        degout[y]++; degout[x]++;
        int data; cin>>data;
        edges[x].push_back({x,data});
        edges[y].push_back({y,data});
    }

    while(1)
    {
        map<int,double> newvlue;

        for(auto x:edges)
        {
            double val = x.ff;
            vector<pi> &tem = x.ss;
            double newcre = 0;

            for(int j=0; j<tem.size(); ++j)
            {
                int nebor = tem[j].ff;
                newcre+=(node[nebor]/(1.0*degout[nebor]))*tem[j].ss;
            }

            newvlue[x.ff] = newcre;
        }

        int ff = 0;
        double d = 0;
        for(auto x:node)
        {
            d = max(x.ss-node[x.ff],d);
        }


        if(d<1/1e4)
            break;
        node = newvlue;    
    }


    for(auto i:node)
    {
        cout<<i.ff<<" "<<i.ss<<endl;
    }
   
    return 0;
}
