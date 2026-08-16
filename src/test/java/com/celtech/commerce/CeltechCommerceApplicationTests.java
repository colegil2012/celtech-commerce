package com.celtech.commerce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1",
    "spring.datasource.driver-class-name=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.jpa.hibernate.ddl-auto=create-drop",
    "stripe.api.secret-key=sk_test_placeholder",
    "stripe.webhook.secret=whsec_placeholder"
})
class CeltechCommerceApplicationTests {

    @Test
    void contextLoads() {
    }

}
