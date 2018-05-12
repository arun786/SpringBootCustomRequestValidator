/**
 * 
 */
package com.arun.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Adwiti
 *
 */
@Getter
@Setter
public class School {
	private String schoolId;
	private String name;
	private List<Student> students;
	private Address address;
}
