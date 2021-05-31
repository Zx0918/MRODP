package com.crrc.mrodp.project;

import com.crrc.mrodp.pojo.Project;

import java.util.List;
import java.util.Map;

public interface ProjectService {

    List<Project> getProjectList(Map<String, Object> params);
}
