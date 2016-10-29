package com.world.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "country")
@Table(name = "country")
public class Country implements ICountry {

  @Id
  @Column
  private String code;
  @Column
  private String name;
  @Column
  private String continent;
  @Column
  private String region;
  @Column
  private Double surfacearea;
  @Column
  private Long indepyear;
  @Column
  private Long population;
  @Column
  private Double lifeexpectancy;
  @Column
  private Double gnp;
  @Column
  private Double gnpold;
  @Column
  private String localname;
  @Column
  private String governmentform;
  @Column
  private String headofstate;
  @Column
  private Long capital;
  @Column
  private String code2;

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getContinent() {
    return continent;
  }

  @Override
  public void setContinent(String continent) {
    this.continent = continent;
  }

  @Override
  public String getRegion() {
    return region;
  }

  @Override
  public void setRegion(String region) {
    this.region = region;
  }

  @Override
  public Double getSurfacearea() {
    return surfacearea;
  }

  @Override
  public void setSurfacearea(Double surfacearea) {
    this.surfacearea = surfacearea;
  }

  @Override
  public Long getIndepyear() {
    return indepyear;
  }

  @Override
  public void setIndepyear(Long indepyear) {
    this.indepyear = indepyear;
  }

  @Override
  public Long getPopulation() {
    return population;
  }

  @Override
  public void setPopulation(Long population) {
    this.population = population;
  }

  @Override
  public Double getLifeexpectancy() {
    return lifeexpectancy;
  }

  @Override
  public void setLifeexpectancy(Double lifeexpectancy) {
    this.lifeexpectancy = lifeexpectancy;
  }

  @Override
  public Double getGnp() {
    return gnp;
  }

  @Override
  public void setGnp(Double gnp) {
    this.gnp = gnp;
  }

  @Override
  public Double getGnpold() {
    return gnpold;
  }

  @Override
  public void setGnpold(Double gnpold) {
    this.gnpold = gnpold;
  }

  @Override
  public String getLocalname() {
    return localname;
  }

  @Override
  public void setLocalname(String localname) {
    this.localname = localname;
  }

  @Override
  public String getGovernmentform() {
    return governmentform;
  }

  @Override
  public void setGovernmentform(String governmentform) {
    this.governmentform = governmentform;
  }

  @Override
  public String getHeadofstate() {
    return headofstate;
  }

  @Override
  public void setHeadofstate(String headofstate) {
    this.headofstate = headofstate;
  }

  @Override
  public Long getCapital() {
    return capital;
  }

  @Override
  public void setCapital(Long capital) {
    this.capital = capital;
  }


  @Override
  public String getCode2() {
    return code2;
  }

  @Override
  public void setCode2(String code2) {
    this.code2 = code2;
  }

  public Country() {
  }

  public Country(String code, String name, String continent, String region, Double surfacearea, Long indepyear, Long population, Double lifeexpectancy, Double gnp, Double gnpold, String localname, String governmentform, String headofstate, Long capital, String code2) {
    this.code = code;
    this.name = name;
    this.continent = continent;
    this.region = region;
    this.surfacearea = surfacearea;
    this.indepyear = indepyear;
    this.population = population;
    this.lifeexpectancy = lifeexpectancy;
    this.gnp = gnp;
    this.gnpold = gnpold;
    this.localname = localname;
    this.governmentform = governmentform;
    this.headofstate = headofstate;
    this.capital = capital;
    this.code2 = code2;
  }

  @Override
  public String toString() {
    return "Country{" +
            "code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", continent='" + continent + '\'' +
            ", region='" + region + '\'' +
            ", surfacearea=" + surfacearea +
            ", indepyear=" + indepyear +
            ", population=" + population +
            ", lifeexpectancy=" + lifeexpectancy +
            ", gnp=" + gnp +
            ", gnpold=" + gnpold +
            ", localname='" + localname + '\'' +
            ", governmentform='" + governmentform + '\'' +
            ", headofstate='" + headofstate + '\'' +
            ", capital=" + capital +
            ", code2='" + code2 + '\'' +
            '}';
  }
}
