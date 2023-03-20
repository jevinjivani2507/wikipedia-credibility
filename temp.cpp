#include<bits/stdc++.h>
#include <stdio.h>
#include "string.h"
using namespace std;
#define int long long
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

    srand(time(0));
    // int test; cin>>test;
    // while(test--)
    ofstream MyFile("reduce.txt");

    {
        fstream ff;
        ff.open ("MainData.txt", ios::in);
        int com = 10000;
        while(1)
        {   
            string s[14];
            // cout<<"--";
            for(int i=0; i<13; ++i)
            {
                getline(ff,s[i]);
                // MyFile<<s<<endl;
            }

            if(rand()%200==20 || rand()%200==50)
            {
                for(int i=0; i<13; ++i)
                {
                    MyFile<<s[i]<<endl;
                }
                com--;
            }



            if(com==0)
                break;


        }







    }


    
    return 0;
}
