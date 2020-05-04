package com.project.covid19.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Covid19  {
    @JsonProperty("Confirmed")
    private String confirmed;
    @JsonProperty("Recovered")
    private String Recovered;
    @JsonProperty("Hospitalized")
    private String Hospitalized;
    @JsonProperty("Deaths")
    private String Deaths;
    @JsonProperty("NewConfirmed")
    private String NewConfirmed;
    @JsonProperty("NewRecovered")
    private String NewRecovered;
    @JsonProperty("NewHospitalized")
    private String NewHospitalized;
    @JsonProperty("NewDeaths")
    private String NewDeaths;
    @JsonProperty("UpdateDate")
    private String UpdateDate;



    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getRecovered() {
        return Recovered;
    }

    public void setRecovered(String recovered) {
        Recovered = recovered;
    }

    public String getHospitalized() {
        return Hospitalized;
    }

    public void setHospitalized(String hospitalized) {
        Hospitalized = hospitalized;
    }

    public String getDeaths() {
        return Deaths;
    }

    public void setDeaths(String deaths) {
        Deaths = deaths;
    }

    public String getNewConfirmed() {
        return NewConfirmed;
    }

    public void setNewConfirmed(String newConfirmed) {
        NewConfirmed = newConfirmed;
    }

    public String getNewRecovered() {
        return NewRecovered;
    }

    public void setNewRecovered(String newRecovered) {
        NewRecovered = newRecovered;
    }

    public String getNewHospitalized() {
        return NewHospitalized;
    }

    public void setNewHospitalized(String newHospitalized) {
        NewHospitalized = newHospitalized;
    }

    public String getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        NewDeaths = newDeaths;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String updateDate) {
        UpdateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Covid19{" +
                "Confirmed='" + confirmed + '\'' +
                ", Recovered='" + Recovered + '\'' +
                ", Hospitalized='" + Hospitalized + '\'' +
                ", Deaths='" + Deaths + '\'' +
                ", NewConfirmed='" + NewConfirmed + '\'' +
                ", NewRecovered='" + NewRecovered + '\'' +
                ", NewHospitalized='" + NewHospitalized + '\'' +
                ", NewDeaths='" + NewDeaths + '\'' +
                ", UpdateDate='" + UpdateDate + '\'' +
                '}';
    }
}
