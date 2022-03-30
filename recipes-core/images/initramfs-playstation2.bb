SUMMARY = "Extremely basic live image init script"
LICENSE = "MIT"

INITRAMFS_SCRIPTS = "\
                      initramfs-framework-base \
                      initramfs-module-setup-live \
                      initramfs-module-udev"

PACKAGE_INSTALL = " \
                      kernel-modules ${INITRAMFS_SCRIPTS} \
                      ${VIRTUAL-RUNTIME_base-utils} iopmod-bin udev \
                      base-passwd ${ROOTFS_BOOTSTRAP_INSTALL}"

INITRAMFS_FSTYPES = "cpio.xz"
#INITRAMFS_FSTYPES = "cpio.gz"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image
