#ifndef Q2_H_
#define Q2_H_


int **readMatrix(int size)
{
    if (!(1 < size && size <= 10))
    {
        std::cout << "Invalid matrix size; cannot create it. \nbye";
        exit(0);
    }
    std::cout << "Enter "<< size << "rows of" << size << "integers each:\n";
    int **matrix = new int *[size]; 
    for (int i = 0; i < size; i++)
    {
        matrix[i] = new int[size]; 
    }


    for (int i = 0; i < size; i++)
    {
        std::cout << "Row" << (i) << "(" << size << " elements)";
        for (int j = 0; j < size; j++)
        {
            if (std::cin >> matrix[i][j])
            {
               
            }
            else
            {
               
                std::cout << "Invalid input. Exiting..." << std::endl;
                
                return nullptr;
            }
        }
    }

    return matrix; 
}


int **makeSymmetricMatrix(int **matrix, int size, bool fromLower)
{
    int **symmetricMatrix = new int *[size]; 
    for (int i = 0; i < size; i++)
    {
        symmetricMatrix[i] = new int[size];
    }

    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (fromLower)
            {
                symmetricMatrix[i][j] = matrix[i][j];
                symmetricMatrix[j][i] = matrix[i][j];
            }
            else
            {
                symmetricMatrix[i][j] = matrix[i][j];
                symmetricMatrix[j][i] = matrix[i][j];
            }
        }
    }

    return symmetricMatrix;
}


void printMatrix(int **matrix, int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            std::cout << matrix[i][j] << " ";
        }
        std::cout << std::endl;
    }
}


bool isSymmetricMatrix(int **matrix, int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            if (matrix[i][j] != matrix[j][i])
            {
                return false;
            }
        }
    }
    return true;
}

#endif /* Q2_H_ */
