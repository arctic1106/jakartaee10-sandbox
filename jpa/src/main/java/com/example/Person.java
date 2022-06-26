package com.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private int age = 30;
    private Gender gender = Gender.MALE;
    private Integer yearsWorked = 2;
    private LocalDateTime birthDay = LocalDateTime.now().minusYears(30);
    private BigDecimal salary = new BigDecimal("81234.56");
    private BigDecimal hourlyRate = new BigDecimal("33.33");

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public Integer getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(Integer yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public static enum Gender {
        MALE, FEMALE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", yearsWorked=" + yearsWorked +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}