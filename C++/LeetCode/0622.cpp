#include <bits/stdc++.h>
using namespace std;

class MyCircularQueue {
    int *buf;
    int head;
    int tail;
    int cap;

public:
    MyCircularQueue(int k) {
        cap = k;
        buf = new int[cap];
        head = -1;
        tail = -1;
    }
    
    bool enQueue(int value) {
        if ((tail + 1) % cap == head)
            return false;
        
        if (head == -1) {
            head = 0;
            tail = 0;
            buf[tail] = value;
            return true;
        }
        
        tail = (tail + 1) % cap;
        buf[tail] = value;
        return true;
    }
    
    bool deQueue() {
        if (head == -1)
            return false;
        
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % cap;
        }
        return true;
    }
    
    int Front() {
        if (head == -1)
            return -1;
        return buf[head];
    }
    
    int Rear() {
        if (head == -1)
            return -1;
        return buf[tail];
    }
    
    bool isEmpty() {
        return head == -1;
    }
    
    bool isFull() {
        return (tail + 1) % cap == head;
    }
};