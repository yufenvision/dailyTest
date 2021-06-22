package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/6/22 17:17
 */
@Data
@Builder
@TableName("kafka_in")
public class TestPO {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;

}
