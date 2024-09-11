package Kalkulator;

public class Kalkulator {
    private double angka1;
    private double angka2;
    private char operator;
    private boolean valid;
    private String errorMessage;

    public Kalkulator(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
        this.valid = true;
        this.errorMessage = "";
    }

    public double hitung() {
        double hasil = 0;
        valid = true;
        errorMessage = "";
        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    valid = false;
                    errorMessage = "Error: Pembagian dengan nol tidak diizinkan.";
                }
                break;
            default:
                valid = false;
                errorMessage = "Error: Operator tidak valid. Gunakan +, -, *, /.";
                break;
        }
        return valid ? hasil : 0;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}

