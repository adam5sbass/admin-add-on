package com.company.adminaddon.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.adminaddon.entity.Employee;

@UiController("adminaddon_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}