# Java MicroProfile Stack

The Java MicroProfile stack provides a consistent way of developing microservices based upon the [Eclipse MicroProfile specifications](https://microprofile.io). This stack lets you use [Maven](https://maven.apache.org) to develop applications for [Open Liberty](https://openliberty.io) runtime, that is running on OpenJDK with container-optimizations in OpenJ9.

The Java MicroProfile stack uses a parent Maven project object model (POM) to manage dependency versions and provide required capabilities and plugins.

This stack is based on OpenJDK 12 with container-optimizations in OpenJ9 and `Open Liberty v19.0.0.7`. It provides live reloading during development by utilizing `loose application` capabilities.

**Note:** Maven is provided by the Appsody stack container, allowing you to build, test, and debug your Java application without installing Maven locally. However, we recommend installing Maven locally for the best IDE experience.


## Templates

Templates are used to create your local project and start your development. When initializing your project you will be provided with an Open Liberty template application.

The default template provides a `pom.xml` file that references the parent POM defined by the stack and enables Liberty features that support [Eclipse MicroProfile 2.2](https://openliberty.io/docs/ref/feature/#microProfile-2.2.html).


## Getting Started

1. Create a new folder in your local directory and initialize it using the Appsody CLI, e.g.:
    ```bash
    mkdir my-project
    cd my-project
    appsody init java-microprofile
    ```

    This will initialize a Java MicroProfile project using the default template.

    **Note:** This contains changes in the `java-microprofile` stack that haven't been published yet. Therefore, edit the `.appsody-config.yaml` file and its `stack` property to `stack: sdaschner/java-microprofile:0.3.0`

2. Once your project has been initialized, you can run your application using the following command:

    ```bash
    appsody run
    ```

    This launches a Docker container that starts your application in the foreground, exposing it on port 9080.

    You can continue to edit the application in your preferred IDE (Eclipse, VSCode or others) and your changes will be reflected in the running container within a few seconds.

3. You should be able to access the following endpoints, as they are exposed by your template application by default:

    `curl http://localhost:9080/hello/resources/hello`

4. Now you can edit the code, for example in the `Hello.java` class, and see the changes immediately being reflected in the `/hello` resource.
