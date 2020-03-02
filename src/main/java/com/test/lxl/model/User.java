package com.test.lxl.model;

import com.test.lxl.annotation.MyAnnotation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Lixinling
 * @create: 2020-02-26 10:51
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@MyAnnotation("小黑测试")
public class User {
    private Integer id;

    @MyAnnotation("是来测试字段的")
    private String name;

}
