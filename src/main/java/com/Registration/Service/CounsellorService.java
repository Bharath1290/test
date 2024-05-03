package com.Registration.Service;

import com.Registration.Entity.Counsellor;
import com.Registration.binding.DashboardResponse;

public interface CounsellorService {
    public String saveCounsellor(Counsellor c);
    public Counsellor loginCheck(String email,String pwd);
    public boolean recoverPwd(String email);
    public DashboardResponse getDashboardInfo(Integer cid);
}
