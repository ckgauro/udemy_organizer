package com.gauro.udemyorganizer.bootstrap;

import com.gauro.udemyorganizer.services.FolderOperations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class BootStrap implements CommandLineRunner {
    private final FolderOperations folderOperations;
    String path="/Users/ckgauro/Tutorial/github/SpringProject/Master Spring framework, Spring Boot, REST, JPA, Hibernate";

    public BootStrap(FolderOperations folderOperations) {
        this.folderOperations = folderOperations;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(path);
        Map<String, Set<String>> mapPaths=folderOperations.getAllSectionFolder(path);
        copyContent(path, mapPaths);
    }

    private void copyContent(String path, Map<String, Set<String>> mapPaths) {
        System.out.println("========copyContent========");
        mapPaths.forEach((k,v)->{
            System.out.println("================");
            log.info("key:"+k+"===>size :"+v.size());
            Set<String> setFolder=v;
            setFolder.forEach(el->{
                System.out.println(el);
            });

        });

    }
}
