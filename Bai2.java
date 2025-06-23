import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        while (true) {
            System.out.println("\n***************MENU NHẬP ĐIỂM***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Nhập điểm học viên
                    while (true) {
                        System.out.print("Nhập điểm học viên (-1 để kết thúc): ");
                        double score = sc.nextDouble();
                        if (score == -1) break;
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ! Vui lòng nhập lại (0-10).");
                            continue;
                        }
                        scores.add(score);
                        // Xếp loại học lực
                        if (score < 5) {
                            System.out.println("Xếp loại: Yếu");
                        } else if (score < 7) {
                            System.out.println("Xếp loại: Trung Bình");
                        } else if (score < 8) {
                            System.out.println("Xếp loại: Khá");
                        } else if (score < 9) {
                            System.out.println("Xếp loại: Giỏi");
                        } else {
                            System.out.println("Xếp loại: Xuất sắc");
                        }
                    }
                    break;
                case 2:
                    // Hiển thị thống kê
                    if (scores.isEmpty()) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double sum = 0, max = scores.get(0), min = scores.get(0);
                        for (double s : scores) {
                            sum += s;
                            if (s > max) max = s;
                            if (s < min) min = s;
                        }
                        System.out.println("Số học viên đã nhập: " + scores.size());
                        System.out.printf("Điểm trung bình: %.2f\n", sum / scores.size());
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}