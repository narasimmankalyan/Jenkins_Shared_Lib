def call(String DockerHubUserName, String DockerHubPassword){
  sh """
  echo "-----------login_to_docker----------------"
  echo docker login -u $(DockerHubUserName) --password $(DockerHubPassword)
  echo "-------------login_successfully---------------"
  """
}
