package com.priya.dao;

import java.util.List;
import com.priya.entity.ManpowerDetails;

public interface ManpowerDAO {
public void addManpowerDetails(ManpowerDetails manpower);
public List<ManpowerDetails> getAllManpower();

}
