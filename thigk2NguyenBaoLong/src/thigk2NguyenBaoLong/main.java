package thigk2NguyenBaoLong;

import java.util.ArrayList;
import java.util.Scanner;

import thigk2NguyenBaoLong.bai2.SanPham;

public class main {

    /*
     * TÓM TẮT CÁCH GIẢI:
     * - Tạo lớp SanPham gồm: mã, tên, loại, giá
     * - Tạo ArrayList để lưu danh sách sản phẩm
     * - Thêm sẵn 3 sản phẩm vào danh sách
     * - Nhập thêm 1 sản phẩm từ bàn phím
     * - In toàn bộ danh sách sản phẩm
     * - Lọc và in các sản phẩm có loại "Thuc pham chuc nang"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> ds = new ArrayList<>();

        // Thêm sẵn 3 sản phẩm
        ds.add(new SanPham("SP01", "Vitamin C", "Thuc pham chuc nang", 100));
        ds.add(new SanPham("SP02", "Sua tuoi", "Thuc pham", 30));
        ds.add(new SanPham("SP03", "Omega 3", "Thuc pham chuc nang", 200));

        // Nhập thêm 1 sản phẩm
        System.out.print("Nhap ma SP: ");
        String ma = sc.nextLine();

        System.out.print("Nhap ten SP: ");
        String ten = sc.nextLine();

        System.out.print("Nhap loai SP: ");
        String loai = sc.nextLine();

        System.out.print("Nhap gia: ");
        double gia = sc.nextDouble();

        ds.add(new SanPham(ma, ten, loai, gia));

        // In danh sách
        System.out.println("\nDanh sach san pham:");
        for (SanPham sp : ds) {
            sp.hienThi();
        }

        // Lọc theo loại
        System.out.println("\nSan pham loai 'Thuc pham chuc nang':");
        for (SanPham sp : ds) {
            if (sp.getLoaiSP().equalsIgnoreCase("Thuc pham chuc nang")) {
                sp.hienThi();
            }
        }

        sc.close();
    }
}