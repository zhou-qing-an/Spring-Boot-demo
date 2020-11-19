@Grapes([
        @Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.3.5.RELEASE"),
        @Grab("org.webjars:jquery:3.4.1")
])
@Controller
class HelloCLI {
    @RequestMapping("/")
    String test(Model m) {
        m.addAttribute("name", "Mr.Tree")
        return "welcome"
    }
}
