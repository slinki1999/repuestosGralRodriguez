package modeloDelProducto;
public class repuestoParaAuto {
    String codigo;          // ¿Codigo identificador del repuesto?
    String tipo;            //¿Que tipo de repuesto es ?
    String marcaRepuesto;   // Marca del fabricante de repuesto
    //String marcaAuto;       // Marca de los autos que sirve el repuesto
    //String modelo;          // Modelo del auto        //
    String descripcion;     //
    String stock;          // disponible o no disponible? en el local
    Double precio;
    //String tipo;
    //String marca;
    //String modelo;
    //Integer año;
    //String compatibilidad;
    //Double precio;
    //Integer stock;
    //String peso;
    //String dimensiones;
    //String material;
    //String garantia;
    //String imagen;

    public repuestoParaAuto() {
    }


    public repuestoParaAuto(String codigo, String tipo, String marcaRepuesto, String descripcion, String stock, Double precio) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marcaRepuesto = marcaRepuesto;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarcaRepuesto(String marcaRepuesto) {
        this.marcaRepuesto = marcaRepuesto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getStock() {
        return stock;
    }

    public Double getPrecio() {
        return precio;
    }



}

