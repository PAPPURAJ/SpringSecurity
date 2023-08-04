package io.github.pappuraj.springbootsecurity.service;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private ArrayList<String> list=new ArrayList<>();

    public String add(String name){
        list.add(name);
        return name;
    }
}
