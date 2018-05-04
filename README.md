# FOODSTORE MODULES

In order to uses this modules create the respective release and use it with JitPAck in the web page https://jitpack.io/

The programm guideline for introduce code is the follow:

* The name of the modules is in plural and with lowercase

* The classes start with uppercase and if it is composed of two words or more then start with uppercase each word.

* The functions start with lowercase

* If the function name consist on two words only the first start with lower case. Example: class salesList().

# MODULE FOODSTOREWEBSERVICECONNECTION

INSERT THE DJANGO URL

* In order to insert the django URL is possible use the method "setUrl" of the class OpenConnection

USING THE CLASS "OpenConnection"

Use the class open connection implies the use the next methods: 

* "insertData()" that allow do a post into Django view through a json format.
* "obteinData()" that allow get data with json format.
* "json_array(String json, String parameter)" that take a string in json format and insert it into an array, according with the parameter that you choose.  
 
# MODULE FOODSTOREEXCEPTION

INSERT THE DJANGO URL

* In order to insert the django URL is possible use the method "setUrl" of the class Exceptions

USING THE CLASS "Exceptions"

Use the class open connection implies the use of the next methods: 

* "stinException(String nameField, Editable stringAnalize, int max)" that is used to analize that there are not only double numbers and string smaller than determined size(max). The parameters that take is "nameField" = the name of the parameter to analize as example: name, description. "stringAnalize" = that is the editable obtained of the textbox. "max" that is the maximum number of characters that could have the textbox.

* "stinException(String nameField,Editable number)" that verifies that there are a integer "stock" or a double number "cost". The parameters that take is "nameField" = the name of the parameter to analize stock or cost preferably. "number" = that is the max size of the "stock" and "cost".




