 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

/**
 *
 * @author EdgarXochipaMejia
 */
@Named(value = "ctrlCalculadora")
@RequestScoped
public class CtrlCalculadora {

    private int cal1;
    private int cal2;
    private int cal3;
    private int cal4;
    private int cal5;

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }

    public int getCal4() {
        return cal4;
    }

    public void setCal4(int cal4) {
        this.cal4 = cal4;
    }

    public int getCal5() {
        return cal5;
    }

    public void setCal5(int cal5) {
        this.cal5 = cal5;
    }

   
    public void prome() {
        final String prome = " La Calificacion final es: " + ((getCal1() + getCal2() + getCal3() +getCal4() + getCal5())/5  + ".");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(prome));
    }

}
