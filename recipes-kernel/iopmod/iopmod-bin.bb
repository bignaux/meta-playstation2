LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
SRC_URI = "https://github.com/bignaux/iopmod/releases/download/latest/iopmod-modules-0d0724a.tar.gz"
SRC_URI[sha256sum] = "82378c542af41f0d8863071deabb16a9c244e2b251b15a89c705ae4c62669521"
COMPATIBLE_MACHINE = "playstation2"
FILES:${PN} += "${base_libdir}/firmware/ps2/"

inherit bin_package

S = "${WORKDIR}"

do_install() {
        install -d ${D}${base_libdir}/firmware/ps2/
        install -m 0644 module/*.irx ${D}${base_libdir}/firmware/ps2/
}
