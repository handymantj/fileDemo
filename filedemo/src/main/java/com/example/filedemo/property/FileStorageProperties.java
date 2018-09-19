/**
 * 
 */
package com.example.filedemo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tanaponjit
 *
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}