package com.example.naturerb;

public class RecettesData {

    private int idRemede;
    private String libelleRemede;
    private String recetteRemede;
    private String ProprieteRemede;
    private String sourcesRemede;
    private int idSymptomes;


    public RecettesData(int idRemede, String libelleRemede, String recetteRemede, String proprieteRemede, String sourcesRemede, int idSymptomes) {
        this.setIdRemede(idRemede);
        this.setLibelleRemede(libelleRemede);
        this.setRecetteRemede(recetteRemede);
        this.setProprieteRemede(proprieteRemede);
        this.setSourcesRemede(sourcesRemede);
        this.setIdSymptomes(idSymptomes);
    }

    public int getIdRemede() {
        return idRemede;
    }

    public void setIdRemede(int idRemede) {
        this.idRemede = idRemede;
    }

    public String getLibelleRemede() {
        return libelleRemede;
    }

    public void setLibelleRemede(String libelleRemede) {
        this.libelleRemede = libelleRemede;
    }

    public String getRecetteRemede() {
        return recetteRemede;
    }

    public void setRecetteRemede(String recetteRemede) {
        this.recetteRemede = recetteRemede;
    }

    public String getProprieteRemede() {
        return ProprieteRemede;
    }

    public void setProprieteRemede(String proprieteRemede) {
        ProprieteRemede = proprieteRemede;
    }

    public String getSourcesRemede() {
        return sourcesRemede;
    }

    public void setSourcesRemede(String sourcesRemede) {
        this.sourcesRemede = sourcesRemede;
    }

    public int getIdSymptomes() {
        return idSymptomes;
    }

    public void setIdSymptomes(int idSymptomes) {
        this.idSymptomes = idSymptomes;
    }

}
