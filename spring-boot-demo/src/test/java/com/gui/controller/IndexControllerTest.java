package com.gui.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by gui on 2017/1/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class IndexControllerTest {

    private MockMvc mockMvc;

    @Before
    public void before(){
        mockMvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
    }

    @Test
    public void testIndexController() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }

}