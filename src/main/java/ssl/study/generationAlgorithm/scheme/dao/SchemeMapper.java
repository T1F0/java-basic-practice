package ssl.study.generationAlgorithm.scheme.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SchemeMapper {
    //查找所有
    List<com.supconit.study.generationAlgorithm.scheme.dao.Scheme> selectAll();

    //按id查找用户信息
    com.supconit.study.generationAlgorithm.scheme.dao.Scheme selectById(@Param("id") Integer id);
}
