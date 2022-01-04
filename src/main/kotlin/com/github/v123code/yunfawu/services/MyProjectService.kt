package com.github.v123code.yunfawu.services

import com.intellij.openapi.project.Project
import com.github.v123code.yunfawu.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
