job {
    name 'prepare-release'
    displayName 'Prepare Release'

    parameters {
        stringParam('NEW_VERSION', 'x.x.x', 'Semantic version')
    }

    steps {
        copyArtifacts("redis", "", "", true) {
            latestSuccessful()
        }

        shell """
        shasum redis-*
        /usr/games/cowsay "Releasing version \$NEW_VERSION"
        """
    }
}
