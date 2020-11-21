package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;




@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class LevelControllerTest {

    @SpringBootTest
    @Nested
    @ActiveProfiles("0")
    @AutoConfigureMockMvc
    class when_level_number_is_0 {
        @Autowired
        MockMvc mockMvc;

        @Test
        public void should_return_basic() throws Exception {

            mockMvc.perform(get("/level"))
                    .andExpect(content().string("basic"));
        }
    }
    @SpringBootTest
    @Nested
    @ActiveProfiles("1")
    @AutoConfigureMockMvc
    class when_level_number_is_1 {
        @Autowired
        MockMvc mockMvc;

        @Test
        public void should_return_advanced() throws Exception {

            mockMvc.perform(get("/level"))
                    .andExpect(content().string("advanced"));
        }
    }

    @SpringBootTest
    @Nested
    @ActiveProfiles("2")
    @AutoConfigureMockMvc
    class when_level_number_is_2 {
        @Autowired
        MockMvc mockMvc;

        @Test
        public void should_return_advanced() throws Exception {

            mockMvc.perform(get("/level"))
                    .andExpect(content().string("advanced"));
        }
    }
}