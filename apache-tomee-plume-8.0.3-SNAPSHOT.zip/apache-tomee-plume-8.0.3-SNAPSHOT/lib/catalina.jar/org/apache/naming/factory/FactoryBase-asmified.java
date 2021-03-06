package asm.org.apache.naming.factory;
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
public class FactoryBaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/naming/factory/FactoryBase", null, "java/lang/Object", new String[] { "javax/naming/spi/ObjectFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/naming/StringManager;", null, null);
fieldVisitor.visitEnd();
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getObjectInstance", "(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable<**>;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/factory/FactoryBase", "isReferenceTypeSupported", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/naming/Reference");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/factory/FactoryBase", "getLinked", "(Ljavax/naming/Reference;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/naming/Reference", "java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("factory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/Reference", "get", "(Ljava/lang/String;)Ljavax/naming/RefAddr;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/RefAddr", "getContent", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/naming/factory/FactoryBase", "java/lang/Object", "javax/naming/Name", "javax/naming/Context", "java/util/Hashtable", "javax/naming/Reference", "java/lang/Object", "javax/naming/spi/ObjectFactory", "javax/naming/RefAddr", "java/lang/String", "java/lang/ClassLoader", "java/lang/Class"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "javax/naming/NamingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/naming/factory/FactoryBase", "sm", "Lorg/apache/naming/StringManager;");
methodVisitor.visitLdcInsn("factoryBase.factoryClassError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/NamingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/NamingException", "initCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/naming/spi/ObjectFactory");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label4);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/naming/NamingException");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/naming/NamingException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/ThreadDeath");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ThreadDeath");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/VirtualMachineError");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/VirtualMachineError");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/naming/NamingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/naming/factory/FactoryBase", "sm", "Lorg/apache/naming/StringManager;");
methodVisitor.visitLdcInsn("factoryBase.factoryCreationError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/NamingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/naming/NamingException", "initCause", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/naming/factory/FactoryBase", "java/lang/Object", "javax/naming/Name", "javax/naming/Context", "java/util/Hashtable", "javax/naming/Reference", "java/lang/Object", "javax/naming/spi/ObjectFactory", "javax/naming/RefAddr"}, 0, new Object[] {});
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/factory/FactoryBase", "getDefaultFactory", "(Ljavax/naming/Reference;)Ljavax/naming/spi/ObjectFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/naming/spi/ObjectFactory", "getObjectInstance", "(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/naming/NamingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/naming/factory/FactoryBase", "sm", "Lorg/apache/naming/StringManager;");
methodVisitor.visitLdcInsn("factoryBase.instanceCreationError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/naming/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/naming/NamingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/naming/factory/FactoryBase", "java/lang/Object", "javax/naming/Name", "javax/naming/Context", "java/util/Hashtable"}, 0, new Object[] {});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "isReferenceTypeSupported", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getDefaultFactory", "(Ljavax/naming/Reference;)Ljavax/naming/spi/ObjectFactory;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getLinked", "(Ljavax/naming/Reference;)Ljava/lang/Object;", null, new String[] { "javax/naming/NamingException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/naming/factory/FactoryBase;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/naming/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/naming/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/naming/factory/FactoryBase", "sm", "Lorg/apache/naming/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
