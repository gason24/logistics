package edu.huayue.logistics.mapper;

import edu.huayue.logistics.entity.pojo.OrderRxpress;
import edu.huayue.logistics.entity.pojo.OrderRxpressExample;
import edu.huayue.logistics.mapper.basemapper.IBaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRxpressMapper extends IBaseMapper<OrderRxpress> {
    int countByExample(OrderRxpressExample example);

    int deleteByExample(OrderRxpressExample example);

    List<OrderRxpress> selectByExample(OrderRxpressExample example);

    int updateByExampleSelective(@Param("record") OrderRxpress record, @Param("example") OrderRxpressExample example);

    int updateByExample(@Param("record") OrderRxpress record, @Param("example") OrderRxpressExample example);
}