package com.hust.hospital;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.hust.hospital.entity.OverAll;
import com.hust.hospital.entity.Patient;
import com.hust.hospital.entity.Variation;
import com.hust.hospital.entity.detail.Stage1;
import com.hust.hospital.entity.detail.Stage3;
import com.hust.hospital.entity.detail.Stage4;
import com.hust.hospital.service.*;
import com.hust.hospital.service.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class HospitalApplicationTests {

    @Test
    void contextLoads() {
        VariationService vs = new VariationServiceImpl();
        vs.addVariation(new Variation("12321","#12312"));

    }

}
