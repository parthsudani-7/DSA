class MinStack {
private:
    stack<int> obj;
    stack<int> min;
public:
    MinStack() {
        
    }
    void push(int val) {
        obj.push(val);
        if(min.empty() || val<min.top()){
            min.push(val);
        }
        else{
            min.push(min.top());
        }
    }
    void pop() {
        obj.pop();
        min.pop();
    }
    
    int top() {
        return obj.top();
    }
    
    int getMin() {
        return min.top();
    }
};
