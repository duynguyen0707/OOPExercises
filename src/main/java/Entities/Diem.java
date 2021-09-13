package Entities;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public void nhapToaDoDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tọa độ điểm X: ");
        int diemx = sc.nextInt();
        this.x = diemx;
        System.out.println("nhập tọa độ điểm :Y ");
        int diemy = sc.nextInt();
        this.y = diemy;
    }

    public double khoangCachAB(Diem another) {
        double ds = 0;
        double diemA = (double) Math.pow(another.x - this.x, 2);
        double diemB = (double) Math.pow(another.y - this.y, 2);
        ds = (double) Math.sqrt(diemA + diemB);
        return ds;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diem{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
