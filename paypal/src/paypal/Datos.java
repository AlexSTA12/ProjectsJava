/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paypal;

/**
 *
 * @author Ioan Alexandru Stanica
 * @version 1.10 07/02/2023
 */
public class Datos {

    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;
    private String contrase�a;

    /**
     * Constructor por defecto.
     */
    public Datos() {
        this.nombre = "";
        this.apellido = "";
        this.contrase�a = "";
        this.usuario = "";
        this.correo = "";
    }

    /**
     * Constructor de datos. Permite introducir los datos de la cuenta
     *
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param usuario Nombre de Usuario del cliente en la accede
     * @param contrase�a Contrase�a del cliente
     * @param correo Correo Electronico del cliente
     */
    public Datos(String nombre, String apellido, String usuario, String contrase�a, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrase�a = contrase�a;
        this.correo = correo;
    }

    /**
     * Guardar Datos. Permite guardar los datos de la cuenta
     *
     * @param nombre Guardar nombre
     * @param apellido Guardar apellido
     * @param contrase�a Guardar contrase�a
     * @param correo Guardar correo
     * @deprecated A partir de la version 1.1
     */
    public void guardarDatos(String nombre, String apellido, String contrase�a, String correo) {
        this.setUsuario(nombre);
        this.setApellido(apellido);
        this.setContrase�a(contrase�a);
        this.setCorreo(correo);
    }

    /**
     * Comparar Datos. Permite compara los usuarios y las contrase�as
     *
     * @param usuario nombre de usuario del cliente
     * @param contrase�a contrase�a del cliente
     * @return <true>Si es mismo</true><br>
     * <false>Si no es lo mismo</false>
     * @deprecated A partir de la version 1.1
     */
    public boolean compararDatos(String usuario, String contrase�a) {
        if (usuario.equals(this.usuario) && contrase�a.equals(this.contrase�a)) {
            return true;
        } else {
            return false;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

}
