package models;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Briceyda Angeles
 */
public class ModelRenta{
     private final ModelMain model_main;        

    public ModelRenta(ModelMain model_main){
        this.model_main = model_main;
    }
    
private String sql; 
    
    private String id_locker;
    private String id_cliente;
    private String nombre;
    private String fechafin;
    private String fechaini;
    private String monto;
    
    private int guia_id_clientes = 0;
    private List id_clientes = new List();
    private List id_lockers = new List();
    
    private TableModel tabla_locker;
    private TableModel tabla_rentas;
 
    private Connection conexion;
    public TableModel getTabla_locker(){
       return tabla_locker;
    }

    public TableModel getTabla_rentas() {
        return tabla_rentas;
    }
   
    public String getId_locker() {
        return id_locker;
    }

    public void setId_locker(String id_locker) {
        this.id_locker = id_locker;
    }
 
     public String getFechaIn() {
        return fechaini;
    }
     

    public void setId_cliente(int posicion) {
        id_cliente = id_clientes.getItem(posicion);
    }
    
    public String getId_cliente() {
        return id_cliente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setFechaIn(String fechaini) {
        this.fechaini = fechaini;
    }
    
    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getMonto() {
        return monto;
    }
    public void setMonto(String monto ) {
        this.monto = monto;
    }
    public String getFechaFin() {
        return fechafin;
    }
    public void setFechaFin(String fechafin) {
        this.fechafin = fechafin;
    }

    public List getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(List id_clientes) {
        this.id_clientes = id_clientes;
    }

    public int getGuia_id_clientes() {
        return guia_id_clientes;
    }

    public void setGuia_id_clientes(int guia_id_clientes) {
        this.guia_id_clientes = guia_id_clientes;
    }
    
    public void ObtenerLocker(){
        try{
        model_main.setSql("SELECT * FROM LOCKER;");
        model_main.Preparar_Statement();
        model_main.Ejecutar_Consulta_PS2();
        tabla_locker = DbUtils.resultSetToTableModel(model_main.getRs2());
        model_main.getRs2().first();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener locker: " + e);
        }
    }
    
    public void ObtenerRentas(){
        try{
            model_main.setSql("SELECT * FROM DETALLE_RENTA_LOCKER;");
            model_main.Preparar_Statement();
            model_main.Ejecutar_Consulta_PS();
            tabla_rentas = DbUtils.resultSetToTableModel(model_main.getRs());
            model_main.getRs().first();
            AsignarDatos();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener rentas: " + e);
        }
    }
    
    public void ActualizarComboLocker(javax.swing.JComboBox ComboLocker){
        try{
            model_main.setSql("SELECT * FROM LOCKER ORDER BY ID_LOCKER ASC;");
            model_main.Preparar_Statement();
            model_main.Ejecutar_Consulta_PS2();
            ComboLocker.removeAllItems();
            while(model_main.getRs2().next()){
                ComboLocker.addItem(model_main.getRs2().getString("ID_LOCKER"));
            }
            ComboLocker.setSelectedIndex(0);
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, "Error al actualizar el combo de locker: " + e);
        }
    }
    public void ActualizarComboClientes(javax.swing.JComboBox ComboCliente){
        String aux_union = "";
        try{
            model_main.setSql("select ID_CLIENTE, NOMBRE, APELLIDO_PA, APELLIDO_MA from cliente order by id_cliente asc;");
            model_main.Preparar_Statement();
            model_main.Ejecutar_Consulta_PS2();
            ComboCliente.removeAllItems();
            id_clientes.removeAll();
            while(model_main.getRs2().next()){
                aux_union += model_main.getRs2().getString("NOMBRE");
                aux_union += " " + model_main.getRs2().getString("APELLIDO_PA");
                aux_union += " " + model_main.getRs2().getString("APELLIDO_MA");
                ComboCliente.addItem(aux_union);
                id_clientes.add(model_main.getRs2().getString("ID_CLIENTE"));
                aux_union = "";
            }
            ComboCliente.setSelectedIndex(0);
        }
            catch(SQLException e){
                //
        }
    }
      
         public void ObtenerTipoCliente(String id_cliente) {
        try {
            model_main.setSql("select ID_CLIENTE from CLIENTE where ID_CLIENTE =?;");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_cliente);
            model_main.Ejecutar_Consulta_PS2();
            model_main.getRs2().first();
            id_cliente = model_main.getRs2().getString("ID_CLIENTE");
        } 
        catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "error 180" + e);
        }
    }
         
   public void AsignarDatos(){
        try{
            id_locker = model_main.getRs().getString("id_locker");
            id_cliente = model_main.getRs().getString("id_cliente");
            nombre = model_main.getRs().getString("nombre");
            fechaini = model_main.getRs().getString("FECHA_RENTA");
            fechafin = model_main.getRs().getString("FECHA_FIN_RENTA");
            monto=model_main.getRs().getString("monto");
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No Encuentra datos" + e);
        }
    }    
   
    public void insertar(){
        try{
            model_main.setSql("INSERT INTO LOCKERS_RENTADOS(ID_LOCKER, ID_CLIENTE, FECHA_RENTA, FECHA_FIN_RENTA, MONTO) VALUES (?,?,?,?,?);");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_locker);
            model_main.getPs().setString(2, id_cliente);
            model_main.getPs().setString(3, fechaini);
            model_main.getPs().setString(4, fechafin);
            model_main.getPs().setString(5, monto);
            model_main.Ejecutar_Actualizacion();
            ActualizarLockersDisponibles();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 108" + e);
        }
    }
    
    public void ActualizarLockersDisponibles(){
        try{
            model_main.setSql("UPDATE LOCKER SET DISPONIBLE = ? WHERE ID_LOCKER = ?;");
            model_main.Preparar_Statement();
            model_main.getPs().setBoolean(1, false);
            model_main.getPs().setString(2, id_locker);
            model_main.Ejecutar_Actualizacion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar lockers disponibles: "  + e);
        }
    }
    
    public void borrar(){
        try{
            model_main.setSql("DELETE FROM LOCKER WHERE id_locker = ?;");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_locker);
            model_main.Ejecutar_Actualizacion();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 109" + e);
        }
    }
    public void modificar(){
        try{
            model_main.setSql("UPDATE LOCKERS_RENTADOS SET ID_LOCKER=?, ID_CLIENTE=?,FECHA_RENTA=? FECHA_FIN_RENTA=?, MONTO=?,  WHERE ID_RENTA=?;");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_locker);
            model_main.getPs().setString(2, id_cliente);
            model_main.getPs().setString(3, fechaini);
            model_main.getPs().setString(4, fechafin);
            model_main.getPs().setString(5, monto);
            model_main.Ejecutar_Actualizacion();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 110" + e);
        }
    }
}