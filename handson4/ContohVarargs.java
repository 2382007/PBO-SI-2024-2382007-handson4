package handson4;

public class ContohVarargs {
    public static int jumlahkan(int... kumpulkanAngka) {
        int total = 0;
        for (int nilai : kumpulkanAngka){
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        int hasil = jumlahkan(1,2,3);
        System.out.println("Hasil : " + hasil);
    }
}
