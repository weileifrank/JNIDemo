LOCAL_PATH:=$(call my-dir)

include $(CLEAR_VARS)

#libtestjni.so
LOCAL_MODULE := testjni
LOCAL_SRC_FILES := test.cpp
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)