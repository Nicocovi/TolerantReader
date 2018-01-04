# TolerantReader_Example

Example to verify relevant Tolerant Reader Use Cases from SXXXX Servicearchitecture Guideline.

"Be liberal in what you accept <br>
be conservative in that what you send"

Source: [Martin Fowler](https://martinfowler.com/bliki/TolerantReader.html)

## Table of contents

* [Table of contents](#table-of-contents)
  * [Introduction](#Introduction) 
    * [Problem Statement](#problem-statement) 
    * [Purpose](#purpose) 
    * [Visionary Scenario](#visionary-scenario)
  * [Use Case](#use-case)
  * [System Design](#system-design)
  * [Administrator Manual](#administrator-manual)
  * [Sources](#sources)
  
## Introduction

### Problem Statement

The tolerant reader pattern was coined by Martin Fowler as a way to reduce the coupling between the consumer and provider of a web service. 
The pattern tries to minimize the impact on existing consumers in case the service contract changes.

### Purpose



### Visionary Scenario

## Use Case

1. Use Case:

Service Provider gets more elements than it expects.

2. Use Case:

Service Consumer gets more elements than it expects.

## System Design

### Project Setup

Tools used:

* Spring-WS 2.4
* Spring Boot 1.5
* Maven 3.5

As Spring Web Services is contract first only, we need to start from a contract definition. 
In this tutorial, we will use a XXX service that is defined by below WSDL. 
The service takes as input XXX and returns a XXX.

### Service Provider

#### Implementation

Click [here](https://github.developer.allianz.io/AZDBusinessArchitecture/TolerantReader_Example/tree/master/java/Service%20Provider) to see the implementation of the Service Provider.

### Service Consumer

#### Implementation

Click [here](https://github.developer.allianz.io/AZDBusinessArchitecture/TolerantReader_Example/tree/master/java/Service%20Consumer) to see the implementation of the Service Consumer.

## Administrator Manual



## Sources

[Spring WS - SOAP Web Service Consumer Provider WSDL Example](https://www.codenotfound.com/2016/10/spring-ws-soap-web-service-consumer-provider-wsdl-example.html)

[Spring WS - SOAP Tolerant Reader Example](https://www.codenotfound.com/2017/07/spring-ws-soap-tolerant-reader-example.html)

[Spring Web Services Reference Documentatio](https://docs.spring.io/spring-ws/docs/2.4.0.RELEASE/reference/htmlsingle/)

[Making SOAP requests using Postman](http://blog.getpostman.com/2014/08/22/making-soap-requests-using-postman/)

[JAXB - Tutorial](http://www.vogella.com/tutorials/JAXB/article.html)

[jaxb2-maven-plugin: Basic Examples - Java Generation](http://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.2/example_xjc_basic.html)



