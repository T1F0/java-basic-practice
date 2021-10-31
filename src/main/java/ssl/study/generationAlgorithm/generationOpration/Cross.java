package com.supconit.study.generationAlgorithm.generationOpration;

public class Cross {
    /**遗传操作
     * 重新组装父染色体
     * @param fatherChromosome
     * @param matherChromosome
     * @param isOrder
     * @param randomNum
     * @return
     */
    public int[] recombine(int[] fatherChromosome, int[] matherChromosome,int isOrder,int randomNum) {
        int[] childrenChromosome = new int[matherChromosome.length];
        for (int i = 0; i < fatherChromosome.length; i++) {
            //填充前r个
            if (i < fatherChromosome.length - randomNum) {
                if (isOrder == 1) {
                    childrenChromosome[i] = fatherChromosome[i];
                } else {
                    childrenChromosome[i] = matherChromosome[i];
                }
            }
            //填充后(fatherChromosome.length-r)个
            if (i >= fatherChromosome.length - randomNum) {
                if (isOrder == 1) {
                    childrenChromosome[i] = matherChromosome[i];
                } else {
                    childrenChromosome[i] = fatherChromosome[i];
                }
            }
        }
        return childrenChromosome;
    }
}
