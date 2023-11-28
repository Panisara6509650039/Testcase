
#include <iostream>
#include <vector>
using namespace std;
std::vector<int> filter(const int arr[], int size, int value, int compare) {
    std::vector<int> result;

    for (int i = 0; i < size; ++i) {
        if ((compare < 0 && arr[i] < value) || (compare == 0 && arr[i] == value) || (compare > 0 && arr[i] > value)) {
            result.push_back(arr[i]);
        }
    }

    return result;
}

int main() {

    int size  ;
    int value  ;

    std::cout << "SIZE ARRAY : ";
        std::cin >> size;

    int *arr = new int[size];
    std::cout << "ARRAY: ";
        for (int i = 0; i < size; ++i) {
            std::cin >> arr[i];
        }

    std::cout << "Original Array ";
    for (int i = 0; i < size; ++i) {
           std::cout << arr[i] << " ";
       }


    std::cout << "\nresult of ==";
    std::cin >> value;
    std::vector<int> result0 = filter(arr, size, value, 0);
    for (int num : result0) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    std::cout << "result of <";
    std::cin >> value;
    std::vector<int> result1 = filter(arr, size, value, -1);
    for (int num : result1) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    std::cout << "result of >";
    std::cin >> value;
    std::vector<int> result2 = filter(arr, size, value, 1);
    for (int num : result2) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
