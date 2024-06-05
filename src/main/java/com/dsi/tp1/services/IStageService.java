package com.dsi.tp1.services;

import java.util.List;


import com.dsi.tp1.entites.Stage;

public interface IStageService {
	public List<Stage> allStage();
	public Stage getStage(int id);
	public Stage DepotAttestation(Stage s,int idetudiant);
    public Stage UpdateStage(Stage stage,int id);
    public boolean DeleteStage(int id);
	public boolean addStage(Stage stage);
}
