FROM debian:11

WORKDIR /usr/local/bin
COPY Soarer_sctools_v1.10_linux.tar.gz ./tools.tar.gz
RUN tar -xzvf ./tools.tar.gz && rm tools.tar.gz

RUN dpkg --add-architecture i386 \
  && apt-get update \
  && apt-get install \
    libc6-i386 \
    libusb-0.1-4:i386 \
    libstdc++6:i386 \
    -y
