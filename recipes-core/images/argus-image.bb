SUMMARY = "Argus Operating System base image"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

LICENSE = "MIT"

EXTRA_IMAGE_FEATURES:remove = "debug-tweaks"

inherit core-image
