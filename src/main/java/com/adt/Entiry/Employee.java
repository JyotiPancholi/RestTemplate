package com.adt.Entiry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id ;
	private String name ;
	private String email;
}
