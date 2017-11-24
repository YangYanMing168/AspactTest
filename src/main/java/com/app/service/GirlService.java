package com.app.service;

import com.app.domain.Girl;
import com.app.enums.ResultEnums;
import com.app.exception.MyException;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    public void  getAge(Integer id) throws Exception {
        Girl girl = new Girl();
        girl.setAge(id);
        girl.setCupSize(id*5);
        girl.setName("LiSi");
        if(id<10)
            throw new MyException(ResultEnums.PRIMARY_SCHOOL);
        else if (id>=10&id<16)
            throw new MyException(ResultEnums.MIDDLE_SCHOOL);
    }
}
