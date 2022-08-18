package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService{

	
	List<Record> list = List.of(
			new Record(1L, "tata@gmail.com", "Tata Motors", 1011L),
			new Record(2L, "techmahindra@gmail.com", "Tech Mahindra", 1012L),
			new Record(3L, "lt@gmail.com", "L&T", 1013L),
			new Record(4L, "bmw@gmail.com", "BMW", 1014L),
			new Record(5L, "boat@gmail.com", "BOAT", 1015L),
			new Record(6L, "jbl@gmail.com", "JBL", 1011L),
			new Record(7L, "wipro@gmail.com", "Wipro", 1012L),
			new Record(8L, "dell@gmail.com", "Dell", 1013L),
			new Record(9L, "hp@gmail.com", "HP", 1014L),
			new Record(10L, "acer@gmail.com", "Acer", 1015L)
			);
	
	
	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

	
}
