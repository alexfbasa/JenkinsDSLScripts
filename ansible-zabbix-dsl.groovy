pipelineJob('ansible-zabbix-agent-job') {
    description('This Job will install Zabbix agent in a Linux host using Ansible.')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/alexfbasa/AnsibleZabbix.git')
                        credentials('ansibleKey')
                    }
                    branch('master')
                }
            }
            scriptPath('cicd/Jenkinsfile')
        }
    }
}
