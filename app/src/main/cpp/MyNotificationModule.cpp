#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring  JNICALL
Java_com_myproject_MyNotificationModule_getNotification(JNIEnv* env, jobject /* this */) {
    std::string notification = "Notification from C++";
    return env->NewStringUTF(notification.c_str());
}
