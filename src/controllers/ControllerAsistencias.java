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
 * 
 */

public class ControllerAsistencias implements FocusListener{
    private final ModelAsistencias model_asistencias;
    private final View_Asistencia view_asistencia;
    
    public ControllerAsistencias(Object models[], Object views[], Object controllers[]){
        this.model_asistencias = (ModelAsistencias)models[5];
        this.view_asistencia = (View_Asistencia)views[5];
        initView();
    }
    
    public void initView(){
        Definir_Action_Listeners();
    }
    
    public void Definir_Action_Listeners(){
        view_asistencia.addFocusListener(this);
        view_asistencia.jbtn_checar.addActionListener(e -> jbtn_checar_click());
    }
    
    public void ActualizarTabla(){
        model_asistencias.ObtenerAsistencias();
        view_asistencia.jtb_asistencia.setModel(model_asistencias.getJtabla());
    }
    
    public void getValores(){
        
    }
    
    public void setValores(){
        model_asistencias.setId_cliente(view_asistencia.jtf_id_cliente.getText());
    }
    
    public void jbtn_checar_click(){
        setValores();
        model_asistencias.RegistrarAsistencia();
        ActualizarTabla();
    }

    @Override
    public void focusGained(FocusEvent e) {
        ActualizarTabla();
    }

    @Override
    public void focusLost(FocusEvent e) {
        
    }

}