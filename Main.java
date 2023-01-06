public class Main {
 
    public static void main(String[] args) {
        int resultado;
        resultado = suma( 1,3,6 );
        System.out.println(resultado);

        Coche miCoche = new Coche(4);
        miCoche.agregarPuerta();
        System.out.println(miCoche.getNumeroDePuertas());
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coche {
        private int numeroDePuertas;
        public Coche(int numeroDePuertas) {
          this.numeroDePuertas = numeroDePuertas;
        }
        public void agregarPuerta() {
          numeroDePuertas++;
        }
        public int getNumeroDePuertas() {
          return numeroDePuertas;
        }
      }
      

}
