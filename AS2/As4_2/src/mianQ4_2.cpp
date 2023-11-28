#include <iostream>
#include <string>
#include <fstream>
#include "Document.h"
#include "CharacterCount.h"

int main()
{
    Document *doc = new Document();
    string line = "", filename = "";
    cout << "Enter filename : ";
    cin >> filename;
    ifstream fin(filename);
    if (!fin.is_open())
    {
        cerr << "Unable to open file" << std::endl;
        return 1; 
    }
    while (getline(fin, line))
    {
        doc->addSentence(line);
    }
    fin.close();

    doc->printAll();
    // cout << "Max character " << doc->maxFreq()->toString() << endl;
    // cout << "Index of X " << doc->indexOfCharacter('X') << endl;
    // cout << "Index of 9 " << doc->indexOfCharacter('9') << endl;
    // cout << "Index of U " << doc->indexOfCharacter('U') << endl;
    // cout << "Character X: " << (doc->get('X') ? doc->get('X')->toString() : "NULL") << endl;
    // cout << "Character 9: " << (doc->get('9') ? doc->get('9')->toString() : "NULL") << endl;
    // cout << "Character U: " << (doc->get('U') ? doc->get('U')->toString() : "NULL") << endl;
    // cout << "Bye\n";
    delete doc;
    return 0;
}
