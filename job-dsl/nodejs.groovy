job('NodeJS example') {
    scm {
        git('https://github.com/SachPrecious/job-dsl.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Sach')
            node / gitConfigEmail('sachithrabandara49@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
