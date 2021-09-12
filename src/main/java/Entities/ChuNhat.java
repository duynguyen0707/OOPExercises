package Entities;

import java.util.Scanner;

public class ChuNhat extends Hinh {
    private int chieuDai;
    private int chieuRong;

    public ChuNhat(Diem d, int dai, int rong) {
        super(d);
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    public ChuNhat() {

    }

    public void nhapThongTinHinh() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTinHinh();
        System.out.println("Nhập chiều dài: ");
        int chieuDai = sc.nextInt();
        this.chieuDai = chieuDai;
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = sc.nextInt();

        this.chieuRong = chieuRong;
    }

    public long dienTich() {
        int s = this.chieuDai * this.chieuRong;
        System.out.println("Diện tích hình chữ nhật: " + s);
        return s;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ChuNhat{");
        sb.append("chieuDai=").append(chieuDai);
        sb.append(", chieuRong=").append(chieuRong);
        sb.append(", d=").append(d);
        sb.append('}');
        return sb.toString();
    }
}

