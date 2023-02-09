# Soarers Converter Containerized

Soarer's Converter is used to convert old keyboard is used to convert old
keyboard.

Here is a [guide](https://sharktastica.co.uk/guides/soarers_1#HowToGet).

The linux tools are built in 32bit, and require more 32bit libraries. That's not
always fun to install, which is why this container image is created.

The container image installs the necessary dependencies needed by Soarer's
tools.

## How to

Source 'sourceme' in order to use my bash functions I've made to simplify using
a container manager.

```
source sourceme
```

### Build container image

```
build
```

### Run the tools

The tools are: scas, scboot, scdis, scinfo, scrd, scwr. Start and enter a
container in order to be able use the tools.

```
run
```

#### Build config:

```
scas ./config/m122.sc ./m122
```

#### Update soarer's converter:

```
scwr ./m122
```

#### Full example

```
build
run
scas ./config/m122.sc ./m122
scwr ./m122
```

Done!

## TODO

+ [ ] Figure out the devices needed for container.
+ [X] Add --privileged.
+ [ ] Test building image and running container using docker.
+ [X] Add ibm model m122 config.
