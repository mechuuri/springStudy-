package com.sist.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;
import com.sist.manager.*;

public class MainClass3 {
	ApplicationContext app=
			new ClassPathXmlApplicationContext("application-*.xml");
			
			Member mem=app.getBean("mem",Member.class);
			{System.out.println("회원번호:"+mem.getMno());
			System.out.println("이름:"+mem.getName());
			System.out.println("주소:"+mem.getAddress());
			System.out.println("전화:"+mem.getTel());
			System.out.println("나이:"+mem.getAge());
			System.out.println("=============================================");
			EmpDAO dao=(EmpDAO)app.getBean("dao");
			List<EmpVO> list=dao.empListData();
			for(EmpVO vo:list)
			{
				System.out.println(vo.getEmpno()+" "
				+vo.getEname()+" "
				+vo.getJob()+" "
				+vo.getHiredate()+" "
				+vo.getSal());
			}
			}
}
