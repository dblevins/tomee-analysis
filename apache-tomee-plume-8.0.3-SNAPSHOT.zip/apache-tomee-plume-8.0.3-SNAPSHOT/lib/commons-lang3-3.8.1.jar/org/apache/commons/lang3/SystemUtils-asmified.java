package asm.org.apache.commons.lang3;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SystemUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/lang3/SystemUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "OS_NAME_WINDOWS_PREFIX", "Ljava/lang/String;", null, "Windows");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "USER_HOME_KEY", "Ljava/lang/String;", null, "user.home");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "USER_DIR_KEY", "Ljava/lang/String;", null, "user.dir");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JAVA_IO_TMPDIR_KEY", "Ljava/lang/String;", null, "java.io.tmpdir");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JAVA_HOME_KEY", "Ljava/lang/String;", null, "java.home");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AWT_TOOLKIT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILE_ENCODING", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "FILE_SEPARATOR", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_AWT_FONTS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_AWT_GRAPHICSENV", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_AWT_HEADLESS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_AWT_PRINTERJOB", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_CLASS_PATH", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_CLASS_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_COMPILER", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_ENDORSED_DIRS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_EXT_DIRS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_HOME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_TMPDIR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LIBRARY_PATH", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_RUNTIME_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_RUNTIME_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_SPECIFICATION_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_SPECIFICATION_VENDOR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_SPECIFICATION_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JAVA_SPECIFICATION_VERSION_AS_ENUM", "Lorg/apache/commons/lang3/JavaVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_PREFS_PREFERENCES_FACTORY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VENDOR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VENDOR_URL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_INFO", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_SPECIFICATION_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_SPECIFICATION_VENDOR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_SPECIFICATION_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_VENDOR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_VM_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "LINE_SEPARATOR", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OS_ARCH", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OS_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OS_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "PATH_SEPARATOR", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_COUNTRY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_DIR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_HOME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_LANGUAGE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER_TIMEZONE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_1", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_2", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_3", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_4", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_5", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_6", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_7", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_1_8", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "IS_JAVA_1_9", "Z", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_9", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_10", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_JAVA_11", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_AIX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_HP_UX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_400", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_IRIX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_LINUX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_CHEETAH", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_PUMA", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_JAGUAR", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_PANTHER", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_TIGER", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_LEOPARD", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_SNOW_LEOPARD", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_LION", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_MOUNTAIN_LION", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_MAVERICKS", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_YOSEMITE", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_MAC_OSX_EL_CAPITAN", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_FREE_BSD", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_OPEN_BSD", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_NET_BSD", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_OS2", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_SOLARIS", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_SUN_OS", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_UNIX", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_2000", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_2003", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_2008", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_2012", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_95", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_98", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_ME", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_NT", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_XP", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_VISTA", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_7", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_8", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_WINDOWS_10", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_OS_ZOS", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getJavaHome", "()Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getHostName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("COMPUTERNAME");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("HOSTNAME");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getJavaIoTmpDir", "()Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java.io.tmpdir");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getJavaVersionMatches", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VERSION", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "isJavaVersionMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_NAME", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_VERSION", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "isOSMatch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getOsMatchesName", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_NAME", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "isOSNameMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/SecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getEnvironmentVariable", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/SecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/lang/String", "java/lang/String"}, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getUserDir", "()Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("user.dir");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getUserHome", "()Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("user.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isJavaAwtHeadless", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_AWT_HEADLESS", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isJavaVersionAtLeast", "(Lorg/apache/commons/lang3/JavaVersion;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VERSION_AS_ENUM", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/lang3/JavaVersion", "atLeast", "(Lorg/apache/commons/lang3/JavaVersion;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "isJavaVersionMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "isOSMatch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "isOSNameMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "isOSVersionMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "isOSNameMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "isOSVersionMatch", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/StringUtils", "isEmpty", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\\.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\\.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/String;", "[Ljava/lang/String;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("awt.toolkit");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "AWT_TOOLKIT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("file.encoding");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "FILE_ENCODING", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("file.separator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "FILE_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.awt.fonts");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_AWT_FONTS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.awt.graphicsenv");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_AWT_GRAPHICSENV", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.awt.headless");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_AWT_HEADLESS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.awt.printerjob");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_AWT_PRINTERJOB", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.class.path");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_CLASS_PATH", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.class.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_CLASS_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.compiler");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_COMPILER", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.endorsed.dirs");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_ENDORSED_DIRS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.ext.dirs");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_EXT_DIRS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_HOME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.io.tmpdir");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_IO_TMPDIR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.library.path");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_LIBRARY_PATH", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.runtime.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_RUNTIME_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.runtime.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_RUNTIME_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.specification.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.specification.vendor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VENDOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.specification.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VERSION", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VERSION", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/JavaVersion", "get", "(Ljava/lang/String;)Lorg/apache/commons/lang3/JavaVersion;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_SPECIFICATION_VERSION_AS_ENUM", "Lorg/apache/commons/lang3/JavaVersion;");
methodVisitor.visitLdcInsn("java.util.prefs.PreferencesFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_UTIL_PREFS_PREFERENCES_FACTORY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vendor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VENDOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vendor.url");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VENDOR_URL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.info");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_INFO", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.specification.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_SPECIFICATION_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.specification.vendor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_SPECIFICATION_VENDOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.specification.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_SPECIFICATION_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.vendor");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_VENDOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("java.vm.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "JAVA_VM_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("line.separator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "LINE_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("os.arch");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_ARCH", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("os.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("os.version");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "OS_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("path.separator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "PATH_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.country");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("user.region");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("user.country");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_COUNTRY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.dir");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_DIR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_HOME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.language");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_LANGUAGE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.name");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("user.timezone");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getSystemProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "USER_TIMEZONE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("1.1");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_1", "Z");
methodVisitor.visitLdcInsn("1.2");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_2", "Z");
methodVisitor.visitLdcInsn("1.3");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_3", "Z");
methodVisitor.visitLdcInsn("1.4");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_4", "Z");
methodVisitor.visitLdcInsn("1.5");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_5", "Z");
methodVisitor.visitLdcInsn("1.6");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_6", "Z");
methodVisitor.visitLdcInsn("1.7");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_7", "Z");
methodVisitor.visitLdcInsn("1.8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_8", "Z");
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_1_9", "Z");
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_9", "Z");
methodVisitor.visitLdcInsn("10");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_10", "Z");
methodVisitor.visitLdcInsn("11");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getJavaVersionMatches", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_JAVA_11", "Z");
methodVisitor.visitLdcInsn("AIX");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_AIX", "Z");
methodVisitor.visitLdcInsn("HP-UX");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_HP_UX", "Z");
methodVisitor.visitLdcInsn("OS/400");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_400", "Z");
methodVisitor.visitLdcInsn("Irix");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_IRIX", "Z");
methodVisitor.visitLdcInsn("Linux");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLdcInsn("LINUX");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_LINUX", "Z");
methodVisitor.visitLdcInsn("Mac");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.0");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_CHEETAH", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.1");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_PUMA", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.2");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_JAGUAR", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.3");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_PANTHER", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.4");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_TIGER", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.5");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_LEOPARD", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.6");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_SNOW_LEOPARD", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.7");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_LION", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_MOUNTAIN_LION", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.9");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_MAVERICKS", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.10");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_YOSEMITE", "Z");
methodVisitor.visitLdcInsn("Mac OS X");
methodVisitor.visitLdcInsn("10.11");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatches", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX_EL_CAPITAN", "Z");
methodVisitor.visitLdcInsn("FreeBSD");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_FREE_BSD", "Z");
methodVisitor.visitLdcInsn("OpenBSD");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_OPEN_BSD", "Z");
methodVisitor.visitLdcInsn("NetBSD");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_NET_BSD", "Z");
methodVisitor.visitLdcInsn("OS/2");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_OS2", "Z");
methodVisitor.visitLdcInsn("Solaris");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_SOLARIS", "Z");
methodVisitor.visitLdcInsn("SunOS");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_SUN_OS", "Z");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_AIX", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_HP_UX", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_IRIX", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_LINUX", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_MAC_OSX", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_SOLARIS", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_SUN_OS", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_FREE_BSD", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_OPEN_BSD", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_NET_BSD", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_UNIX", "Z");
methodVisitor.visitLdcInsn("Windows");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS", "Z");
methodVisitor.visitLdcInsn("Windows 2000");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_2000", "Z");
methodVisitor.visitLdcInsn("Windows 2003");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_2003", "Z");
methodVisitor.visitLdcInsn("Windows Server 2008");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_2008", "Z");
methodVisitor.visitLdcInsn("Windows Server 2012");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_2012", "Z");
methodVisitor.visitLdcInsn("Windows 95");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_95", "Z");
methodVisitor.visitLdcInsn("Windows 98");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_98", "Z");
methodVisitor.visitLdcInsn("Windows Me");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_ME", "Z");
methodVisitor.visitLdcInsn("Windows NT");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_NT", "Z");
methodVisitor.visitLdcInsn("Windows XP");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_XP", "Z");
methodVisitor.visitLdcInsn("Windows Vista");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_VISTA", "Z");
methodVisitor.visitLdcInsn("Windows 7");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_7", "Z");
methodVisitor.visitLdcInsn("Windows 8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_8", "Z");
methodVisitor.visitLdcInsn("Windows 10");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_WINDOWS_10", "Z");
methodVisitor.visitLdcInsn("z/OS");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/SystemUtils", "getOsMatchesName", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/SystemUtils", "IS_OS_ZOS", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
