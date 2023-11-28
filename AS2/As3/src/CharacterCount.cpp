#include "CharacterCount.h"
#include <iostream>
#include <cctype>
#include <sstream>
#include <string>

using namespace std;

 CharacterCount::CharacterCount(char letter) : freq(0)
{
    setLetter(letter);
}

void CharacterCount::setLetter(char ch)
{
    letter = toupper(ch);
}

char CharacterCount::getLetter()
{
    return letter;
}

int CharacterCount::getFreq()
{
    return freq;
}

void CharacterCount::incFreq()
{
    freq++;
}

void CharacterCount::addFreq(int count)
{
    freq = freq + count;
}

string CharacterCount::toString()
{
    stringstream sa;
    string up = isupper(getLetter()) ? "True" : "false";
    sa << getLetter() << " Freq: " << getFreq() << " " << up;
    string result = sa.str();
    return result;
}
