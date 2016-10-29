package com.world.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "countrylanguage")
@Table(name = "countrylaunguage")
public class Countrylanguage implements ICountrylanguage {

  @Id
  @Column
  private String countrycode;
  @Column
  private String language;
  @Column
  private String isofficial;
  @Column
  private Double percentage;

  @Override
  public String getCountrycode() {
    return countrycode;
  }

  @Override
  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }

  @Override
  public String getLanguage() {
    return language;
  }

  @Override
  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public String getIsofficial() {
    return isofficial;
  }

  @Override
  public void setIsofficial(String isofficial) {
    this.isofficial = isofficial;
  }

  @Override
  public Double getPercentage() {
    return percentage;
  }

  @Override
  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public Countrylanguage() {
  }

  public Countrylanguage(String countrycode, String language, String isofficial, Double percentage) {
    this.countrycode = countrycode;
    this.language = language;
    this.isofficial = isofficial;
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "Countrylanguage{" +
            "countrycode='" + countrycode + '\'' +
            ", language='" + language + '\'' +
            ", isofficial='" + isofficial + '\'' +
            ", percentage=" + percentage +
            '}';
  }
}
