package com.example.backend.api;

import com.example.backend.model.Debt;
import com.example.backend.model.Participant;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DebtsApiImpl implements DebtsApi {

    /**
     * GET /debts/from/{userId}/to/{userIdTo} : Abfrage Schulden für Benutzer, nach einem anderen Benutzer
     *
     * @param userId   ID der User (required)
     * @param userIdTo ID der User, dem geschuldet wird (required)
     * @return Schulden für Beteiligten (status code 200)
     */
    @Override
    public ResponseEntity<List<Debt>> getDebtsBetweenUsers(Long userId, Long userIdTo) {
        List<Debt> res = new ArrayList<>(2);
        res.add(new Debt().id(1L).name("Popcorn").summe(50.0F).sourcePerson(new Participant().name("John")).targetPerson(new Participant().name("Sascha")));
        res.add(new Debt().id(1L).name("Lala").summe(25.0F).sourcePerson(new Participant().name("John")).targetPerson(new Participant().name("Sascha")));
        return ResponseEntity.ok(res);
    }

    /**
     * GET /debts/from/{userId} : Abfrage Schulden für Benutzer
     *
     * @param userId ID der User (required)
     * @return Schulden für Beteiligten (status code 200)
     */
    @Override
    public ResponseEntity<List<Debt>> getDebtsForUser(Long userId) {
        return DebtsApi.super.getDebtsForUser(userId);
    }

    /**
     * POST /debts/from/{userId}/to/{userIdTo} : Ablage Schulden für Benutzer, nach einem anderen Benutzer
     *
     * @param userId      ID der User (required)
     * @param userIdTo    ID der User, dem geschuldet wird (required)
     * @param participant Liste Schulden (required)
     * @return Operation erfolgreich (status code 200)
     */
    @Override
    public ResponseEntity<String> updateDebtsBetweenUsers(Long userId, Long userIdTo, List<Participant> participant) {
        return DebtsApi.super.updateDebtsBetweenUsers(userId, userIdTo, participant);
    }
}
