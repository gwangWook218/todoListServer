package com.akw.ex03_todo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    private Integer id;

    private String task;

    private boolean completed;
}
