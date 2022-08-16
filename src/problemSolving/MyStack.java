package problemSolving;

import java.util.Arrays;

public class MyStack {

  private char[] list;
  private int top;
  private int capacity;

    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + Arrays.toString(list) +
                ", top=" + top +
                ", capacity=" + capacity +
                '}';
    }

    public  MyStack(int capacity){

      this.list = new char[capacity];
      this.top=-1;
      this.capacity=capacity;

  }


  public boolean isFull(){
      return this.capacity - 1 == this.top;
  }

  public boolean isEmpty(){
      return top == -1;

  }

    public char[] getList() {
        return list;
    }

    public void setList(char[] list) {
        this.list = list;
    }

    public int getTop() {
        return top;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void push(char c){
      if (isFull()){
          System.exit(0);
      }
      list[++top] = c;
  }

  public char pop(){
      if (isEmpty()){
          System.exit(0);
      }
      return list[top--];

  }

  public char getFirstElement(){
        return list[top];
  }


    public void setTop(int top) {
        this.top = top;
    }

    public int getSize(){
        return this.getCapacity()-this.getTop();
    }
}
