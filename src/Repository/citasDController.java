package Repository;

import Service.registrarCita;
import static Service.registrarCita.jc_date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class citasDController {

    String turno = "", cliente = "", fecha_cita = "",
           hora_cita = "", doctor = "";

    public void capturar_datos() {
        turno = registrarCita.txt_turn.getText();
        cliente = registrarCita.txt_client.getText();
        fecha_cita = ((JTextField) jc_date.getDateEditor().getUiComponent()).getText();
        hora_cita = registrarCita.combo_hora.getSelectedItem().toString();
        doctor = registrarCita.txt_doctor.getText();
    }
public void mostrar_datos(){
    
    JOptionPane.showMessageDialog (null, "Cita registrada con exito\n"
    + "Turno:"+turno+"\n"+"Cliente: "+cliente+"\n"
    + "Fecha Cita: "+fecha_cita+"\n"+"Hora Cita: "+hora_cita+"\n"
    +"Doctor: " +doctor);

}
}