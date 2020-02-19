package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Dayreportlog;
import com.company.project.service.DayreportlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/02/19.
*/
@RestController
@RequestMapping("/dayreportlog")
public class DayreportlogController {
    @Resource
    private DayreportlogService dayreportlogService;

    @PostMapping("/add")
    public Result add(Dayreportlog dayreportlog) {
        dayreportlogService.save(dayreportlog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        dayreportlogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Dayreportlog dayreportlog) {
        dayreportlogService.update(dayreportlog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Dayreportlog dayreportlog = dayreportlogService.findById(id);
        return ResultGenerator.genSuccessResult(dayreportlog);
    }
    @PostMapping("/searchdayreportlog")
    public Result searchuser(Dayreportlog dayreportlog) {
    	Condition condition=new Condition(Dayreportlog.class);    
    	Criteria  criteria=condition.createCriteria();
    	criteria.andCondition("reportdatastr = '" +dayreportlog.getReportdatastr() + "'");    	 
        List<Dayreportlog> list=dayreportlogService.findByCondition(condition);       
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Dayreportlog> list = dayreportlogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
