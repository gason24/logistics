package edu.huayue.logistics.mapper;

import edu.huayue.logistics.entity.pojo.ErpOrder;
import edu.huayue.logistics.entity.pojo.ErpOrderExample;
import edu.huayue.logistics.mapper.basemapper.IBaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErpOrderMapper extends IBaseMapper<ErpOrder> {
    int countByExample(ErpOrderExample example);

    int deleteByExample(ErpOrderExample example);

    List<ErpOrder> selectByExample(ErpOrderExample example);

    int updateByExampleSelective(@Param("record") ErpOrder record, @Param("example") ErpOrderExample example);

    int updateByExample(@Param("record") ErpOrder record, @Param("example") ErpOrderExample example);
}