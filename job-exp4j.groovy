job(type: Maven) {
    name "exp4j"
    scm {
        git("https://github.com/fasseg/exp4j.git", "*/master")
    }
    wrappers {
        timeout 20
    }
    triggers {
        scm("* * * * *")
    }
    logRotator(-1, 20, -1, -1)
    rootPOM("pom.xml")
    goals("test")
}