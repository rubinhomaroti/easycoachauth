package br.com.fiap.easycoachauth.easycoachauth.service;

import br.com.fiap.easycoachauth.easycoachauth.dto.AuthDTO;
import br.com.fiap.easycoachauth.easycoachauth.dto.JwtDTO;
import br.com.fiap.easycoachauth.easycoachauth.dto.UserCreateDTO;
import br.com.fiap.easycoachauth.easycoachauth.dto.UserDTO;

public interface UserService {
    UserDTO create(UserCreateDTO userCreateDTO);
    JwtDTO login(AuthDTO authDTO);
}

