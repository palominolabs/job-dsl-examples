job {
    name 'prepare-release'
    displayName 'Prepare Release'

    parameters {
        stringParam('NEW_VERSION', 'x.x.x', 'Semantic version')
    }

    steps {
        shell """
        /usr/games/cowsay "Tagging version \$NEW_VERSION"
        """
    }
}
