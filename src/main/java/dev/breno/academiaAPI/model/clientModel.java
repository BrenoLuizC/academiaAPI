package dev.breno.academiaAPI.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clients")
public class clientModel {

    Long id;
    String name;
    int age;

    public clientModel() {}

    public clientModel(Long id, String nome, int age) {
        this.id = id;
        this.name = nome;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
