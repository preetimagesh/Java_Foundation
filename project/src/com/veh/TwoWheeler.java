package com.veh;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("two")
public class TwoWheeler extends Vehicle {
private String steeringHandle;

public TwoWheeler() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSteeringHandle() {
	return steeringHandle;
}

public void setSteeringHandle(String steeringHandle) {
	this.steeringHandle = steeringHandle;
}

	
}
