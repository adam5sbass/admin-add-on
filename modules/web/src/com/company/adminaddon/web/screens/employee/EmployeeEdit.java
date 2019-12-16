package com.company.adminaddon.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.adminaddon.entity.Employee;

@UiController("adminaddon_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}