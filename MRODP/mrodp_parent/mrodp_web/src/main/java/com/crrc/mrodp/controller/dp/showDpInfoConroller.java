package com.crrc.mrodp.controller.dp;

import com.crrc.mrodp.pojo.Project;
import com.crrc.mrodp.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dp/")
public class showDpInfoConroller {

    @Autowired
    private ProjectService projectService;

    @ResponseBody
    @RequestMapping(value = "/project"/*, method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"}*/)
    public Map<String, Object> getProjectInfo(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> params = new HashMap<>();
        params.put("projectCode", "p000001");
        Map<String, Object> ret = new HashMap<>();
        ret.put("aaa", "bbb");
        List<Project> list = projectService.getProjectList(params);
        ret.put("list", list);
        return ret;
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> ret = new HashMap<>();
        ret.put("aaa", "bbb");
        return "hello";
    }
}
