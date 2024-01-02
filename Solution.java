//cyberkingsid@gmail.com

class DynamicClass {

    public int[] arr;

    private int index;

    DynamicClass() {
        index = -1;
        arr = new int[2];
    }

    private void dynamicArray() {
        int[] temp = arr;
        arr = new int[temp.length * 2];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Array Size was increased");
    }

    public void add(int elem) {

        if (index == arr.length - 1) {
            dynamicArray();
        }
        index++;
        arr[index] = elem;
    }

    public void print() {
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        DynamicClass da = new DynamicClass();
        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);
        da.add(60);
        da.print();
    }
}