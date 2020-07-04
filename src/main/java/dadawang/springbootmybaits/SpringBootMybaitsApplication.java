package dadawang.springbootmybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dadawang.springbootmybaits.mapper") //这个是扫描mybatis中mapper接口的
public class SpringBootMybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybaitsApplication.class, args);
    }

}
