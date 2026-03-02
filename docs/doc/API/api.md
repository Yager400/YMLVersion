# API Documentation

Official YMLVersion documentation covering all available functions.
___

Create a builder for your YML file:
```java
YMLVersion.builder()
```
Set the version that the API will use to update your YML file:
```java
.builder().version(String version)
```
Provide your plugin instance to the API. This is required for operations such as accessing the dataFolder and saving resources:
```java
.builder().plugin(Plugin plugin)
```
Specify the resource name to be saved. The resource should exist inside your plugin’s JAR file:
```java
.builder().resource(String resourceName)
```
Set the version key for the YML file. This key is used to compare the current YML version with the new one:
```java
.builder().versionKey(String versionKey)
```
Build the YMLVersion configuration and update the YML file.
(Run this method at the end of your configuration chain):
```java
.builder().build()
```
If the version key does not exist, should the API still update the YML file?
(By default, this option is set to true.)
```java
// OPTIONAL
.builder().updateIfVersionKeyNull(boolean update)
```
