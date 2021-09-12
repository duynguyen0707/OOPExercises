package Entities;

import java.util.Scanner;

public class Tron extends Hinh {
    //private Diem tam = new Diem(0,0 );
    private int banKinh;

    //constructor
    public Tron(Diem d1, int banKinh) {
        super(d1);
        this.banKinh = banKinh;
    }

    public Tron() {
        System.out.println("nhảy vô Tron");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tron{");
        sb.append("d=").append(d);
        sb.append(", banKinh=").append(banKinh);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void nhapThongTinHinh() {
        super.nhapThongTinHinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        int n = sc.nextInt();
        System.out.println("n = " + n);
        this.banKinh = n;
        System.out.println("Bán kính: " + this.banKinh);

    }

    @Override
    public long dienTich() {
        long s = 0;
        return s = (long) ((Math.pow(this.banKinh, 2)) * Math.PI);
    }
}
