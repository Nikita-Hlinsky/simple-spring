package org.example;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;public class DubstepMusic implements Music {    @Override    public String getSong() {        return "Jotaro";    }}