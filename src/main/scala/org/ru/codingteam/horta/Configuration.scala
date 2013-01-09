package org.ru.codingteam.horta

import java.util.Properties
import java.io.FileInputStream
import scala.collection.JavaConversions._

object Configuration {
  private lazy val properties = {
    val properties = new Properties()
    val stream = new FileInputStream("horta.properties")
    try {
      properties.load(stream)
    } finally {
      stream.close()
    }
    properties
  }

  lazy val login = properties.getProperty("login")
  lazy val password = properties.getProperty("password")
  lazy val server = properties.getProperty("server")
  lazy val rooms = {
    properties filterKeys (_.startsWith("room_"))
  }
}