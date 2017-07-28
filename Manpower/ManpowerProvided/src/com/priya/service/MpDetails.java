package com.priya.service;
import java.util.List;
import com.priya.entity.ManpowerDetails;
public interface MpDetails {
	public void addManpowerDetails(ManpowerDetails manpower);
	public List<ManpowerDetails> getAllManpower();
}
