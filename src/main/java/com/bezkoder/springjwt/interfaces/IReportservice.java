package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.*;
public interface IReportservice {
	List<Report> retrieveAllReport();
	Report addReport (Report o);
	Report updateReport (Report o);
	Report retrieveReport (Long id);
	void removeReport (Long id);
	float pourcentageBadLanguage();
	float pourcentageDamage();
	void updateReporte(Report a, long id);

}