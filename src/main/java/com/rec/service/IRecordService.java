package com.rec.service;

import java.util.List;

import com.rec.entity.Record;

public interface IRecordService {

		List<Record> getRecordOfEmployee(Long eId);
}

