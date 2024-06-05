package com.dsi.tp1.services;

import java.util.List;

import com.dsi.tp1.entites.DemandeStage;



public interface IDemandeStageService {
	public List<DemandeStage> allDemandeStage();
	public DemandeStage getDemandeStage(int id);
    public DemandeStage UpdateDemandeStage(DemandeStage demandeStage,int id);
    public boolean DeleteDemandeStage(int id);
	public boolean addDemandeStage(DemandeStage demandeStage);
}
