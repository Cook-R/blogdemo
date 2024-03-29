package top.wqp0010.s1.demo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: cook
 * @date: 2019年10月31日23:22:44
 * @description:
 */
@Configuration
@MapperScan("top.wqp0010.s1.demo.mapper*")
public class MybatisPlusConfig {
  /**
   * mybatis-plus分页插件<br>
   * 文档：http://mp.baomidou.com<br>
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
    return paginationInterceptor;
  }
}
