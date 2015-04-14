package com.dusanstanojevic.MetHotels.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

import com.dusanstanojevic.MetHotels.entities.Soba;

import java.util.ArrayList;
import java.util.List;

/**
 * Start page of application MetHotels.
 */
public class Index {
  @Persist
  @Property
  private List<Soba> sobe;
  
  @Property
  private Soba soba;
  
  void onActivate() {
	  if (sobe==null) {
		  sobe = new ArrayList<Soba>();
	  }
  }
  
  Object onSuccess() {
	  sobe.add(soba);
	  return this;
  }
}
