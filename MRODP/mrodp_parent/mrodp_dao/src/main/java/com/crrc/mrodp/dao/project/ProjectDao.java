package com.crrc.mrodp.dao.project;

import com.crrc.mrodp.pojo.Project;

import java.util.List;
import java.util.Map;

public interface ProjectDao {


    List<Project> getProjectList(Map<String, Object> params);
}
