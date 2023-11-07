DESCRIPTION = "Argus Operating System ramdisk image"

INITRAMFS_SCRIPTS ?= "\
    initramfs-framework-base \
"

PACKAGE_INSTALL = "\
    ${INITRAMFS_SCRIPTS} \
    ${VIRTUAL-RUNTIME_base-utils} \
"

IMAGE_FEATURES = ""

export IMAGE_BASENAME = "argus-image-ramdisk"
IMAGE_NAME_SUFFIX ?= ""
IMAGE_LINGUAS = ""

LICENSE = "MIT"

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"
