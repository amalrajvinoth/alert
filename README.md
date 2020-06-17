# Getting Started
```
clone `https://github.com/amalrajvinoth/alert`
cd alert

mvn clean spring-boot:run
```

# Table Structure

```
alert
	..

team
	team_id
	team_name
	server_id
	created
	updated

server
	server_id
	server_name
	host
	created
	updated

schedule
	id
	team_id
	phone
```

# Info

```
H2 console url: http://localhost:8080/h2-console
DB Url(unix): jdbc:h2:file:${user.home}/alert
user: sa
pwd: sa
```

# Rest APIs

* Create Alert

```
curl --request POST \
  --url http://localhost:8080/v1/alerts \
  --header 'content-type: application/json' \
  --cookie JSESSIONID=3AD3CE8A8EC6AA592EFBDC317356462F \
  --data '{
	"severity": "WARNING",
	"host": "oem.se.com",
	"metric": "memUsedPct",
	"message": "Memory is almost full",
	"keyValueName": "test",
	"ruleName": "Memory Check",
	"ruleOwner": "jenifer@se.com",
	"targetUrl": "https://prod.se.com/alert",
	"targetType": "alert",
	"targetVersion": "1.0.0",
	"targetLifeCycleStatus": "OK",
	"notificationType": "alert",
	"eventReportedTime": "2020-05-23T18:39:29.926Z",
	"metricGroup": "Prod Alert"
}'
```

* Update Alert

```
curl --request PUT \
  --url http://localhost:8080/v1/alerts/dac17ae4-2e1b-4a9f-89e8-0ebf236b77fd \
  --header 'content-type: application/json' \
  --cookie JSESSIONID=3AD3CE8A8EC6AA592EFBDC317356462F \
  --data '{
	"severity": "WARNING-128",
	"host": "oem.se.com",
	"metric": "memUsedPct",
	"message": "Memory is almost full",
	"keyValueName": "test",
	"ruleName": "Memory Check",
	"ruleOwner": "jenifer@se.com",
	"targetUrl": "https://prod.se.com/alert",
	"targetType": "alert",
	"targetVersion": "1.0.0",
	"targetLifeCycleStatus": "OK",
	"notificationType": "alert",
	"eventReportedTime": "2020-05-23T18:41:01.722Z",
	"metricGroup": "Prod Alert"
}'
```

* Get Alert

```
curl --request GET \
  --url http://localhost:8080/v1/alerts/dac17ae4-2e1b-4a9f-89e8-0ebf236b77fd \
  --header 'content-type: application/json' \
  --cookie JSESSIONID=3AD3CE8A8EC6AA592EFBDC317356462F
```

* Delete Alert

```
curl --request DELETE \
  --url http://localhost:8080/v1/alerts/dac17ae4-2e1b-4a9f-89e8-0ebf236b77fd \
  --header 'content-type: application/json' \
  --cookie JSESSIONID=3AD3CE8A8EC6AA592EFBDC317356462F
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)

