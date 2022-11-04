package com.gauro.udemyorganizer.bootstrap;

import com.gauro.udemyorganizer.services.FolderOperations;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.logging.LogLevel;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class BootStrap implements CommandLineRunner {
    private final FolderOperations folderOperations;
    String path = "/Users/ckgauro/Tutorial/github/SpringProject/Master Spring framework, Spring Boot, REST, JPA, Hibernate";

    public BootStrap(FolderOperations folderOperations) {
        this.folderOperations = folderOperations;
    }

    @Override
    public void run(String... args) throws Exception {
       // organize(path);

    }

    private void organize(String path) throws IOException {
        log.info(path);
        Map<String, Set<String>> mapPaths = folderOperations.getAllSectionFolder(path);
        copyContent(path, mapPaths);
    }

    private void copyContent(String path, Map<String, Set<String>> mapPaths) throws IOException {
        System.out.println("========copyContent========");
        mapPaths.forEach((k, v) -> {
            System.out.println("================");
            log.info("key:" + k + "===>size :" + v.size());
            Set<String> setFolder = v;
            setFolder.forEach(el -> {
                System.out.println(el);
            });


        });
        extractData(path, mapPaths);

    }

    private void extractData(String path, Map<String, Set<String>> mapPaths) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        String filePath = path + "/temp.md";
        File file = new File(filePath);

        List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        log.info("Total:"+lines.size());
        //lines.forEach(System.out::println);
        int i=0;
        for(String line :lines){
            if(line.startsWith("###")){
                if(stringBuilder.toString().length()>0){
                    log.info("Line number :"+ (++i));
                    log.info(line);
                    String title= StringUtils.substringBetween(stringBuilder.toString(),"###","\n");


                    String targetFolder=title==null?null:getTargetFolder(path,title,mapPaths);
                    if(targetFolder!=null){
                        log.info("targetFolder:"+targetFolder);
                        writeToFile(stringBuilder,targetFolder,title);
                    }
                }
                stringBuilder=new StringBuilder();
            }
            stringBuilder.append(line+"\n");

        }



        log.info(filePath);

    }

    private void writeToFile(StringBuilder stringBuilder, String targetFolder, String title) throws IOException {

        FileUtils.write(new File(targetFolder+"/"+title.trim()), "", Charset.defaultCharset());
        FileUtils.write(new File(targetFolder+"/"+title.trim()), stringBuilder.toString(), Charset.defaultCharset());
        //FileUtils.write(new File(targetFolder+"/Readme.md"), "", Charset.defaultCharset());
        FileUtils.writeStringToFile(new File(targetFolder+"/Readme.md"), "### "+title+"\n", StandardCharsets.UTF_8,true);
    }

    private String getTargetFolder(String path, String title, Map<String, Set<String>> mapPaths) {
        for(Map.Entry<String,Set<String>> entry : mapPaths.entrySet()){
          //  log.info("title:"+title);
           // log.info("fetching =====>"+entry.toString());
            for(String folder:entry.getValue()){
              //  log.info(folder+"<=>"+title.trim()+"===>"+folder.equalsIgnoreCase(title));
                if(folder.equalsIgnoreCase(title.trim())){
                    log.info("found=====>"+folder);
                    return  path+"/"+entry.getKey();
                }
            }
        }
        return null;
    }
}
