public class Ejercicio7 {
    public static void main(String[] args) {
        double v1, v2, v3, v4, v5, v6, v7, v8, v9;
        boolean respt;
        v1 = Math.sqrt(81);
        v2 = 9;
        v3 = 3;
        v4 = 9;
        v5 = 10;
        v6 = 1;
        v7 = 100;
        v8 = 25;
        v9 = Math.sqrt(100);
        respt =((v1+v2 / v3) == v4) || (v5 > v6) && ((v7/v8)>=v9);
        System.out.println("respt = " + respt);
    }
}
