package com.sonar.sonargitaction;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SonarGitActionApplication {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            log.info("run");
            log.info("demo");
            System.out.println("I want Error");
        }
    }

}
