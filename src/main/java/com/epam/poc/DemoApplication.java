package com.epam.poc;

import com.epam.poc.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    @Autowired
    private QueueService queueService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    /*@Override
    public void run(String... args) throws Exception {
        List<Table1> tmpList = table1Repo.findAll();
        tmpList.forEach(System.out::println);

        /*for (int i = 2; i < 10; i++) {
            Table1 tmpTable1 = new Table1();
            tmpTable1.setName("Bla-bla-"+String.valueOf(i));
            table1Repo.save(tmpTable1);
        }*/
        /*String sql = "SELECT * FROM TABLE1";

        List<tmpDTO> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(tmpDTO.class));

        students.forEach(System.out::println);
    }*/
}
