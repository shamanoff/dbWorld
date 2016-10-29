package com.world.entity;

import javax.persistence.*;

@Entity(name = "city")
@Table(name = "City")
public class City implements ICity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column
  private String name;
  @Column
  private String countrycode;
  @Column
  private String district;
  @Column
  private Long population;

  public City(Long id, String name, String countrycode, String district, Long population) {
    this.id = id;
    this.name = name;
    this.countrycode = countrycode;
    this.district = district;
    this.population = population;
  }

  public City() {
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
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
  public String getCountrycode() {
    return countrycode;
  }

  @Override
  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }

  @Override
  public String getDistrict() {
    return district;
  }

  @Override
  public void setDistrict(String district) {
    this.district = district;
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
  public String toString() {
    return "City{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", countrycode='" + countrycode + '\'' +
            ", district='" + district + '\'' +
            ", population=" + population +
            '}';
  }
}
