/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saving_to_usb.to;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mijzcx
 */
public class to_data implements Serializable {
    
    // should be same package and class of data ang e save ug open.
    
    // as long as it is serializable
    // pwede sad final, any object basta ni implements ug Serializable
    
    private String s_data;
    private int i_data;
    private double d_data;
    private Date dt_data;
    private boolean b_data;

    public to_data(String s_data, int i_data, double d_data, Date dt_data, boolean b_data) {
        this.s_data = s_data;
        this.i_data = i_data;
        this.d_data = d_data;
        this.dt_data = dt_data;
        this.b_data = b_data;
    }

    public to_data() {
    }

    public boolean isB_data() {
        return b_data;
    }

    public void setB_data(boolean b_data) {
        this.b_data = b_data;
    }

    public double getD_data() {
        return d_data;
    }

    public void setD_data(double d_data) {
        this.d_data = d_data;
    }

    public Date getDt_data() {
        return dt_data;
    }

    public void setDt_data(Date dt_data) {
        this.dt_data = dt_data;
    }

    public int getI_data() {
        return i_data;
    }

    public void setI_data(int i_data) {
        this.i_data = i_data;
    }

    public String getS_data() {
        return s_data;
    }

    public void setS_data(String s_data) {
        this.s_data = s_data;
    }

    
    @Override
    public String toString() {
        return "to_data{" + "s_data=" + s_data + ", i_data=" + i_data + ", d_data=" + d_data + ", dt_data=" + dt_data + ", b_data=" + b_data + '}';
    }

   
    
    
}
