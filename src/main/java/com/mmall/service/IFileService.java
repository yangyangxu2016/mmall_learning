package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xyy
 * @create 2017-08-02 15:22
 **/
public interface IFileService {

    String upload(MultipartFile file, String path);
}
