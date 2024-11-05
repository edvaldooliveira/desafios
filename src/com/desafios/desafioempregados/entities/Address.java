package com.desafios.desafioempregados.entities;

public class Address {
    private String email;
    private String phone;

    public Address() {
    }

    public Address(String email, String phone) {
        setEmail(email); // Verificação de email ao definir
        setPhone(phone); // Verificação de telefone ao definir
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("^\\+?[0-9]{7,15}$")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Telefone inválido");
        }
    }
}
