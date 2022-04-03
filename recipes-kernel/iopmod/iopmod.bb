SUMMARY = "Firmware files for use with Linux kernel"
HOMEPAGE = "https://github.com/frno7/iopmod.git"
DESCRIPTION = "PlayStation 2 input/output processor (IOP) modules."
SECTION = "kernel"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/frno7/iopmod.git;protocol=https;branch=master"
SRC_URI[sha256sum] = "e2e46fa618414952bbf2f6920cd3abcddbef45bfb7d1352994b4bfc35394d177"
SRCREV = "4f0dc8cbe7ef8c90384eb28a9423f0207ec14c18"

S = "${WORKDIR}/git"
DEPENDS = "iopmod-native"

#EXTRA_OEMAKE = ""
export CROSS_COMPILE = "${TARGET_PREFIX}"
export V = "1"

FILES:${PN} += "${base_libdir}/firmware/ps2/"

do_compile() {
        oe_runmake module
        #:
}

do_install() {
        install -d ${D}${base_libdir}/firmware/ps2/
        install -m 0644 module/*.irx ${D}${base_libdir}/firmware/ps2/ || true
}
