package org.mvnsearch.demo

import assertk.assertThat
import assertk.assertions.isNotEmpty
import org.junit.jupiter.api.Test

/**
 * Spring Boot App test
 *
 * @author linux_china
 */
class SpringBootAppTest : SpringBootBaseTestCase() {
    @Test
    fun testSpike() {
        assertThat("good").isNotEmpty()
    }
}