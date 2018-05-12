/**
 * 
 */
package com.arun.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Adwiti
 *
 */
@Getter
@Setter
@Entity
public class Student {
	private int studentId;
	private String name;
	private int age;
	private String section;
	private Address address;

}
