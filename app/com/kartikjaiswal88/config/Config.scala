package com.kartikjaiswal88.config

import play.api.Logger

object Config {
  private val logger = Logger(this.getClass)

  var user, password, url = ""

  def init() = {
    logger.info("Environment Variables Initialization Started....")

    url = sys.env.get("DB_URL").getOrElse(throw new Exception("DB_URL is Missing"))
    user = sys.env.get("DB_USER").getOrElse(throw new Exception("DB_USER is Missing"))
    password = sys.env.get("DB_PASSWORD").getOrElse(throw new Exception("DB_PASSWORD is Missing"))

    logger.info("Environment Variables Initialization Finished....")
  }

}
