package org.library;

import javax.persistence.Column;
import javax.persistence.Id;

public class Publisher {
	@Id
	@Column(name = "Publisher_Id")
	private int publisherId;
	@Column(name = "Publisher_Name")
	private String name;

	private String address;

	public Publisher(int publisherId, String name, String address) {
		super();
		this.publisherId = publisherId;
		this.name = name;
		this.address = address;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

}