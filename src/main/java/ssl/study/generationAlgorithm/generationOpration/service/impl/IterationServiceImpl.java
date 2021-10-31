package com.supconit.study.generationAlgorithm.generationOpration.service.impl;

import com.supconit.study.generationAlgorithm.dataDisplay.DataVisualization;
import com.supconit.study.generationAlgorithm.generationOpration.Cross;
import com.supconit.study.generationAlgorithm.generationOpration.service.IterationService;
import com.supconit.study.generationAlgorithm.objectionOperation.ObjectiveFunction;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IterationServiceImpl implements IterationService {

    @Override
    public String iteration(int[] fatherChromosome, int[] matherChromosome , int iterationsTimes) {
            Cross cross = new Cross();
            ObjectiveFunction objectiveFunction = new ObjectiveFunction();
            DataVisualization dataVisualization = new DataVisualization();
            //循环迭代
                int maxObject = 0;
                int maxObjectIndex = 0;
                for (int i = 0; i < iterationsTimes; i++) {
                    //生成1到6的随机的整数
                    int r = (int) (Math.random() * matherChromosome.length);
            System.out.println(r);
                    int[] newFatherChromosome = cross.recombine(fatherChromosome,matherChromosome,0,r);
                    int[] mewMatherChromosome = cross.recombine(fatherChromosome,matherChromosome,1,r);
                    fatherChromosome = newFatherChromosome;
                    matherChromosome = mewMatherChromosome;
                    int max = objectiveFunction.computeObject(fatherChromosome);
                    if (max>=maxObject){
                        maxObjectIndex = i;
                        maxObject = max;
                    }
                    System.out.print("第"+(i+1)+"代");
                    System.out.print("父染色体"+ Arrays.toString(fatherChromosome));
                    System.out.println("母染色体"+Arrays.toString(matherChromosome));
                    dataVisualization.dataDisplay(max);
                }
                System.out.println("最大效益值为"+maxObject+",发生在第"+(maxObjectIndex+1)+"代");
                return "最大效益值为"+maxObject+",发生在第"+(maxObjectIndex+1)+"代";
            }
        }
