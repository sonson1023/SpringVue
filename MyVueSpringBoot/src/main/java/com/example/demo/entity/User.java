/**
 * 
 */
package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * 
 * @FileName : User.java
 * 
 * @Project : MySpringVue
 * 
 * @Date : 2018. 4. 9.
 * 
 * @Author : admin
 * 
 * @Program Description :
 * 
 */
@Entity(name = "user")
public class User {


	@Id 	
	@Column(name="user_id")
	private String user_id;

	@Column
	private String email;

	@Column
	private String passwd;

	@Column
	private String name;

	@CreatedDate
	
	private String regDT;

	@LastModifiedDate
	private String updateDT;
 

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the regDT
	 */
	public String getRegDT() {
		return regDT;
	}

	/**
	 * @param regDT
	 *            the regDT to set
	 */
	public void setRegDT(String regDT) {
		this.regDT = regDT;
	}

	/**
	 * @return the updateDT
	 */
	public String getUpdateDT() {
		return updateDT;
	}

	/**
	 * @param updateDT
	 *            the updateDT to set
	 */
	public void setUpdateDT(String updateDT) {
		this.updateDT = updateDT;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * @param passwd
	 *            the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return user_id;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.user_id = userId;
	}
	
	
}
