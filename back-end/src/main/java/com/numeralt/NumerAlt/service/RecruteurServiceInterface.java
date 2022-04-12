package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.dto.UserDto;
import com.numeralt.NumerAlt.entity.Recruteur;

public interface RecruteurServiceInterface {

    Recruteur registerNewRecruteurAccount(UserDto userDto) throws Exception;
}
