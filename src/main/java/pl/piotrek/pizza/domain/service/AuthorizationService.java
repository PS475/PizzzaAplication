package pl.piotrek.pizza.domain.service;

import pl.piotrek.pizza.domain.exception.UnauthorizedException;

public class AuthorizationService {
    public static void checkToken(String token){
        if(token == null || !token.equals("xyz")){
            throw new UnauthorizedException("Bledny token");
        }
    }
}
