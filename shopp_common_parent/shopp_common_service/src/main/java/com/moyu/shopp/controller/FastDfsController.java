package com.moyu.shopp.controller;

import com.moyu.shopp.utils.AjaxResult;
import com.moyu.shopp.utils.FastDfsApiOpr;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/common")
public class FastDfsController {

     @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public AjaxResult upload(@RequestParam(value = "file", required = true) MultipartFile file) {
        //file 就是前台选择的文件
        String url = null;
        try {
            //文件的数据
            byte[] bytes = file.getBytes();

            //获取文件的后缀名(最后一个.后面的字符)
            String name = file.getOriginalFilename();
            //String extName = name.substring(name.lastIndexOf(".") + 1);
            //使用工具类获取文件后缀名
            String extName = FilenameUtils.getExtension(name);

            //返回的图像地址
            url = FastDfsApiOpr.upload(bytes, extName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        System.out.println(url);
        return new AjaxResult().setSuccess(true).setMsg("上传成功").setObject(url);
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public AjaxResult del(@RequestParam(value = "filePath") String filePath) {
        System.out.println("aaaaaaaaaa");
        System.out.println(filePath);
        try {

            String substring = filePath.substring(1);

            String groupName = substring.substring(0, substring.indexOf("/"));

            String fileName = substring.substring(substring.indexOf("/") + 1);

            System.out.println(groupName);
            System.out.println(fileName);

            int i = FastDfsApiOpr.delete(groupName, fileName);
            if (i == 0) {
                return AjaxResult.me().setSuccess(true).setMsg("删除成功");
            }{
                return AjaxResult.me().setSuccess(true).setMsg("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(true).setMsg("删除失败");
        }

    }

}
