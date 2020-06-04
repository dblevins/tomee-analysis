package asm.org.apache.myfaces.spi.impl;
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
public class DefaultResourceLibraryContractsProviderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", null, "org/apache/myfaces/spi/ResourceLibraryContractsProviderFactory", null);

classWriter.visitInnerClass("org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTRACTS_PROVIDER", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTRACTS_PROVIDER_LIST", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/ResourceLibraryContractsProviderFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getLogger", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResourceLibraryContractsProvider", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/NoClassDefFoundError");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/lang/InstantiationException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "java/lang/IllegalAccessException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label6, "java/lang/reflect/InvocationTargetException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label7, "java/security/PrivilegedActionException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory$1", "<init>", "(Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;Ljavax/faces/context/ExternalContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/ResourceLibraryContractsProvider");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/myfaces/spi/ResourceLibraryContractsProvider", "javax/faces/context/ExternalContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "resolveResourceLibraryContractsProviderFromService", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoClassDefFoundError"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InstantiationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalAccessException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/reflect/InvocationTargetException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "resolveResourceLibraryContractsProviderFromService", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", null, new String[] { "java/lang/ClassNotFoundException", "java/lang/NoClassDefFoundError", "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/security/PrivilegedActionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "CONTRACTS_PROVIDER_LIST", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/spi/ServiceProviderFinderFactory", "getServiceProviderFinder", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ServiceProviderFinder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "CONTRACTS_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/spi/ServiceProviderFinder", "getServiceProviderList", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "CONTRACTS_PROVIDER_LIST", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/resource/DefaultResourceLibraryContractsProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/resource/DefaultResourceLibraryContractsProvider", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "buildApplicationObject", "(Ljava/lang/Class;Ljava/util/Collection;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/spi/ResourceLibraryContractsProvider");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory;Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", null, new String[] { "java/lang/ClassNotFoundException", "java/lang/NoClassDefFoundError", "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/security/PrivilegedActionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "resolveResourceLibraryContractsProviderFromService", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "CONTRACTS_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/spi/ResourceLibraryContractsProvider;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".LIST");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/spi/impl/DefaultResourceLibraryContractsProviderFactory", "CONTRACTS_PROVIDER_LIST", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
