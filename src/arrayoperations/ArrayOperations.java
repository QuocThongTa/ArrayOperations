/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations;

import java.util.Scanner;

/**
 *
 * @author 777th
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Method nhập mảng số thực
        float[] arrays = new float[5];

        // Nhập dữ liệu cho mảng
        arrays = importData(arrays);

        // Xuất mảng ra màn hình
        printData(arrays);

        // Tìm phần tử lớn thứ 2 trong mảng
        float max2 = findMax2(arrays);
        System.out.println("Phần tử lớn thứ 2 trong mảng là: " + max2);

        // Xóa các phần tử lẻ ra khỏi mảng và in kết quả
        float[] newArray = deleteOddNumber(arrays);
        System.out.println("Mảng sau khi xóa các phần tử lẻ:");
        printData(newArray);
    }

    // 2. Method nhập mảng số thực
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // 3. Method xuất mảng ra màn hình
    public static void printData(float[] arrays) {
        System.out.println("Các phần tử trong mảng:");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 4. Method tìm giá trị phần tử lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        float max = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;

        for (float num : arrays) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2 && num != max) {
                max2 = num;
            }
        }
        return max2;
    }

    // 5. Method Xoá các phần tử lẻ ra khỏi mảng
    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float num : arrays) {
            // Kiểm tra nếu là số nguyên lẻ
            if (num % 2 != 0) {
                count++;
            }
        }
        float[] result = new float[arrays.length - count];
        int index = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        return result;        
    }
    

}
