package com.sgic.leavesystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leave {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private Integer id;
private String reason;
private String days;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public String getDays() {
	return days;
}
public void setDays(String days) {
	this.days = days;
}

}
