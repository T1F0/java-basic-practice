package com.supconit.study.generationAlgorithm.scheme.service;

import com.supconit.study.generationAlgorithm.scheme.dao.Scheme;

import java.util.List;

public interface SchemeService {

    Scheme selectById(Integer id);

    List<Scheme> selectAll();
}
