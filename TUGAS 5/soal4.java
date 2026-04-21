class OperasiMatematika{
    int tambah (int a, int b){
        return a + b;
    }
    
    int tambah (int a, int b, int c){
        return a + b + c;
    }

    int tambah (double a, double b){
        return (int)(a + b);
    }
}

class soal4 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        OperasiMatematika op = new OperasiMatematika();
        System.out.println("Hasil penjumlahan dua bilangan: " + op.tambah(a, b));
        System.out.println("Hasil penjumlahan tiga bilangan: " + op.tambah(a, b, c));
        System.out.println("Hasil penjumlahan dua bilangan desimal: " + op.tambah(5.5, 10.5));
    }
}