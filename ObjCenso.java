public class ObjCenso {
 
    private String Nombre;
    private String Cedula;
    private int Edad;
    private String Auxilio;
    private Boolean EsDesplazado;
    private String Estrato;
 
    public ObjCenso() {
    }
 
    public ObjCenso(String nombre, String cedula, int edad, String auxilio, Boolean esDesplazado, String estrato){
 
        Nombre = nombre;
        Cedula = cedula;
        Edad = edad;
        Auxilio = auxilio;
        EsDesplazado = esDesplazado;
        Estrato = estrato;

        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getAuxilio() {
        return Auxilio;
    }

    public void setAuxilio(String auxilio) {
        Auxilio = auxilio;
    }

    public Boolean getEsDesplazado() {
        return EsDesplazado;
    }

    public void setEsDesplazado(Boolean esDesplazado) {
        EsDesplazado = esDesplazado;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setEstrato(String estrato) {
        Estrato = estrato;
    }
 
}