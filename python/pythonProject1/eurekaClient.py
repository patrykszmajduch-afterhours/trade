import py_eureka_client.eureka_client as eureka_client

your_rest_server_port = 9090
# The flowing code will register your server to eureka server and also start to send heartbeat every 30 seconds

def init():
    eureka_client.init(eureka_server="http://127.0.0.1:8761/eureka",
                   app_name="pythong",
                   instance_port=8001)

def getFromService(serviceName, path):
    res = eureka_client.do_service(serviceName, path)
    return res