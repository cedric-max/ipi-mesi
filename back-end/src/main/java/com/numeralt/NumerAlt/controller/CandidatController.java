package com.numeralt.NumerAlt.controller;

import com.numeralt.NumerAlt.dto.UserDto;
import com.numeralt.NumerAlt.entity.Candidat;
import com.numeralt.NumerAlt.service.CandidatServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/candidat")
@CrossOrigin(origins = "http://localhost:8080")
public class CandidatController {

    @Autowired
    private CandidatServiceInterface candidatService;

    /**
     * Cette méthode permet de gérer le retour d'erreur en cas de non validation du formulaire d'inscription
     * @param ex
     * @return map contenant les erreurs par champ du formulaire d'inscription
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName;
            try {
                fieldName = ((FieldError) error).getField();
            } catch(ClassCastException e) {
                fieldName = "matchingPassword";
            }
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    /**
     * Cette méthode correspond à la création d'un profil candidat en BDD
     * @param userDto
     * @return
     */
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/registration",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public UserDto registerCandidatAccount(@RequestBody @Valid UserDto userDto) {
        try {
            Candidat registered = candidatService.registerNewCandidatAccount(userDto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userDto;
    }

}
