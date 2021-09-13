package Entities;

import java.util.Scanner;

public class TamGiac extends Hinh {
    private Diem d1;
    private Diem d2;
    private Diem d3;

    public TamGiac() {

    }

    public Diem getD1() {
        return d1;
    }

    public Diem getD2() {
        return d2;
    }

    public Diem getD3() {
        return d3;
    }


    public TamGiac(Diem inputD1, Diem inputD2, Diem inputD3) {
        this.d1 = inputD1;
        this.d2 = inputD2;
        this.d3 = inputD3;

    }

//    public void nhapThongTinHinh() {
//
//        System.out.println("Nhập điểm D1: ");
//        super.nhapThongTinHinh();
//        System.out.println("Nhập điểm D2: ");
//        super.nhapThongTinHinh();
//        System.out.println("Nhập điểm D3: ");
//        super.nhapThongTinHinh();
//    }

    public void nhapThongTinDat() {
        System.out.println("Nhập điểm D1: ");
        Diem d1 = new Diem();
        d1.nhapToaDoDiem();
        this.d1 = d1;

        System.out.println("Nhập điểm D2: ");
        Diem d2 = new Diem();
        d2.nhapToaDoDiem();
        this.d2 = d2;

        System.out.println("Nhập điểm D3: ");
        Diem d3 = new Diem();
        d3.nhapToaDoDiem();
        this.d3 = d3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac{");
        sb.append("d1=").append(d1);
        sb.append(", d2=").append(d2);
        sb.append(", d3=").append(d3);
        sb.append('}');
        return sb.toString();
    }

    public long dienTich() {
        long s = 0;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        double canh1 = this.d1.khoangCachAB(this.d2);
        System.out.println("Cạnh 1:" + canh1);
        double canh2 = this.d1.khoangCachAB(this.d3);
        System.out.println("Cạnh 2:" + canh2);
        double canh3 = this.d2.khoangCachAB(this.d3);
        System.out.println("Cạnh 3:" + canh3);

        double t1 = (canh1 + canh2 + canh3) * (canh1 + canh2 - canh3) * (canh2 + canh3 - canh1) * (canh3 + canh1 - canh2);
        System.out.println("tổng các cạnh" + t1);
        double t2 = (double) Math.sqrt(t1);
        s = (long) t2 / 4;
        System.out.println("Diện tích tam giác:" + s);

        return s;

    }
}
