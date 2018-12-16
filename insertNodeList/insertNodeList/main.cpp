//
//  main.cpp
//  insertNodeList
//
//  Created by Xinrui Lu on 12/15/18.
//  Copyright © 2018 AXL. All rights reserved.
//

#include <iostream>
using namespace std;
#include <new>
int find(char *, int, char);

int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, World!\n";
    // const int *array = new int[10]{1,2,3,4,5,6,7,8,9,10};
    int length = 4;
    char * a = new char[length]{'8', 'a', 'n', 'y'};
    cout << find(a, length, 'a') << '\n';
    return 0;
}
// 在数组 a 中，查找 key，返回 key 所在的位置
// 其中，n 表示数组 a 的长度
int find(char* a, int n, char key) {
    // cout<< a;
    // 边界条件处理，如果 a 为空，或者 n<=0，说明数组中没有数据，就不用 while 循环比较了
    if(a == nullptr || n <= 0) {
        return -1;
    }
    
    int i = 0;
    // 这里有两个比较操作：i<n 和 a[i]==key.
    while (i < n) {
        //cout << a[i];
        if (a[i] == key) {
            return i;
        }
        ++i;
    }
    
    return -1;
}
