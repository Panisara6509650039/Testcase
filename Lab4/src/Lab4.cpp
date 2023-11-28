//============================================================================
// Name        : Lab4.cpp
// Author      : Mild
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>
using namespace std;
int main(int argc, char** argv){
string filename = "my_activities.txt";
ofstream fout(filename.c_str(), ios::out);
std::string Activities01, Activities02, Activities03 ;
if (!fout) {
	cerr << "Error: open file for output failed!" << endl;
	abort(); // in <cstdlib> header
}
std::cout << "Activities 1 : ";
std::getline(std::cin, Activities01);
std::cout << "Activities 2 : ";
std::getline(std::cin, Activities02);
std::cout << "Activities 3 : ";
std::getline(std::cin, Activities03);
fout << Activities01 << endl;
fout << Activities02 << endl;
fout << Activities03 << endl;
fout.close();
return 0;
}
