job {
    name "redis"
    scm {
        git("https://github.com/antirez/redis.git", "*/unstable")
    }
    wrappers {
        timeout 20
    }
    triggers {
        scm("* * * * *")
    }
    logRotator(-1, 20, -1, -1)
    steps {
        shell("""set -e
make""")
    }
    publishers {
        archiveArtifacts("src/redis-server,src/redis-cli", "", true)
        downstream("staging-deploy")
    }
}
