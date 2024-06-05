package com.dsi.tp1.services;

import java.sql.Date;
import java.util.List;

import com.dsi.tp1.entites.Soutenance;

public interface ISoutenanceService {
	public List<Soutenance> allSoutenances();
	public Soutenance getSoutenance(int id);
    public Soutenance UpdateSoutenance (Soutenance soutenance,int id);
    public boolean DeleteSoutenance (int id);
	public boolean addSoutenance(Soutenance soutenance);
	public Date getDate(int id);
	public float getNote(int id);
	public Soutenance addDate(int id,Date d1);
	public Soutenance addNote(int id,float note); 

}
