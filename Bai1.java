import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin
        System.out.println("NHẬP THÔNG TIN HÓA ĐƠN");
        System.out.print("Nhập tên khách hàng: ");
        String customer = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String product = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng mua: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Khách có thẻ thành viên. (true/false): ");
        boolean isMember = Boolean.parseBoolean(sc.nextLine());

        // Tính toán
        double amount = price * quantity;
        double discount = isMember ? amount * 0.1 : 0;
        double vat = (amount - discount) * 0.08;
        double total = amount - discount + vat;

        // In hóa đơn
        System.out.println("\n========== HÓA ĐƠN ==========");
        System.out.println("Khách hàng : " + customer);
        System.out.println("Sản phẩm   : " + product);
        System.out.println("Số lượng   : " + quantity);
        System.out.printf("Đơn giá    : %, .000f VND\n", price);
        System.out.printf("Thành tiền : %, .000f VND\n", amount);
        System.out.printf("Giảm giá   : %, .000f VND\n", discount);
        System.out.printf("Tiền VAT   : %, .000f VND\n", vat);
        System.out.printf("Tổng thanh toán: %, .000f VND\n", total);
    }
}