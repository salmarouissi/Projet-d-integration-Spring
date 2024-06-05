package com.dsi.tp1.services;

import java.util.List;


import com.dsi.tp1.entites.MembreJury;


public interface IMembreJuryService {
	public List<MembreJury> allMembreJury();
	public MembreJury getMembreJury(int id);
    public MembreJury UpdateJury(MembreJury membreJury,int id);
    public boolean DeleteJury (int id);
	public boolean addJury (MembreJury jury);
	public boolean authentification(String username, String password);
}
