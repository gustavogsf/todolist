package br.com.gustavogabriel.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * Modificadores
 * public - publico, qualquer pode acessar
 * private - pussui maior reestriçao 
 * protected - acesso quando está na mesma estrutura do pacote
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integer (numeros inteiros)
     * Double (numeros decimais 0.0000)
     * Float (numeros decimais 0.000)
     * char (A C )
     * Date (data)
     * void (nao possui retorno do metodo, apenas roda uma logica)
     */

    /*
     * Body
     */

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if(user != null) {
            // Mensagem de error
            // Status Code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
        }

        var passwordHashred = BCrypt.withDefaults()
        .hashToString(12, userModel.getPassword().toCharArray());

        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }
}
