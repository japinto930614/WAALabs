/**
 * 
 */
package com.students.domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Min(value = 100, message = "{Size.area}")
	@Max(value = 999, message = "{Size.area}")
 	private Integer area;

	@Min(value = 100, message = "{Size.prefix}")
	@Max(value = 999, message = "{Size.prefix}")
 	private Integer prefix;

	@Min(value = 1000, message = "{Size.number}")
	@Max(value = 9999, message = "{Size.number}")
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
