package com.coderwood.bill.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coderwood.bill.dao.BillinfoDAO;
import com.coderwood.bill.entity.Billinfo;

@Service
public class BillinfoService {
	private BillinfoDAO billinfoDAO ;
	
	public List<Billinfo> selectAll() {
		billinfoDAO=new BillinfoDAO();
		return	billinfoDAO.selectAll();
	}
	
}
