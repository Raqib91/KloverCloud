#include<iostream>
using namespace std;

int main()
{
//    string str = "klovercloud.com//docs///vpc";
    string str;
    cout << "Input: ";
    cin >> str;
    string out = "";
    int isSlash = 0;

    for(int i=0; i<str.length(); i++)
    {
        if(str[i]=='/' && isSlash==0)
        {
            out += str[i];
            isSlash = 1;
        }
        else if(str[i]!='/')
        {
            out += str[i];
            isSlash = 0;
        }
    }

    cout << "Output: " << out << endl;
    return 0;
}
