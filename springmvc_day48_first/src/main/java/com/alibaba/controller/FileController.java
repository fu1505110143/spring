package com.alibaba.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * @Author :fuwei
 * @Date:2020/11/15 16:44
 */
@Controller
@RequestMapping("/file")
public class FileController {
// * 1. 获取客户端传入的文件描述信息
// * 2. 获取客户端上传的文件，存放到file文件夹中
// *    2.1 获取客户端上传的文件   MultipartFile upload
// *    2.2 创建一个file文件夹
// *    2.3 使用输出流将客户端上传的文件，输出到file文件夹中
// */
    @RequestMapping("/upload")
    public String filePost(String description, MultipartFile upload, HttpSession session) throws IOException {
        InputStream is = null;
        FileOutputStream out = null;
        try {
            System.out.println ("文件描述" + description);
            String realPath = session.getServletContext ().getRealPath ("upload");
            File file = new File (realPath);
            if (!file.exists ()) {
                file.mkdirs ();
            }
            String fileName = upload.getOriginalFilename ();
            out = new FileOutputStream (new File (file,fileName));
            is = upload.getInputStream ();
            IOUtils.copy (is, out);
            return "good";

        } catch (Exception e) {
            e.printStackTrace ();
            return "失败";
        } finally {
            is.close ();
            out.close ();
        }
    }
}
