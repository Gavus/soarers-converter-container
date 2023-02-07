# Soarers Converter Containerized
 
Soarer's Converter is used to convert old keyboard is used to convert old
keyboard.

Here is a [guide](https://sharktastica.co.uk/guides/soarers_1#HowToGet).

The linux tools are built in 32bit, and require more 32bit libraries. Thats not
always fun to install, which is why this container image is created.

The container image installs the neccessary dependencies needed by Soarer's
tools.


## TODO

+ [ ] Figure out the devices needed for container.
+ [ ] Or add --privileged.
+ [ ] Test building image and running container using docker.

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

The tools are: scas, scboot, scdis, scinfo, scrd, scwr.

```
run <tool> <extra> <arguments>
```
