制作钥匙：

在装有java环境里
1，切换到DatGen.java目录,比如E目录
2，E:\>javac -d ./ DatGen.java
3，E:\>java DatGen '{"ipList":["127.0.0.1"],"codeList":["805000","805001","805002","805003","805004","805005","805020","805021","805022","805023","805024","805025","805026","805027","805040","805041","805042","805043","805044","805045","805046","805047","805048","805049","805050","805051","805052","805053","805054","805055","805056","805057","805058","805059","805060","805061","805062","805063","805070","805071","805072","805073","805074","805075","805076","805077","805080","805081","805082","805090","805091","805100","805101","805102","805110","805111","805112","805113","805114","805300","805310","805900","805901","805902","805903","806000","806001","806002","806003","806004","806010","806011","806012","806013","806014"]}'

4，拷贝当前目录下的“config.dat"到项目“{项目路径}\src\main\resources"
5，验证：项目跑起来。在浏览器输入“http://IP:端口/项目名/api"，出现版本信息即成功。


部署步骤：
1、包上传
scp -P22 ./std-user.war root@121.43.101.148:/home
T6dh%$%$ss1
  
2，部署
  ssh root@121.43.101.148 -p 22
  T6dh%$%$ss1
   --------------------common
  cd /home/wwwroot/common/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  http://121.43.101.148:8905/std-user/api
 
  cd /home/wwwroot/caigo/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
  http://121.43.101.148:5305/std-user/api
  
 --------------------cswlm
  cd /home/wwwroot/forum/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
  http://121.43.101.148:5405/std-user/api
  
  --------------------jj-service
  cd /home/wwwroot/jj-service/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
  http://121.43.101.148:5505/std-user/api
  
  --------------------cdhome
  cd /home/wwwroot/cdhome/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
http://121.43.101.148:6302/std-user/api

  --------------------mall  --------------------
  cd /home/wwwroot/b2cmall/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  http://121.43.101.148:6405/std-user/api
  
  --------------------push-sms
  cd /home/wwwroot/push-sms/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
http://121.43.101.148:6505/std-user/api
  
  --------------------zhpay
  cd /home/wwwroot/zhpay/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
  http://121.43.101.148:5605/std-user/api
  
   --------------------qlqq
  cd /home/wwwroot/ride/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
     --------------------loan
  cd /home/wwwroot/loan/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
  http://121.43.101.148:5805/std-user/api
  
       --------------------game
  cd /home/wwwroot/game/tomcat_std_user/webapps
  cp ./std-user/WEB-INF/classes/application.properties .
  cp ./std-user/WEB-INF/classes/config.properties .
  
  rm -rf std-user.war
  rm -rf std-user
  mv /home/std-user.war .
  
  mv -f application.properties ./std-user/WEB-INF/classes/
  mv -f config.properties ./std-user/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  http://118.178.124.16:8905/std-user/api
  
    http://121.43.101.148:8905/std-user/api
  
  
