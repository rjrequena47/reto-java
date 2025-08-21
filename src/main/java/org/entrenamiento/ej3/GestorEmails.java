package org.entrenamiento.ej3;

import java.util.HashSet;
import java.util.Set;

public class GestorEmails {
    private Set<String> emails;

    public GestorEmails() {
        this.emails = new HashSet<>();
    }
    
    public GestorEmails(Set<String> emails) {
        this.emails = emails;
    }

    public Boolean agregarEmail(String email) {
        if(email == null || email.isEmpty()) {
            return false;
        }else{
            if(existeEmail(email)){
                return false;
            }
            this.emails.add(email);
            return true;
        }
    }

    public Set<String> getEmails() {
        return this.emails;
    }

    public int getCantidadEmails() {
        return this.emails.size();
    }

    public boolean existeEmail(String email) {
        return this.emails.contains(email);
    }

    public Boolean eliminarEmail(String email) {
        if(email == null || email.isEmpty()) {
            return false;
        }
        return this.emails.remove(email);
    }
}