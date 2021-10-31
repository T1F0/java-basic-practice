package com.supconit.study.generationAlgorithm.scheme.controller;

import com.supconit.study.generationAlgorithm.scheme.dao.Scheme;
import com.supconit.study.generationAlgorithm.scheme.service.SchemeService;
import com.supconit.study.generationAlgorithm.scheme.service.impl.SchemeServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("scheme")
@Api(tags = "初始方案管理")
public class SchemeController {
    @Resource
    private SchemeService schemeService;

    @GetMapping("/findById")
    @ApiOperation(value = "按照用户id找相应方案")
    public Scheme findById(Integer id) {
        return schemeService.selectById(id);
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "查找所有方案")
    public List<Scheme> findAll() {
        return schemeService.selectAll();
    }

}
