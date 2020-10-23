/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.churchcommunitybuilder;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AppTest {

    @Test
    void constructorTransportMustNotBeNull() {
        assertThrows(
                NullPointerException.class,
                () -> {
                    var credential = new Credential.Builder(BearerToken.authorizationHeaderAccessMethod()).build();
                    new App(null, credential);
                }
        );
    }

    @Test
    void constructorCredentialsMustNotBeNull() {
        assertThrows(
                NullPointerException.class,
                () -> {
                    var transport = GoogleNetHttpTransport.newTrustedTransport();
                    new App(transport, null);
                }
        );
    }

}
