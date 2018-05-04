# FOODSTORE MODULES

In order to uses this modules create the respective release and use it with JitPAck in the web page https://jitpack.io/

The programm guideline for introduce code is the follow:

* The name of the modules is in plural and with lowercase

* The classes start with uppercase and if it is composed of two words or more then start with uppercase each word.

* The functions start with lowercase

* If the function name consist on two words only the first start with lower case. Example: class salesList().

# INSERT THE DJANGO URL

* In order to insert the django URL is possible use the method "setUrl" of the class OpenConnection

# USING THE CLASS OpenConnection

Use the class open connection implies the use the next methods: 

* "insertData()" that allow do a post into Django view through a json format.
* "obteinData()" that allow get data with json format.
* "json_array(String json, String parameter)" that take a string in json format and insert it into an array, according with the parameter that you choose.  
 
