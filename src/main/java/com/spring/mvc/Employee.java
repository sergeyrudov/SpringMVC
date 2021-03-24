package com.spring.mvc;


import com.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, max = 30, message = "name must be from 2 to 30 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 10, message = "salary should be more than 10 ")
    @Max(value = 4999, message = "salary cannot be more than 5000 ")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private boolean driveLicense;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] equipment;
    private Map<String, String> equipments;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "phone number incorrect, please use format XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales manager");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Toyota", "Toyota");

        equipments = new HashMap<>();
        equipments.put("Base", "Base");
        equipments.put("Normal", "Normal");
        equipments.put("Full", "Full");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    public Map<String, String> getEquipments() {
        return equipments;
    }

    public void setEquipments(Map<String, String> equipments) {
        this.equipments = equipments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", driveLicense=" + driveLicense +
                ", carBrand='" + carBrand + '\'' +
                ", carBrands=" + carBrands +
                ", equipment=" + Arrays.toString(equipment) +
                '}';
    }
}
