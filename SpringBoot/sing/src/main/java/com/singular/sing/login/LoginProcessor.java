package com.singular.sing.login;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;



@Component
/*
 * Um bean com escopo de solicitação é um objeto gerenciado pelo Spring,
 * para o qual a estrutura cria uma nova instância para cada solicitação HTTP
 */
@RequestScope
public class LoginProcessor {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean login() {
    String user = this.getUsername();
    String password = this.getPassword();

    if ("user".equals(user) && "senha".equals(password)) {
      return true;
    } else {
      return false;
    }
  }

}
