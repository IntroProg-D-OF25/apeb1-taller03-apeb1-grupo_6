public class Ejercicio10 {
    public static void main(String[] args) {
        double v1, v2, v3, v4, v5, v6;
        boolean v7, v8, respuesta;
        v1 = Math.sqrt(25);
        v2 = 10;
        v3 = 100;
        v4 = 10;
        v5 = 5;
        v6 = 2;
        v7 = true;
        v8 = false;
        respuesta = ((v1 * v2 >= v3) && (v7) || (v8) || (v4 / v5 >= v6));
        System.out.println("respuesta = " + respuesta);
        
    }
}
