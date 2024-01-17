
from flask import Flask, jsonify

import eurekaClient

app = Flask(__name__)


@app.route('/api/hello', methods=['GET'])
def hello():
    msg = eurekaClient.getFromService("REGISTRYCHECK","/home")
    return jsonify(msg)


if __name__ == '__main__':
    eurekaClient.init()
    app.run(debug=True,port=8001)

