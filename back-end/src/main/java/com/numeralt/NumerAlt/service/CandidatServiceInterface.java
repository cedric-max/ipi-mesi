package com.numeralt.NumerAlt.service;

import com.numeralt.NumerAlt.dto.UserDto;
import com.numeralt.NumerAlt.entity.Candidat;

public interface CandidatServiceInterface {
    Candidat registerNewCandidatAccount(UserDto userDto) throws Exception;
}
