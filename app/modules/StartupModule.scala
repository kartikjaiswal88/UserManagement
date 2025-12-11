package modules

import play.api.inject._
import startup.AppStartup

class StartupModule extends SimpleModule(
  bind[AppStartup].toSelf.eagerly()
)
