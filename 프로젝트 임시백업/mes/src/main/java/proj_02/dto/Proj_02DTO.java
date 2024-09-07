package proj_02.dto;

import java.sql.Date;

public class Proj_02DTO {

    private String equipment_number;
    private String equipment_code;
    private String fault_code;
    private String equipment_name;
    private String repair_company;
    private String repairer;
    private String location;
    private String manager;
    private Date repair_date;
    private String remarks;

    // Getter와 Setter 메소드
    public String getEquipment_number() {
        return equipment_number;
    }

    public void setEquipment_number(String equipment_number) {
        this.equipment_number = equipment_number;
    }

    public String getEquipment_code() {
        return equipment_code;
    }

    public void setEquipment_code(String equipment_code) {
        this.equipment_code = equipment_code;
    }

    public String getFault_code() {
        return fault_code;
    }

    public void setFault_code(String fault_code) {
        this.fault_code = fault_code;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getRepair_company() {
        return repair_company;
    }

    public void setRepair_company(String repair_company) {
        this.repair_company = repair_company;
    }

    public String getRepairer() {
        return repairer;
    }

    public void setRepairer(String repairer) {
        this.repairer = repairer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Date getRepair_date() {
        return repair_date;
    }

    public void setRepair_date(Date repair_date) {
        this.repair_date = repair_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "proj_02DTO [equipment_number=" + equipment_number + ", equipment_code=" + equipment_code
                + ", fault_code=" + fault_code + ", equipment_name=" + equipment_name + ", repair_company="
                + repair_company + ", repairer=" + repairer + ", location=" + location + ", manager=" + manager
                + ", repair_date=" + repair_date + ", remarks=" + remarks + "]";
    }

}
