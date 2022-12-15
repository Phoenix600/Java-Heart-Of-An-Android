package lib;

public interface ArrayMethods {

    void append(int key);
    void insert(int index, int key);
    void delete(int index);
    void init();
    int hashSearch(int element);
    boolean isSorted();
    int linearSearch(int key);
    int binarySearch(int key);
    int search(int key);
    void insertionSort();
    void bubbleSort();
    int  get(int index);
    void set(int index,int key);
    int sum();
    double average();
    int max();
    int min();
    void reverse();
    void shiftToLeft(int RotateBy);
    void shiftToRight(int RotateBy);
    void display();
}
