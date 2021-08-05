Инструкция по запуску

1. Клонировать проект
2. "Trust project"
3. Add Configuration - Add new - Application - Main class: AlfaRestApplication - OK
4. Run

Сервис доступен по адресу:
http://localhost:8080/show/{value1}&{value2}

где
{value1} - код валюты, для которой необходимо узнать курс других валют
(для используемого id доступна только валюта USD);
{value2} - код валюты, для которой необходимо узнать изменение курса по сравнению со вчерашним днём

Список доступных кодов валют:
https://docs.openexchangerates.org/docs/supported-currencies