package com.supconit.study.generationAlgorithm.generationOpration.controller;


import com.supconit.study.generationAlgorithm.generationOpration.service.IterationService;
import com.supconit.study.generationAlgorithm.scheme.dao.Scheme;
import com.supconit.study.generationAlgorithm.scheme.service.SchemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("initialization")
@Api(tags="初始化")
public class InitializationController {

        @Autowired
        private IterationService iterationService;
        @Autowired
        private SchemeService schemeService;



        @GetMapping("/start")
        @ApiOperation(value = "开始迭代")
        public void initialization(){
                int[] fatherChromosome = new int[8];
                Scheme father = schemeService.selectById(1);
                        fatherChromosome[0] = father.getProviderId1();
                        fatherChromosome[1] = father.getProviderId2();
                        fatherChromosome[2] = father.getProviderId3();
                        fatherChromosome[3] = father.getProviderId4();
                        fatherChromosome[4] = father.getProviderId5();
                        fatherChromosome[5] = father.getProviderId6();
                        fatherChromosome[6] = father.getProviderId7();
                        fatherChromosome[7] = father.getProviderId8();
                int[] matherChromosome = new int[8];
                Scheme mather = schemeService.selectById(2);
                matherChromosome[0] = mather.getProviderId1();
                matherChromosome[1] = mather.getProviderId2();
                matherChromosome[2] = mather.getProviderId3();
                matherChromosome[3] = mather.getProviderId4();
                matherChromosome[4] = mather.getProviderId5();
                matherChromosome[5] = mather.getProviderId6();
                matherChromosome[6] = mather.getProviderId7();
                matherChromosome[7] = mather.getProviderId8();
                int iterationsTimes = 56;
                iterationService.iteration(fatherChromosome,matherChromosome,iterationsTimes);
        }

}
