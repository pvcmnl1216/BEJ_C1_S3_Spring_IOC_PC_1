/*
 * Author Name: Philip Meshach
 * Date: 22-12-2022
 * Praise The Lord
 */
package org.niit.Domin;

public class Department {

    private String deptName;
    private String deptId;
    private String deptRole;

    public Department() {
    }

    public Department(String deptName, String deptId, String deptRole) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.deptRole = deptRole;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptRole() {
        return deptRole;
    }

    public void setDeptRole(String deptRole) {
        this.deptRole = deptRole;
    }
}
