 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Briceyda Angeles
 */
public class ModelAsistencias {
    private final ModelMain model_main;
    
    public ModelAsistencias(ModelMain model_main){
        this.model_main = model_main;
    }

    private String id_cliente;
    private TableModel jtabla;
    java.util.Date date = new java.util.Date();
    String fecha_actual = new SimpleDateFormat("YYYY/MM/dd").format(date);
    private String fecha_vencimiento;
    
    
    
    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public TableModel getJtabla() {
        return jtabla;
    }

    public void setJtabla(TableModel jtabla) {
        this.jtabla = jtabla;
    }

    public String getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public void ObtenerAsistencias(){
        try{
            model_main.setSql("SELECT * FROM ASISTENCIA WHERE FECHA_ASISTENCIA = ?;");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1,fecha_actual);
            model_main.Ejecutar_Consulta_PS();
            jtabla = DbUtils.resultSetToTableModel(model_main.getRs());
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener asistencias actuales: "  + e);
        }
    }
    
    public void RegistrarAsistencia(){
        try{
            if(Verificar_Membresia()){
            model_main.setSql("INSERT INTO ASISTENCIA(ID_CLIENTE, FECHA_ASISTENCIA, ASISTENCIA) VALUES(?, ?, ?);");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_cliente);
            model_main.getPs().setString(2, fecha_actual);
            model_main.getPs().setBoolean(3, true);
            model_main.Ejecutar_Actualizacion();
            }
            else{
                
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar asistencia: " + e);
        }
    }
    
    public boolean Verificar_Membresia(){
        boolean membresia_verificada = false; 
        try{
            model_main.setSql("SELECT FECHA_FINAL FROM MEMBRECIA WHERE ID_CLIENTE = ? ORDER BY ID_MEMBRECIA ASC;");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, id_cliente);
            model_main.Ejecutar_Consulta_PS();
            model_main.getRs().last();
            fecha_vencimiento = new SimpleDateFormat("YYYY/MM/dd").format(model_main.getRs().getDate("FECHA_FINAL"));
            
            if(fecha_actual.equals(fecha_vencimiento)){
                JOptionPane.showMessageDialog(null, "FAVOR DE RENOVAR TU MEMMBRESIA");
                membresia_verificada = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
                membresia_verificada = true;
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al verificar membresia: " + e);
        }
        return membresia_verificada;
    }
    
}
