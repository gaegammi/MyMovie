
package com.example.mymovie.appclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Staffs {

    @SerializedName("staff")
    @Expose
    private List<Staff> staff = null;

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

}
