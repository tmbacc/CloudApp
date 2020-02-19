package com.company.project.service.impl;

import com.company.project.dao.DayreportlogMapper;
import com.company.project.model.Dayreportlog;
import com.company.project.service.DayreportlogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/19.
 */
@Service
@Transactional
public class DayreportlogServiceImpl extends AbstractService<Dayreportlog> implements DayreportlogService {
    @Resource
    private DayreportlogMapper dayreportlogMapper;

}
