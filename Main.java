package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] array = {1,54,4,2,5,34,3,6,5,6,77,565};
        insertionSort(array);
        for (int i: array){
            System.out.print(i + " ");
        }
    }
    /*
    Bản chất của InsertionSort nó cũng đã 1 phần giống như SelectionSort khi nó cũng sử dụng một biến trung gian để sắp xếp
    Nhưng khác ở chỗ là nó tìm vị trí chinh xác của mỗi phần từ khi khi được điểm mặt đến trong vòng loop ở array kết quả sau khi đuọc
    sắp xếp chứ không phải đẩy phần tử bé nhất hay lớn nhất về đầu hay cuối của array
    Tuy dùng biến trung gian giống selection sort nhưng algorithm này có số lần đổi chỗ lớn hơn selection sort nhưng ít hơn bubblesort
     */

    private static void insertionSort (int[] array){
        for (int i =1; i<= array.length - 1; i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}