def call(String DockerHubUserName, String DockerHubPassword) {
    sh """
        echo "----------- login to docker ----------------"
        echo "$DockerHubPassword" | docker login -u "$DockerHubUserName" --password-stdin
        echo "------------- login successfully -----------"
    """
}
