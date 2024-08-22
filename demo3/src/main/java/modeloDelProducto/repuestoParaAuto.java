package modeloDelProducto;
public class repuestoParaAuto {
    String idRepuesto;
    String nombre;
    String descripcion;
    String tipo;
    String marca;
    String modelo;
    Integer año;
    String compatibilidad;
    Double precio;
    Integer stock;
    String peso;
    String dimensiones;
    String material;
    //String garantia;
    //String imagen;

    public void setIdRepuesto(String idRepuesto) {
        this.idRepuesto = idRepuesto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(Integer año) {
        this.año = año;
    }
    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getIdRepuesto() {
        return idRepuesto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Integer getAño() {
        return año;
    }
    public String getCompatibilidad() {
        return compatibilidad;
    }
    public Double getPrecio() {
        return precio;
    }
    public Integer getStock() {
        return stock;
    }
    public String getPeso() {
        return peso;
    }
    public String getDimensiones() {
        return dimensiones;
    }
    public String getMaterial() {
        return material;
    }
    /*public String mostrarPorConsola() {
        StringBuilder s = new StringBuilder();
        s.append("idRepuesto: ").append(getIdRepuesto()).append("\n").
        append("nombre: ").append(getNombre()).append("\n").
        append("descripcion: ").append(getDescripcion()).append("\n").
        append("tipo: ").append(getTipo()).append("\n").
        append("marca: ").append(getMarca()).append("\n").
        append("modelo: ").append(getModelo()).append("\n").
        append("año: ").append(getAño()).append("\n").
        append("compatibilidad: ").append(getCompatibilidad()).append("\n").
        append("precio: ").append(getPrecio()).append("\n").
        append("stock: ").append(getStock()).append("\n").
        append("peso: ").append(getPeso()).append("\n").
        append("dimensiones: ").append(getDimensiones()).append("\n").
        append("material: ").append(getMaterial()).append("\n");
        return s.toString();
    }*/
    

    
/* 

    public static void main(String[] args) {
        repuestoParaAuto r1 = new repuestoParaAuto();
        r1.setIdRepuesto("001");
        r1.setNombre("Filtro de aceite");
        r1.setDescripcion("Filtro de aceite para motores a gasolina");
        r1.setTipo("Filtro");
        r1.setMarca("Bosch");
        r1.setModelo("34567");
        r1.setAño(2022);
        r1.setCompatibilidad("Toyota Corolla 2015-2020, Honda Civic 2016-2021");
        r1.setPrecio(25.99);
        r1.setStock(50);
        r1.setPeso("0.5 kg");
        r1.setDimensiones("10 cm x 5 cm x 5cm");
        r1.setMaterial("Carton y goma");
        //r1.mostrar();
    }
*/

}

