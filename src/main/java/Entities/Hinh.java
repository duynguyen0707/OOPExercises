package Entities;

import java.util.Scanner;

public class Hinh {
    protected Diem d;

    public Hinh() {
    }

    public Hinh(Diem d) {
        this.d = d;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hinh{");
        sb.append("d=").append(d);
        sb.append('}');
        return sb.toString();
    }

    public long dienTich() {
        return 0;
    }

    public void nhapThongTinDat() {
        Diem d = new Diem();
        d.nhapToaDoDiem();
        this.d = d;

    }

    public static void nhapGiaDat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá đất theo m vuông ");
        int n = sc.nextInt();

    }

    public static void tongTien(Hinh[] list, long giaDat) {
        long tongTien = 0;
        long tien1Thua = 0;

        for (int i = 0; i < list.length; i++) {

            tien1Thua = list[i].dienTich() * giaDat;
            System.out.println("Số tiền thửa thứ: " + (i + 1) + " là: " + tien1Thua);
            tongTien = tongTien + tien1Thua;
            System.out.println("Tổng Tiền cần phải trả cho tất cả các mảnh đất: " + tongTien);
            System.out.println("======================================================");

        }
//        return tongTien;
    }

    public static void nhapDanhSachDat(Hinh[] list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.println("Mảnh thứ " + (i + 1) + " có hình gì? chunhat nếu là chữ nhât, vuong nếu là hình vuông, tron nếu là hình tròn, tamgiac nếu là tam giác");
            String type = sc.next();

            if (type.equals("chunhat")) {
                System.out.println("Nhảy vô chữ nhật");
                ChuNhat cn = new ChuNhat();
                cn.nhapThongTinDat();
                list[i] = cn;
                System.out.println(list[i].toString());
                System.out.println("======================================================");

            } else if (type.equals("tron")) {
                System.out.println("Nhảy vô tron");
                Tron tr = new Tron();
                tr.nhapThongTinDat();
                list[i] = tr;
                System.out.println("======================================================");

            } else if (type.equals("vuong")) {
                System.out.println("Nhảy vô vuông");
                Vuong vng = new Vuong();
                vng.nhapThongTinDat();
                list[i] = vng;
                System.out.println("======================================================");

            } else if (type.equals("tamgiac")) {
                System.out.println("Nhảy vô tamgiac");
                TamGiac tg = new TamGiac();
                tg.nhapThongTinDat();
                list[i] = tg;
                System.out.println(list[i].toString());
                System.out.println("======================================================");

            } else {
                System.out.println("Thông tin ko hợp lệ");

            }
        }

    }

    public static void xuatDanhSachDat(Hinh[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof ChuNhat) {
                System.out.println("Mảnh đất thứ " + (i + 1) + " là hình chữ nhật");
                System.out.println(list[i].toString());
                System.out.println("======================================================");
            }
            if (list[i] instanceof TamGiac) {
                System.out.println("\"Mảnh đất thứ " + (i + 1) + " là hình Tamgiac");
                System.out.println(list[i].toString());
                System.out.println("======================================================");
            }
            if (list[i] instanceof Tron) {
                System.out.println("Mảnh đất thứ " + (i + 1) + " là hình Tròn");
                System.out.println(list[i].toString());
                System.out.println("======================================================");
            }
            if (list[i] instanceof Vuong) {
                System.out.println("Mảnh đất thứ " + (i + 1) + " là hình Vuông");
                System.out.println(list[i].toString());
                System.out.println("======================================================");
            }
        }
    }

}
