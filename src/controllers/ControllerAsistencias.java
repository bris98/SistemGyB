/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import views.View_Asistencia;
import models.ModelAsistencias;
import models.ModelMain;


/**
 *
 * @author Briceyda Angeles
 */
public final class ControllerAsistencias  implements FocusListener {
    private final ModelAsistencias model_asistencia;
    private final View_Asistencia view_asistencia;
    private final ModelMain model_main;
    
     public ControllerAsistencias(Object models[], Object views[], Object controllers[]) {
        this.model_asistencia = (ModelAsistencias) models[3];
        this.view_asistencia = (View_Asistencia) views[3];
        this.model_main = (ModelMain) models[0];
        initView();
    
    }
     public void initView(){
         view_asistencia.addFocusListener(this);
         //botones 
     }
     public void getValores(){
         
     }
     public void setValores(){
    public void fechas() {
             try{
     int as = Integer.parseInt(jtf_id_cliente.getText());
    String sql = "SELECT MEMBRESIA.FECHA_FINAL,CLIENTE.NOMBRE from MEMBRESIA  INNER JOIN CLIENTE ON MEMBRESIA.ID_CLIENTE = CLIENTE.ID_CLIENTE WHERE MEMBRESIA.ID_CLIENTE = "+as;
    System.out.println(sql);
    rs=st.executeQuery(sql);
    rs.first();
    this.jtf_fecha_vencimiento.setText(rs.getString("FECHA_FINAL"));

    String sqll = "select * from ASISTENCIA where ID_CLIENTE ='" + as+"'";
    System.out.println(sqll);
    rs=st.executeQuery(sqll);
    rs.first();
    this.jtf_fecha_actual.setText(rs.getString("FECHA_ASISTENCIA"));
    
    String Fecha_Vencimiento =jtf_fecha_vencimiento.getText();
    String Fecha_Actual = jtf_fecha_actual.getText();
    
    JOptionPane.showMessageDialog(null, "FAVOR DE RENOVAR TU MEMBRESIA");

    if (Fecha_Vencimiento.equals(Fecha_Actual)) {
            System.out.println("WORKING");
            JOptionPane.showMessageDialog(null, "FAVOR DE RENOVAR TU MEMBRESIA");

}
             } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
}
    public void fechafinal() {
    try{
     int as = Integer.parseInt(jtf_id_cliente.getText());
    String sql = "select * from MEMBRESIA ";
    System.out.println(sql);
    rs=st.executeQuery(sql);
    rs.first();
    this.jtf_fecha_vencimiento.setText(rs.getString("FECHA_FINAL"));

    String sqll = "select * from ASISTENCIA where ID_CLIENTE ='" + as+"'";;
    System.out.println(sqll);
    rs=st.executeQuery(sqll);
    rs.first();
    this.jtf_fecha_actual.setText(rs.getString("FECHA_ASISTENCIA"));
    
    String Fecha_Vencimiento =jtf_fecha_vencimiento.getText();
    String Fecha_Actual = jtf_fecha_actual.getText();
    
    JOptionPane.showMessageDialog(null, "FAVOR DE RENOVAR TU MEMBRESIA");

    if (Fecha_Vencimiento.equals(Fecha_Actual)) {
            System.out.println("WORKING");
            JOptionPane.showMessageDialog(null, "FAVOR DE RENOVAR TU MEMBRESIA");

}
             } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
}
