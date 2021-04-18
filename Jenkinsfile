//写流水线的脚本（声明式、脚本式）
pipeline{
    //全部的CICD流程都需要在这里定义

    //任何一个代理可用就可以执行
    agent any

    //定义一些环境信息
    environment {
      hello = "123456"
      world = "456789"
    }

    //定义流水线的加工流程
    stages {
        //流水线的所有阶段
        stage('环境检查'){
            steps {
               sh 'printenv'
               echo "正在检测基本信息"
               sh 'java -version'
               sh 'git --version'
               sh 'docker version'
               sh 'pwd && ls -alh'
            }
        }
        //1、编译 "abc"
        stage('编译'){
            agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
               //git下载来的代码目录下
               sh 'pwd && ls -alh'
               sh 'mvn -v'

            }
        }

        //2、测试
        stage('测试'){
            steps {
                echo "测试..."
            }
        }

        //3、打包
        stage('打包'){
            steps {
                echo "打包..."
            }
        }

        //4、部署
        stage('部署'){
            steps {
                echo "部署..."
            }
        }
    }

}