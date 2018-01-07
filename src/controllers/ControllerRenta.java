package controllers;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import views.View_RentaLocker;
import models.ModelRenta;
import models.ModelMain;

/**
 *
 * @author Briceyda Angeles
 */


public final class ControllerRenta implements FocusListener {
    private int guia_id_clientes = 0;
    private final ActionListener cambio_estado = (e -> jcb_id_cliente_click());
    private final ModelRenta model_renta;
    private final View_RentaLocker view_renta;
    private final ModelMain model_main;

    public ControllerRenta(Object[] models, Object[] views, Object[] controllers) {
        this.model_renta = (ModelRenta) models[4];
        this.view_renta = (View_RentaLocker) views[4];
        this.model_main = (ModelMain) models[0];
        initView();
    }

    public void initView() {
        view_renta.addFocusListener(this);
        view_renta.jbtn_primero.addActionListener(e -> jbtn_primero_click());
        view_renta.jbtn_ultimo.addActionListener(e -> jbtn_ultimo_click());
        view_renta.jbtn_agregar.addActionListener(e -> jbtn_agregar_click());
        view_renta.jbtn_editar.addActionListener(e -> jbtn_editar_click());
        view_renta.jbtn_eliminar.addActionListener(e -> jbtn_eliminar_click());
        view_renta.jbtn_nuevo.addActionListener(e -> jbtn_nuevo_click());
        view_renta.jbtn_siguiente.addActionListener(e -> jbtn_siguiente_click());
        view_renta.jbtn_anterior.addActionListener(e -> jbtn_anterior_click());
        view_renta.jbtn_agregar.setEnabled(false);
        view_renta.jcb_id_cliente.setEditable(false);

    }
    
    public void getValores() {
        view_renta.jcb_id_locker.setSelectedItem(model_renta.getId_locker());
        view_renta.jcb_id_cliente.setSelectedIndex(guia_id_clientes);
        view_renta.jtf_inicio.setText(model_renta.getFechaIn());
        view_renta.jtf_final.setText(model_renta.getFechaFin());
        view_renta.jtf_monto.setText(model_renta.getMonto());
    }
    
    public void setValores() {
        model_renta.setId_locker("" + view_renta.jcb_id_locker.getSelectedItem());
        model_renta.setId_cliente(view_renta.jcb_id_cliente.getSelectedIndex());
        model_renta.setFechaFin(view_renta.jtf_final.getText());
        model_renta.setFechaIn(view_renta.jtf_inicio.getText());
        model_renta.setMonto(view_renta.jtf_monto.getText());
    }   
    
    public void ActualizarInterfaz(){
        view_renta.jcb_id_cliente.removeActionListener(cambio_estado);
        model_renta.ActualizarComboLocker(view_renta.jcb_id_locker);
        model_renta.ActualizarComboClientes(view_renta.jcb_id_cliente);
        model_renta.ObtenerLocker();
        view_renta.jtb_renta.setModel(model_renta.getTabla_locker());
        model_renta.ObtenerRentas();
        view_renta.jtb_lockers_disp.setModel(model_renta.getTabla_rentas());
        getValores();
        view_renta.jcb_id_cliente.addActionListener(cambio_estado);
    }
    
    public void jbtn_nuevo_click(){
        view_renta.jcb_id_locker.setSelectedIndex(0);
        view_renta.jcb_id_cliente.setSelectedIndex(0);
        view_renta.jtf_inicio.setText("");
        view_renta.jtf_final.setText("");
        view_renta.jtf_monto.setText("");
        view_renta.jbtn_agregar.setEnabled(true); 
    }
    
    public void jbtn_agregar_click(){
        setValores();
        model_renta.insertar();
        ActualizarInterfaz();
    }
     
    public void jbtn_editar_click() {
        setValores();
        if (JOptionPane.showConfirmDialog(null, "Se modificará el registro ¿Desea continuar?",
                "Modificar registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            model_renta.modificar();
        }
        ActualizarInterfaz();
    }
    public void jcb_id_cliente_click(){
        model_renta.ObtenerTipoCliente("" + view_renta.jcb_id_cliente.getSelectedItem());
    }
    
    public void jbtn_eliminar_click(){
        setValores();
        if (JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿Desea continuar?",
        "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        model_renta.borrar();
        ActualizarInterfaz();
    }
    

     
     /******************************BOTONES NAVEGACION****************************/

    public void jbtn_primero_click(){
        model_main.Mover_Primero();
        model_renta.AsignarDatos();
        guia_id_clientes = 0;
        getValores();
    }
    
    public void jbtn_ultimo_click(){
        model_main.Mover_Ultimo();
        model_renta.AsignarDatos();
        guia_id_clientes = model_renta.getId_clientes().getItemCount();
        getValores();     
    }
    
    public void jbtn_anterior_click(){
        model_main.Mover_Anterior();
        model_renta.AsignarDatos();
        guia_id_clientes --;
        getValores();
    }
    public void jbtn_siguiente_click(){
        model_main.Mover_Siguiente();
        model_renta.AsignarDatos();
        guia_id_clientes ++;
        getValores();
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        ActualizarInterfaz();
        model_renta.ObtenerLocker();
        guia_id_clientes = 0;
    }

    @Override
    public void focusLost(FocusEvent e) {
        view_renta.jbtn_agregar.setEnabled(false);
    }
    
}