package com.example.demo.biz;


import java.util.List;

public class Crewmate {
  private List<Task> taskList;

  public boolean taskComplete() {
    return taskList.stream().allMatch(e -> e.status);
  }

  private class Task {
    private boolean status;

  }
}
