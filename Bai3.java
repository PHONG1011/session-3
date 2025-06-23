import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();
        while (true) {
            System.out.println("\n***************MENU NHẬP LƯƠNG***************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Nhập lương nhân viên
                    while (true) {
                        System.out.print("Nhập lương nhân viên (-1 để kết thúc): ");
                        double salary = sc.nextDouble();
                        if (salary == -1) break;
                        if (salary < 0 || salary > 500_000_000) {
                            System.out.println("Lương không hợp lệ! Vui lòng nhập lại (0 - 500 triệu).");
                            continue;
                        }
                        salaries.add(salary);
                        // Phân loại lương
                        if (salary < 5_000_000) {
                            System.out.println("Thu nhập thấp");
                        } else if (salary < 15_000_000) {
                            System.out.println("Thu nhập trung bình");
                        } else if (salary < 50_000_000) {
                            System.out.println("Thu nhập khá");
                        } else {
                            System.out.println("Thu nhập cao");
                        }
                    }
                    break;
                case 2:
                    // Hiển thị thống kê
                    if (salaries.isEmpty()) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double sum = 0, max = salaries.get(0), min = salaries.get(0);
                        for (double s : salaries) {
                            sum += s;
                            if (s > max) max = s;
                            if (s < min) min = s;
                        }
                        System.out.println("Số nhân viên đã nhập: " + salaries.size());
                        System.out.printf("Lương trung bình: %.2f\n", sum / salaries.size());
                        System.out.printf("Lương cao nhất: %.2f\n", max);
                        System.out.printf("Lương thấp nhất: %.2f\n", min);
                        System.out.printf("Tổng tiền lương: %.2f\n", sum);
                    }
                    break;
                case 3:
                    // Tính tổng số tiền thưởng
                    if (salaries.isEmpty()) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double totalBonus = 0;
                        for (double s : salaries) {
                            double bonus = 0;
                            if (s < 5_000_000) {
                                bonus = s * 0.05;
                            } else if (s < 15_000_000) {
                                bonus = s * 0.10;
                            } else if (s < 50_000_000) {
                                bonus = s * 0.15;
                            } else if (s < 100_000_000) {
                                bonus = s * 0.20;
                            } else {
                                bonus = s * 0.25;
                            }
                            totalBonus += bonus;
                        }
                        System.out.printf("Tổng số tiền thưởng cho nhân viên: %.2f\n", totalBonus);
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}