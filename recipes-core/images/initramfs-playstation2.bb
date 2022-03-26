SUMMARY = "Extremely basic live image init script"
LICENSE = "MIT"

INITRAMFS_SCRIPTS = "\
                      initramfs-framework-base \
                      initramfs-module-setup-live \
                      initramfs-module-udev"
#${INITRAMFS_SCRIPTS}
PACKAGE_INSTALL = " ${VIRTUAL-RUNTIME_base-utils} iopmod udev base-passwd ${ROOTFS_BOOTSTRAP_INSTALL}"

INITRAMFS_FSTYPES = "cpio.xz"

# Do not pollute the initrd image with rootfs features
IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image
