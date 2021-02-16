# Project Name
> Caesar cipher

## Table of contents
* [Project description](#project-description)
* [Technologies](#technologies)
* [Setup](#setup)
* [Behaviours](#behaviours)
* [License and Copyright](#license-and-copyright)

## Project description
This an application that uses a substitution cipher in which letters from the user input are replaced by a fixed letter some fixed position in the alphabet.The replacement depends on the number of shifts to be made.Here is a [link](https://en.wikipedia.org/wiki/Caesar_cipher) to know more about the Caesar cipher

## Technologies
* Java - for the application logic
* Gradle - to manage my dependecies,automate my build and compile my Java program 
* JUnit - to test my my behaviours before writing logic for the behaviour

## Setup
1.Clone the project:
```
git clone https://github.com/Breens-Mbaka/caesar-cipher-encoder.git
```
2.Add dependencies(Add this in your build.gradle file)
```
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'
}
```
3.Compile and run your app
```
gradle compilJava or javac App.java
java App
```

## Behaviours
* Encrypt method is able to take only a string
* Encrypt method encrypt correctly
* Decrypt method takes in the encrypt output and returns the original user input

## License and Copyright
[MIT](LICENSE.txt)


## Testing out jenkins
Jenkins
