public class carro extends veihculo {
    
    public carro(String marca, String modelo, int anio, int numeroPuertas, int numeroLlantas, String gatoLateral){
        super(marca, modelo, anio, numeroPuertas, numeroLlantas, gatoLateral);
        this.numeroPuertas = numeroPuertas;

        
    }

    public void endo() {
            System.out.println("el carro cuenta ¿con este numero de puertas?" + numeroPuertas);
        }
}
