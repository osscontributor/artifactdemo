package demo

class DemoController {

    def bankService

    def index() {
        def buffer = new StringBuffer()
        buffer.append "bankService: ${bankService.class.name}"
        buffer.append ", bankService.demoGuard: ${bankService.demoGuard.class.name}"
        buffer.append", bankService.demoGuard.moneyService: ${bankService.demoGuard.moneyService.class.name}"

        render buffer
    }
}
