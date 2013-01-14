package ru.org.codingteam.horta.actors.core

import ru.org.codingteam.horta.security.UserRole
import akka.actor.ActorRef

case class Command(name: String, role: UserRole, targetPlugin: ActorRef)