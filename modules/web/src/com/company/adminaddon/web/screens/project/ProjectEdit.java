package com.company.adminaddon.web.screens.project;

import com.haulmont.cuba.gui.screen.*;
import com.company.adminaddon.entity.Project;

@UiController("adminaddon_Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
@LoadDataBeforeShow
public class ProjectEdit extends StandardEditor<Project> {
}