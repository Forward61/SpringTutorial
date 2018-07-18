package com.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

/**
 * Created by ningli on 2018/7/5.
 */

@Controller
public class FileUploadController {
    @RequestMapping("/fileUpload")
    public  String handleFormUpload(@RequestParam("name") String  name, @RequestParam("uploadfile")List<MultipartFile> uploadFile
                                    ,HttpServletRequest request){
        System.out.println("-----------Test-----------handleFormUpload值=" + "" + "," + "当前类=.()");
        if(!uploadFile.isEmpty()&&uploadFile.size()>0){
            for (MultipartFile file:uploadFile){
                String originalFileName = file.getOriginalFilename();
                String dirPath = request.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                if(!filePath.exists()){
                    filePath.mkdir();
                }
                String newFileName = name + "_" + UUID.randomUUID()+originalFileName;
                try {
                    file.transferTo(new File(dirPath+newFileName));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return  "index";
        }else {
            return  "login";
        }

    }
    @RequestMapping("/download")
    public ResponseEntity<byte []> fileDownload(HttpServletRequest request,String filename) throws Exception{

        String path = request.getServletContext().getRealPath("/upload/");
        File file = new File(path+File.separator+filename);
        filename = this.getFilename(request,filename);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment",filename);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return  new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders, HttpStatus.OK);
    }
    public String getFilename(HttpServletRequest request,String filename) throws UnsupportedEncodingException {
        String [] IEBrowserKeyWords={"MSIE","Trident","Edge"};
        String useragent = request.getHeader("User-Agent");

        return  new String(filename.getBytes("UTF-8"),"ISO-8859-1");
    }

    @RequestMapping(value="/ff")
    public String handleRequest() throws Exception {

        return "index";
    }
}

