import Entities.*;

import java.util.Scanner;

//Một thương nhân thu mua bất động sản ở nhiều nơi. Mỗi lần mua, anh ta ghi nhận lại thông tin của mảnh đất (vốn có hình dạng không giống nhau) mình vừa mua được gồm các thông tin
//
//        Hình chữ nhật: điểm-trái-trên, chiều-dài, chiều-rộng
//        Hình vuông: điểm-trái-trên, chiều-rộng
//        Hình tròn: trung-tâm, bán-kính
//        Hình tam giác: 3 điểm
//        Hãy xây dựng chương trình Java cho phép
//
//        Ghi nhận thông tin các mảnh đất mà thương nhân mua được từ console
//        Xuất ra thông tin các mảnh đất có một loại hình dạng nào đó (ví dụ: hình vuông, hình tròn, …)
//        Nhận thông tin giá đất trên m2 từ console, hãy cho biết tổng tiền mà thương nhân cần chi trả để sở hữu tất cả các mảnh đất

public class App {
    public static void main(String[] args) {
//        Diem d = new Diem(0,1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số mảnh đất cần nhập: ");
        int n = sc.nextInt();
        Hinh[] list = new Hinh[n];
        Hinh.nhapDanhSachDat(list);

        Hinh.xuatDanhSachDat(list);

        System.out.println("Nhập thông tin giá đất theo m vuông");
        long giaDat = sc.nextLong();

        System.out.println("Gía đất: " + giaDat);
        System.out.println("======================================================");

        Hinh.tongTien(list, giaDat);

    }


}
