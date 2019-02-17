package edu.huayue.logistics.mapper;

import edu.huayue.logistics.entity.pojo.ExpressState;
import edu.huayue.logistics.entity.pojo.ExpressStateExample;
import edu.huayue.logistics.mapper.basemapper.IBaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressStateMapper extends IBaseMapper<ExpressState> {
    int countByExample(ExpressStateExample example);

    int deleteByExample(ExpressStateExample example);

    List<ExpressState> selectByExample(ExpressStateExample example);

    int updateByExampleSelective(@Param("record") ExpressState record, @Param("example") ExpressStateExample example);

    int updateByExample(@Param("record") ExpressState record, @Param("example") ExpressStateExample example);
}