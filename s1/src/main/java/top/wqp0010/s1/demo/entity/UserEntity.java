package top.wqp0010.s1.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: cook
 * @date: 2019年10月31日23:22:44
 * @description:
 */

/**
 *  数据库表名为"user"，用@TableName映射
 */
@TableName("user")
@Data
public class UserEntity {

  /**
   * 表主键 此处需要设置为数据库ID自增
   */
  @TableId(type = IdType.AUTO)
  private long id;
  private String name;
  private int age;
  private String email;
  private String phone;
  /**
   * 此处故意用了类字段名和数据库列明不相符
   * 可以用@TableField注解来表示
   */
  @TableField("userEvaluation")
  private String evaluation;
}
