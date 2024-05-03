package com.Registration.Service;

import com.Registration.Entity.StudentEnq;
import com.Registration.binding.SearchCriteria;

import java.util.List;

public interface EnquiryService {
    public boolean addEnq(StudentEnq se);
    public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);
}
