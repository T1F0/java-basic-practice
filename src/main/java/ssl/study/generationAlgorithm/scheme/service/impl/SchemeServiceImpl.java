package com.supconit.study.generationAlgorithm.scheme.service.impl;

import com.supconit.study.generationAlgorithm.scheme.dao.Scheme;
import com.supconit.study.generationAlgorithm.scheme.dao.SchemeMapper;
import com.supconit.study.generationAlgorithm.scheme.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchemeServiceImpl implements SchemeService {

    @Autowired
    private SchemeMapper schemeMapper;

    @Override
    public Scheme selectById(Integer id){
        return schemeMapper.selectById(id);
    }

    @Override
    public List<Scheme> selectAll() {
        return schemeMapper.selectAll();
    }
}
