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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class HospitalApplicationTests {
    @Autowired
    private VariationService vs;
    @Test
    void contextLoads() {
        Variation v = vs.getVariationById("12321");
        System.out.println(v);

    }

}
