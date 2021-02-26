function fn() {
    var env = karate.env;
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev';
    }
    var config = {
        myUrlBase: 'http://localhost:3000/'
    };

    // don't waste time waiting for a connection or if servers don't respond within 1 second
    karate.configure('connectTimeout', 1000);
    karate.configure('readTimeout', 1000);
    return config;
}
