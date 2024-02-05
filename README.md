# Spring Boot with Logstash Project

This project demonstrates the integration of a Spring Boot application with Logstash for logging, alongside Elasticsearch for data persistence and Kibana for data visualization. It leverages Docker Compose to simplify the setup and running of the services.

## Quick Start

To get started with this project, you'll need to have Docker and Docker Compose installed on your machine. Once installed, you can launch the entire stack using Docker Compose.

### Prerequisites

- Docker
- Docker Compose

### Running the Project

1. **Clone the Repository**

    ```bash
    git clone https://github.com/maxiplux/loggin-elk-2024.git
    cd loggin-elk-2024
    ```

2. **Start the Services**

    Launch all services using Docker Compose:

    ```bash
    docker compose up -d
    ```

    This command starts the following services:
    - Elasticsearch (`es`)
    - Logstash (`log`)
    - Kibana (`kib`)
    - Your Spring Boot application (configuration needed)

3. **Verify the Services**

    After starting the services, you can verify each one is running correctly by accessing their web interfaces:
    - Elasticsearch: [http://localhost:9200](http://localhost:9200)
    - Kibana: [http://localhost:5601](http://localhost:5601)
    - Logstash logs can be checked by accessing the Docker container logs.

### Configuring Spring Boot for Logstash

To configure your Spring Boot application to send logs to Logstash, you will need to add the appropriate Logstash dependencies and configuration to your `application.properties` or `application.yml`. An example configuration snippet is provided below:

```properties
# Spring Boot application.properties example
logging.level
