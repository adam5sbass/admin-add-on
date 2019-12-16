package com.company.adminaddon.web.screens.project;

import com.haulmont.cuba.gui.screen.*;
import com.company.adminaddon.entity.Project;

@UiController("adminaddon_Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
@LoadDataBeforeShow
public class ProjectBrowse extends StandardLookup<Project> {
}