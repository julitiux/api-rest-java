package com.apirest

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

class SpockSpec extends Specification {

  def ""() {
    println "esta es una mugre prueba"
    expect:
    assert 1 + 1 == 2
  }

}
