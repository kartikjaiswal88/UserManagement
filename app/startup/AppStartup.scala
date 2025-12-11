package startup

import javax.inject._
import play.api.Logger
import play.api.inject.ApplicationLifecycle
import scala.concurrent.Future

@Singleton
class AppStartup @Inject() (lifecycle: ApplicationLifecycle):

  private val logger = Logger(this.getClass)

  // ======================
  // STARTUP LOGIC
  // ======================

  logger.info("Application starting...")

  onStartup()

  private def onStartup(): Unit =
    println("hello.......................")
    logger.info("Running startup initialization")
  // TODO:
  // Read config map
  // Initialize DB pool
  // Initialize external clients

  // ======================
  // SHUTDOWN LOGIC
  // ======================

  lifecycle.addStopHook { () =>
    println("He..................")
    logger.info("Application shutting down...")
    onShutdown()
  }

  private def onShutdown(): Future[Unit] =
  // Close DB pool
  // Close clients
  Future.successful(())
