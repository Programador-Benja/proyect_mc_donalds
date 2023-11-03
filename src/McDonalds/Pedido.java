
package McDonalds;

public class Pedido {
    private int idproducto;
    private String tipo;
    private String descripcion;
    private double precio;
    
    public Pedido(){
        
    }
    
    public Pedido(int idproducto, String tipo, String descripcion, double precio) {
        this.idproducto = idproducto;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
