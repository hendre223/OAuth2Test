package com.hendre.oauth2;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public Map<String, Object> GetCurrentUser(OAuth2AuthenticationToken aToken) {
        return aToken.getPrincipal().getAttributes();
    }

}
