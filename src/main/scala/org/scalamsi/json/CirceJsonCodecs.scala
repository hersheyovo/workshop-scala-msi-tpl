package org.scalamsi.json

import io.circe.{Decoder, Encoder, ObjectEncoder}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import org.scalamsi.{CommandResult, Trip, Trips, Vehicle}
import org.http4s.circe.{CirceEntityDecoder, CirceEntityEncoder}
import io.circe.java8.time.decodeLocalDate

trait CirceJsonCodecs extends CirceEntityDecoder with CirceEntityEncoder{
  implicit val vehicleEncoder: Encoder[Vehicle.Value] = Encoder.enumEncoder(Vehicle)
  implicit val vehicleDecoder: Decoder[Vehicle.Value] = Decoder.enumDecoder(Vehicle)

  implicit val tripEncoder: ObjectEncoder[Trip] = ???
  implicit val tripDecoder: Decoder[Trip] = ???

  implicit val tripsEncoder: ObjectEncoder[Trips] = ???
  implicit val tripsDecoder: Decoder[Trips] = ???

  implicit val commandResultEncoder: ObjectEncoder[CommandResult] = ???
  implicit val commandResultDecoder: Decoder[CommandResult] = ???
}
