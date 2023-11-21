package dev.rifaii.mybatisbug;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MapperTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    void mapperTest() {
        var myBatisSystemException = assertThrows(
                MyBatisSystemException.class,
                () -> testMapper.findById(1L)
        );

        assertNotNull(myBatisSystemException.getMessage());
    }
}
