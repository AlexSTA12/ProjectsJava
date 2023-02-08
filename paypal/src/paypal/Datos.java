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
    private String contraseña;

    /**
     * Constructor por defecto.
     */
    public Datos() {
        this.nombre = "";
        this.apellido = "";
        this.contraseña = "";
        this.usuario = "";
        this.correo = "";
    }

    /**
     * Constructor de datos. Permite introducir los datos de la cuenta
     *
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param usuario Nombre de Usuario del cliente en la accede
     * @param contraseña Contraseña del cliente
     * @param correo Correo Electronico del cliente
     */
    public Datos(String nombre, String apellido, String usuario, String contraseña, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    /**
     * Guardar Datos. Permite guardar los datos de la cuenta
     *
     * @param nombre Guardar nombre
     * @param apellido Guardar apellido
     * @param contraseña Guardar contraseña
     * @param correo Guardar correo
     * @deprecated A partir de la version 1.1
     */
    public void guardarDatos(String nombre, String apellido, String contraseña, String correo) {
        this.setUsuario(nombre);
        this.setApellido(apellido);
        this.setContraseña(contraseña);
        this.setCorreo(correo);
    }

    /**
     * Comparar Datos. Permite compara los usuarios y las contraseñas
     *
     * @param usuario nombre de usuario del cliente
     * @param contraseña contraseña del cliente
     * @return <true>Si es mismo</true><br>
     * <false>Si no es lo mismo</false>
     * @deprecated A partir de la version 1.1
     */
    public boolean compararDatos(String usuario, String contraseña) {
        if (usuario.equals(this.usuario) && contraseña.equals(this.contraseña)) {
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
