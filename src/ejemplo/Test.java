package ejemplo;

public class Test {

    private int numeroEntero;//0
    private double numeroReal;//0.0
    private boolean esCierto;//false
    private char caracter;//
    private String nomnbre;//null
    private Object s;

    @Override
    public String toString() {
        return "Test{" +
                "numeroEntero=" + numeroEntero +
                ", numeroReal=" + numeroReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nomnbre='" + nomnbre + '\'' +
                ", s=" + s +
                '}';
    }
}
