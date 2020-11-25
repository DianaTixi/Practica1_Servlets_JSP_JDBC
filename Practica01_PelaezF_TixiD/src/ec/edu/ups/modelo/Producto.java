package ec.edu.ups.modelo;

public class Producto {
	private int productoId;
    private String productoNombre;
    private String productoDescripcion; 
    private int productoStock;
    private double productoPrecioVenta;
    private Categoria categoria;
    
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public String getProductoNombre() {
		return productoNombre;
	}
	public void setProductoNombre(String productoNombre) {
		this.productoNombre = productoNombre;
	}
	public String getProductoDescripcion() {
		return productoDescripcion;
	}
	public void setProductoDescripcion(String productoDescripcion) {
		this.productoDescripcion = productoDescripcion;
	}
	public int getProductoStock() {
		return productoStock;
	}
	public void setProductoStock(int productoStock) {
		this.productoStock = productoStock;
	}
	public double getProductoPrecioVenta() {
		return productoPrecioVenta;
	}
	public void setProductoPrecioVenta(double productoPrecioVenta) {
		this.productoPrecioVenta = productoPrecioVenta;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
}
