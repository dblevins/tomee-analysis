package asm.org.apache.myfaces.config.annotation;
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
public class DefaultLifecycleProviderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", null, "org/apache/myfaces/config/annotation/LifecycleProviderFactory", null);

classWriter.visitInnerClass("org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "log", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIFECYCLE_PROVIDER", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/LifecycleProviderFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLifecycleProvider", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/config/annotation/LifecycleProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("No ExternalContext using fallback LifecycleProvider.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "resolveFallbackLifecycleProvider", "()Lorg/apache/myfaces/config/annotation/LifecycleProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/myfaces/config/annotation/LifecycleProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/config/annotation/LifecycleProvider");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "resolveLifecycleProviderFromExternalContext", "(Ljakarta/faces/context/ExternalContext;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "resolveLifecycleProviderFromService", "(Ljakarta/faces/context/ExternalContext;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "resolveFallbackLifecycleProvider", "()Lorg/apache/myfaces/config/annotation/LifecycleProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/config/annotation/LifecycleProvider");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/config/annotation/LifecycleProvider");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Using LifecycleProvider ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resolveLifecycleProviderFromExternalContext", "(Ljakarta/faces/context/ExternalContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/InstantiationException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/lang/IllegalAccessException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "createClass", "(Ljava/lang/String;Ljakarta/faces/context/ExternalContext;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/myfaces/config/annotation/LifecycleProvider");
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InstantiationException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resolveLifecycleProviderFromService", "(Ljakarta/faces/context/ExternalContext;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/ClassNotFoundException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "java/lang/NoClassDefFoundError");
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoClassDefFoundError");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label6, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label3, label4, label6, "java/lang/InstantiationException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label7, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label3, label4, label7, "java/lang/IllegalAccessException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label8, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitTryCatchBlock(label3, label4, label8, "java/lang/reflect/InvocationTargetException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label9, "java/security/PrivilegedActionException");
methodVisitor.visitTryCatchBlock(label3, label4, label9, "java/security/PrivilegedActionException");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory$1", "<init>", "(Lorg/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory;Ljakarta/faces/context/ExternalContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "jakarta/faces/context/ExternalContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/spi/ServiceProviderFinderFactory", "getServiceProviderFinder", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ServiceProviderFinder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/ServiceProviderFinder", "getServiceProviderList", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "createClass", "(Ljava/lang/String;Ljakarta/faces/context/ExternalContext;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/config/annotation/DiscoverableLifecycleProvider;"));
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/config/annotation/DiscoverableLifecycleProvider");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/myfaces/config/annotation/DiscoverableLifecycleProvider", "isAvailable", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoClassDefFoundError"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InstantiationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createClass", "(Ljava/lang/String;Ljakarta/faces/context/ExternalContext;)Ljava/lang/Object;", null, new String[] { "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "classForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/context/ExternalContext;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "newInstance", "(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "java/lang/String", "jakarta/faces/context/ExternalContext", "java/lang/Class"}, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resolveFallbackLifecycleProvider", "()Lorg/apache/myfaces/config/annotation/LifecycleProvider;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassNotFoundException");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label4, label7, "javax/naming/NamingException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label5, label8, label7, "javax/naming/NamingException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label6, label4, label9, "java/lang/NoClassDefFoundError");
methodVisitor.visitTryCatchBlock(label5, label8, label9, "java/lang/NoClassDefFoundError");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("jakarta.annotation.PreDestroy");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "classForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/NoAnnotationLifecyleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/NoAnnotationLifecyleProvider", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/naming/InitialContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/InitialContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn("jakarta.ejb.EJB");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "classForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/AllAnnotationLifecycleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/AllAnnotationLifecycleProvider", "<init>", "(Ljavax/naming/Context;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "javax/naming/Context"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/ResourceAnnotationLifecycleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/ResourceAnnotationLifecycleProvider", "<init>", "(Ljavax/naming/Context;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory"}, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("No InitialContext found. Using NoInjectionAnnotationProcessor.");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/NoInjectionAnnotationLifecycleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/NoInjectionAnnotationLifecycleProvider", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoClassDefFoundError"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("No InitialContext class definition found. Using NoInjectionAnnotationProcessor.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/config/annotation/NoInjectionAnnotationLifecycleProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/NoInjectionAnnotationLifecycleProvider", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory;Ljava/lang/String;Ljakarta/faces/context/ExternalContext;)Ljava/lang/Object;", null, new String[] { "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "createClass", "(Ljava/lang/String;Ljakarta/faces/context/ExternalContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/config/annotation/LifecycleProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".LIFECYCLE_PROVIDER_INSTANCE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER_INSTANCE_KEY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/config/annotation/LifecycleProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/config/annotation/DefaultLifecycleProviderFactory", "LIFECYCLE_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
