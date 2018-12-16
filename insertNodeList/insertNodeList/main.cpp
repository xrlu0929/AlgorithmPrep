//
//  main.cpp
//  insertNodeList
//
//  Created by Xinrui Lu on 12/15/18.
//  Copyright © 2018 AXL. All rights reserved.
//

#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, World!\n";
    return 0;
}
// 在数组 a 中，查找 key，返回 key 所在的位置
// 其中，n 表示数组 a 的长度
int find(char* a, int n, char key) {
    // 边界条件处理，如果 a 为空，或者 n<=0，说明数组中没有数据，就不用 while 循环比较了
    if(a == nullptr || n <= 0) {
        return -1;
    }
    
    int i = 0;
    // 这里有两个比较操作：i<n 和 a[i]==key.
    while (i < n) {
        if (a[i] == key) {
            return i;
        }
        ++i;
    }
    
    return -1;
}
