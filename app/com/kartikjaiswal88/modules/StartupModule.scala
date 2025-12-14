package com.kartikjaiswal88.modules

import com.kartikjaiswal88.startup.AppStartup
import play.api.inject._

class StartupModule extends SimpleModule(
  bind[AppStartup].toSelf.eagerly()
)
