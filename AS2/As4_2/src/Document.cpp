#include "Document.h"
#include "CharacterCount.h"
#include <iostream>
#include <cctype>

Document::Document()
{
    this->arrChar = new CharacterCount[26];
    for (size_t i = 0; i < 26; i++)
    {
        (this->arrChar + i)->setLetter(i + 'A');
    }
}

Document::~Document()
{
    delete[] arrChar;
}
void Document::addSentence(string str)
{
    this->doc.push_back(str);
    char a;
    for (size_t i = 0; i < str.length(); i++)
    {
        a = toupper(str.at(i));
        (this->arrChar + (a - 'A'))->addFreq(1);
    }
}
int Document::indexOfCharacter(char ch)
{
    if (isalpha(ch))
    {
        return toupper(ch) - 'A';
    }
    return -1;
}
CharacterCount *Document::get(char ch)
{
    if ('A' < ch && ch < 'Z')
    {
        return this->arrChar + (ch - 'A');
    }
    return nullptr;
}
CharacterCount *Document::maxFreq()
{
    CharacterCount *max = this->arrChar;
    for (size_t i = 0; i < 26; i++)
    {
        if (max->getFreq() < (this->arrChar + i)->getFreq())
        {
            max = this->arrChar + i;
        }
    }
    return max;
}
void Document::printAll()
{
    cout << "Document contains: " << this->doc.size() << "lines:" << endl;
    for (vector<string>::iterator it = this->doc.begin(); it != this->doc.end(); ++it)
    {
        cout << *it << endl;
    }
    cout << "Frequency of found characters:" << endl;
    int count = 0;
    for (size_t i = 0; i < 26; i++)
    {
        if ((this->arrChar + i)->getFreq() != 0)
        {
            cout << "\t" << (this->arrChar + i)->toString();
            count++;
        }
        else
        {
            continue;
        }
        if ((count) % 2 == 0)
        {
            cout << endl;
        }
    }
    cout << endl;
}
