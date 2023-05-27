def call(Map stageParams){
    checkout([
        $class:'gitSCM',
        branches: [[name: stageParams.branch ]],
        userRemoteCongigs:[[ url: stageParams.url ]]
    ])
}