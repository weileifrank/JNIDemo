/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_bupin_jnidemo_JniUtil */

#ifndef _Included_com_bupin_jnidemo_JniUtil
#define _Included_com_bupin_jnidemo_JniUtil
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_bupin_jnidemo_JniUtil
 * Method:    helloFromC
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_bupin_jnidemo_JniUtil_helloFromC
  (JNIEnv *, jobject);

/*
 * Class:     com_bupin_jnidemo_JniUtil
 * Method:    testInt
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_bupin_jnidemo_JniUtil_testInt
  (JNIEnv *, jobject, jint, jint);

/*
 * Class:     com_bupin_jnidemo_JniUtil
 * Method:    testBoolean
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_com_bupin_jnidemo_JniUtil_testBoolean
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     com_bupin_jnidemo_JniUtil
 * Method:    testString
 * Signature: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_bupin_jnidemo_JniUtil_testString
  (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     com_bupin_jnidemo_JniUtil
 * Method:    testArray
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_com_bupin_jnidemo_JniUtil_testArray
  (JNIEnv *, jobject, jintArray);

#ifdef __cplusplus
}
#endif
#endif
