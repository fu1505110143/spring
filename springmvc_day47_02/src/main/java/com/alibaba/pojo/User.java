package com.alibaba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 17:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
 public class User implements Serializable {
        private String username;
        private String password;
        private String nickname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date birthday;
      private List<String> hobbies;
}
