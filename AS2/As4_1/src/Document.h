#ifndef DOCUMENT_H_
#define DOCUMENT_H_
#include <iostream>
#include <vector>
#include <string>
#include "CharacterCount.h"
using namespace std;
class Document
{
private:
    vector<string> doc;
    CharacterCount *arrChar;

public:
    const int NO_CHAR = 26; // number of English characters
    Document();
    ~Document();
    void addSentence(string str);
    int indexOfCharacter(char ch);
    CharacterCount *get(char ch);
    CharacterCount *maxFreq();
    void printAll();
};
#endif /* DOCUMENT_H_ */
