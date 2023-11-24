public class Jogos{
    //creacion de los atributos
    public String nombre;
    public int fecha_salida;
    public String compañia;
    public String protagonista;
    //creando los emtodos
    public void Informacion(){
        System.out.println("Esta es la informacion: "+nombre+"/"+fecha_salida+"/"+compañia+"/"+protagonista);
    }
    public void divesion(){
        System.out.println("Este juego es muy divertido y la lady lo ha jugado");
    }
    public void nojugado(){
        System.out.println("Este juego es muy divertido y la lady no lo ha jugado");
    }
    //crear los valores del objeto
    public Jogos(String nombre, int fecha_salida, String compañia,
                 String protagonista){
        this.nombre=nombre;
        this.fecha_salida=fecha_salida;
        this.compañia=compañia;
        this.protagonista=protagonista;
    }
    public static void main(String[]args){
        //crear objetos
        Jogos juego1 =new Jogos("Super Mario", 1985, "Nintendo",
                "Mario");
        Jogos juego2 =new Jogos("Sonic the Hedgehog", 1991, "Sega",
                "Sonic");
        Jogos juego3 =new Jogos("Ace Attorney", 2001, "Capcom",
                "Phoenix Wright");
        //llamar a los metodos
        juego1.Informacion();
        juego2.Informacion();
        juego3.Informacion();
        juego1.divesion();
        juego2.divesion();
        juego3.nojugado();
    }
}