job {
    name 'staging-deploy'
    displayName 'Deploy to staging'

    steps {
        shell """
        /usr/games/cowsay "Deploying to staging!"
        """
    }
}
