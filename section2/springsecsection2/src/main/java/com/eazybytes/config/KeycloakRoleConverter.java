package com.eazybytes.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeycloakRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

  public Collection<GrantedAuthority> convert(Jwt source) {
    //    Map<String, Object> realmAccess = (Map<String, Object>)
    // source.getClaims().get("realm_access");
    //    if (realmAccess == null || realmAccess.isEmpty()) {
    //      return new ArrayList<>();
    //    }
    //    Collection<GrantedAuthority> authorities =
    //            ((List<String>) realmAccess.get("roles"))
    //                    .stream()
    //                    .map(roleName -> "ROLE_" + roleName)
    //                    .map(SimpleGrantedAuthority::new)
    //                    .collect(Collectors.toList());
    //
    //    return authorities;

    ArrayList<String> roles = (ArrayList<String>) source.getClaims().get("roles");

    Collection<GrantedAuthority> authorities =
        roles.stream()
            .map(roleName -> "ROLE_" + roleName)
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());
    return authorities;
  }
}
