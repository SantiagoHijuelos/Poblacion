import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Queue<ObjCenso> Ingresar(Queue<ObjCenso> A) {
        ObjCenso ce = new ObjCenso();
        System.out.println("Ingrese Nombre: ");
        ce.setNombre(sc.next());
        System.out.println("Ingrese Cedula: ");
        ce.setCedula(sc.next());
        System.out.println("Ingrese la edad: ");
        ce.setEdad(sc.nextInt());
        System.out.println("Ingrese Auxilio: ");
        ce.setAuxilio(sc.next());
        System.out.println("Ingrese si es Desplazado:");
        ce.setEsDesplazado(sc.next());
        System.out.println("Ingrese el estrato: ");
        ce.setEstrato(sc.next());
        A.offer(ce);

        return A;
    }

    public boolean ValidarDesplazamiento(Queue<ObjCenso> A, String Cedula) {
        boolean es = true;

        if (A.ValidarDesplazamiento()) {
            for (ObjCenso o : A) {
                if (o.getCedula().equalsIgnoreCase(Cedula)) {
                    if (o.getEsDesplazado() == true) {
                        return true;
                    } else {
                        return false;
                    }
                }

            }
        }
    }

    public EstAuxilio (Queue<ObjCenso> A)
    {
        for (ObjCenso objCenso : A) {
            if (o.getEdad() < 18) {
                o.setEdad(1400000 * .8);
            } else {
                o.setEdad(1400000);
                return A;
            }
        }
    }
    public Queue<ObjCenso> modificar(Queue<ObjCenso> A) {
        String dato = "";
        System.out.println("Ingrese el dato que desea modificar");
        dato= sc.next();
        for (ObjCenso o : A) {
            if(o.getNombre().equalsIgnoreCase(dato))
            {System.out.println("Ingrese si es desplazado");
            o.setEsDesplazado(sc.next());
            System.out.println("Ingrese si tiene auxilio");
            o.setAuxilio(sc.next());
            }
           
        }
        return A;
    }
 
}
