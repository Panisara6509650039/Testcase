/*
 * Q2.h
 *
 *  Created on: 14 ก.ย. 2566
 *      Author: VICTUS
 */

#ifndef Q2_H_
#define Q2_H_
#include <iostream>
#include "Q2.h"
#include <cstdio>
#include <sstream>
using namespace std;


void deallocate2DArr(int **arr, int size) {
	for (int i = 0; i < size; i++) {
	delete[] arr[i];
	}
	delete[] arr;
}
int main() {
	int size;
	cout << "Enter the size of a square matrix (>=1 and <=10): ";
	cin >> size;
	fflush(stdin);


	int **oriMatrix = readMatrix(size);
	printMatrix(oriMatrix, size);
	cout << "This matrix is" << (isSymmetricMatrix(oriMatrix, size) ? " " : " NOT ")
                    << "symmetric.\n\n";
	int **uSymMatrix = makeSymmetricMatrix(oriMatrix, size, false);
	printMatrix(uSymMatrix, size);
	cout << "This (fromUpper) matrix is"
                    << (isSymmetricMatrix(uSymMatrix, size) ? " " : " NOT ")
                    << "symmetric.\n\n";
	int **lSymMatrix = makeSymmetricMatrix(oriMatrix, size, true);
	printMatrix(lSymMatrix, size);
	cout << "This (fromLower) matrix is"
                    << (isSymmetricMatrix(lSymMatrix, size) ? " " : " NOT ")
                    << "symmetric.\n";
	// deallocate memory for all created arrays
	deallocate2DArr(oriMatrix, size);
	deallocate2DArr(uSymMatrix, size);
	deallocate2DArr(lSymMatrix, size);

	return 0;
}





#endif /* Q2_H_ */
