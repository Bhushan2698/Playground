#include<iostream>
using namespace std;
int main()
{
  char line[200];
  int vw,cs,ws,d,s;
  vw=0,cs=0,ws=0,d=0,s=0;
  cin.getline(line,200);
  for(int i=0;line[i]!='\0';i++)
  {
  	if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
       line[i]=='o' || line[i]=='u' || line[i]=='A' ||
       line[i]=='E' || line[i]=='I' || line[i]=='O' ||
       line[i]=='U')
    {
    	vw++;
    }
    else if((line[i]>='a' && line[i]<='z') || (line[i]>='A' && line[i]<='Z'))
    {
    	cs++;	
    }
    else if(line[i]==' ')
    {
    	ws++;
    }
    else if(line[i]>='0' && line[i]<='9')
    {
    	d++;
    }
    else
    {
    	s++;
    }
  }
  cout<<"Vowels:"<<vw<<"\nConsonants:"<<cs<<"\nWhite Spaces:"<<ws<<"\nDigits:"<<d<<"\nSymbols:"<<s;
}