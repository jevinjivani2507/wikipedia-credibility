#include<bits/stdc++.h>
#include <stdio.h>
#include "string.h"
#include <iostream>
#include<sstream>
#include <string.h>
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
   
    srand(time(NULL));

    ifstream  fin;
    fin.open("main.txt");
    ofstream ff("count_external_link.txt");

   

    int com1 = 0;
    while(fin.peek()!=EOF)
    {


        string s[14];
        string id;
        string user;

        for(int i=0; i<7; ++i)
        {
            fin>>s[0];
            if(i==1){
                id = s[0];
                // cout<<id<<" ";
            }
            else if(i==6)
            {
                user = s[0];
            }
        }

        // ff<<endl;
        ff<<id<<" "<<user<<" ";
        for(int i=1; i<14; ++i)
        {
            string len = "0";
            // if(i==13)
            // {
            //     string ss; fin>>ss;
            //     fin>>ss;
            //     len = ss;
            // }

            // if(i!=13)
            getline(fin,s[i]);
            if(i==9 || i==4)
            {
               
                int comext = count(all(s[i]),' ');
                if(i==4)
                    ff<<(comext+2/3)<<" ";
                else
                    ff<<comext<<" ";

                // cout<<s[i]<<" ";
            }
            if(i==11)
            {
                if(s[i].size()>10)
                    ff<<1<<" ";
                else
                    ff<<0<<" ";
            }
           
           
           
            if(i==13){
                string del;
                istringstream ss(s[i]);
                // cout<<s[i]<<endl;
                int com = 0;
                while(getline(ss, del, ' ')) {
                    if(com==1)
                        len = del;
                    com++;
                }
                ff<<len<<" ";

            }

           
        }
            ff<<endl;
            // cout<<endl;


        // com1++;
        // if(com1==20)
            // break;

       
       
    }

    // cout<<com<<endl;


    return 0;
}
