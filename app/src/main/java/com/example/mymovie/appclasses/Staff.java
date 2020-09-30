
package com.example.mymovie.appclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Staff {

    @SerializedName("staffNm")
    @Expose
    private String staffNm;
    @SerializedName("staffEnNm")
    @Expose
    private String staffEnNm;
    @SerializedName("staffRoleGroup")
    @Expose
    private String staffRoleGroup;
    @SerializedName("staffRole")
    @Expose
    private String staffRole;
    @SerializedName("staffEtc")
    @Expose
    private String staffEtc;
    @SerializedName("staffId")
    @Expose
    private String staffId;

    public String getStaffNm() {
        return staffNm;
    }

    public void setStaffNm(String staffNm) {
        this.staffNm = staffNm;
    }

    public String getStaffEnNm() {
        return staffEnNm;
    }

    public void setStaffEnNm(String staffEnNm) {
        this.staffEnNm = staffEnNm;
    }

    public String getStaffRoleGroup() {
        return staffRoleGroup;
    }

    public void setStaffRoleGroup(String staffRoleGroup) {
        this.staffRoleGroup = staffRoleGroup;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public String getStaffEtc() {
        return staffEtc;
    }

    public void setStaffEtc(String staffEtc) {
        this.staffEtc = staffEtc;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

}
