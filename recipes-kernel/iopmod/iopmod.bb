SUMMARY = "Firmware files for use with Linux kernel"
HOMEPAGE = "https://github.com/frno7/iopmod.git"
DESCRIPTION = "Linux firmware is a package distributed alongside the Linux kernel \
that contains firmware binary blobs necessary for partial or full functionality \
of certain hardware devices."
SECTION = "kernel"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
#PE = "1"

SRC_URI = "git://github.com/frno7/iopmod.git;protocol=https;branch=master"
#SRC_URI[sha256sum] = "e2e46fa618414952bbf2f6920cd3abcddbef45bfb7d1352994b4bfc35394d177"
SRCREV = "4f0dc8cbe7ef8c90384eb28a9423f0207ec14c18"
