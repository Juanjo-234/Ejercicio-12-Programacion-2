class envioPaquete{

    String destinatario;
    String tamaño;
   double peso;
    String codigoEnvio;
    String direccion;

    public envioPaquete(String destinatario, String tamaño, double peso, String codigoEnvio, String direccion ){

this.destinatario = destinatario;
this.tamaño = tamaño;
this.peso = peso;
this.codigoEnvio = codigoEnvio;
this.direccion = direccion;

    }


void estado(int estado){
if(estado == 1){
    System.out.println("================================");
    System.out.println("En camino");
}else{
    if(estado == 0){
    System.out.println("Recibido");
}
}
}

void calcularCosto(int paquetes){

float total = paquetes * 1150;
System.out.println("Costo total: " + total);
System.out.println("================================");
System.out.println("--------------------------------");
}

void mostrarInformacion(){
System.out.println("================================");
System.out.println("Destinatario: " + destinatario);
System.out.println("Tamaño de paquete: " + tamaño);
System.out.println("Peso: " + peso);
System.out.println("Codigo de envío: " + codigoEnvio);
System.out.println("Direccion: " + direccion);
System.out.println("================================");
}

public static void main(String[] args) {
    
envioPaquete en1 = new envioPaquete("Jose Gonzales", "Mediano", 20.3, "EDF475N21N", "San martin-Mendoza");
envioPaquete en2 = new envioPaquete("Pepe Sanchez", "Pequeño", 15, "ZGE8354SDFL4L", "La plata-Buenos Aires");

en1.estado(1);
en1.mostrarInformacion();
en1.estado(0);
en1.mostrarInformacion();
en1.calcularCosto(3);

en2.estado(1);
en2.mostrarInformacion();
en2.estado(0);
en2.mostrarInformacion();
en2.calcularCosto(10);

}
   
}