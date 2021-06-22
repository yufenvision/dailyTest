package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.TestPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/6/22 17:19
 */
@Mapper
public interface TestMapper extends BaseMapper<TestPO> {

}
