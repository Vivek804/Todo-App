package com.vivek.myfirstwebapplication.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class TodoList {
	private int id;
	@Size(min=2,message="Enter atleast 2 characters")
	private String name;
	@Size(min=5,message="Enter atleast 5 characters")
	private String task;
	private LocalDate targetdate;
	private boolean done;
	public TodoList(int id, String name, String task, LocalDate targetdate, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.task = task;
		this.targetdate = targetdate;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public LocalDate getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "TodoList [id=" + id + ", name=" + name + ", task=" + task + ", targetdate=" + targetdate + ", done="
				+ done + "]";
	}
	
	
}
