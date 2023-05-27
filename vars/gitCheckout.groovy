def call(Map stageParams){
    checkout([
        $class:'GitSCM',
        branches: [[name: stageParams.branch ]],
        userRemoteCongigs:[[ url: stageParams.url ]]
    ])
}