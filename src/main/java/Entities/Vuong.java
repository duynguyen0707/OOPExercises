package Entities;

import java.util.Scanner;

public class Vuong extends Hinh {
    private int chieuRong;

    public Vuong() {

    }

    public Vuong(Diem d1, int chieuRong) {
        super(d1);
        this.chieuRong = chieuRong;
    }

    @Override
    public void nhapThongTinDat() {
        super.nhapThongTinDat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = sc.nextInt();
        System.out.println("chiều rộng " + chieuRong);

        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuong{");
        sb.append("d=").append(d);
        sb.append(", chieuRong=").append(chieuRong);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public long dienTich() {
        long s = 0;
        return s = this.chieuRong * this.chieuRong;
    }
}
