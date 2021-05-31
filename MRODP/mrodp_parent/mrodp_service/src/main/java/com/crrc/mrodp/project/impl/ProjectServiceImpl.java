package com.crrc.mrodp.project.impl;

import com.crrc.mrodp.dao.project.ProjectDao;
import com.crrc.mrodp.pojo.Project;
import com.crrc.mrodp.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Project> getProjectList(Map<String, Object> params) {
        List<Project> list = projectDao.getProjectList(params);
        return list;
    }
}
